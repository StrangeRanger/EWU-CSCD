import java.util.LinkedList;

public class Hashtable {
    /* [ Nested Class ] ************************************************************* */

    private class HashtableRecord {
        private Object key;
        private Object value;

        public HashtableRecord() {
            this.key   = null;
            this.value = null;
        }

        public HashtableRecord(Object inKey, Object inData) {
            this.key   = inKey;
            this.value = inData;
        }

        /* Equality can be based on key alone because there can't be
         * 2 records with the same key in the table */
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HashtableRecord) {
                HashtableRecord node = (HashtableRecord) obj;
                return this.key.equals(node.key);
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return "Key: [" + this.key + "] Value: [" + this.value + "]";
        }
    }

    /* [ Hashtable Class Code ] ***************************************************** */

    private final int tableSize = 101;
    private Object[] table;
    private int numElements;

    /** Constructor. */
    public Hashtable(int realSize) {
        this.table       = new Object[realSize];
        this.numElements = 0;
    }

    /** Second constructor. */
    public Hashtable() {
        this.table       = new Object[this.tableSize];
        this.numElements = 0;
    }

    /**
     * Generate "hash" or number which will be the location at which a key value pair
     * will be saved to inside the table/array.
     */
    private int hash(Object key) {
        // Start with a hard coded base (being variable 'result'), just so that it's not
        // 0 for empty strings.
        int    result      = 42;
        String inputString = key.toString().toLowerCase();
        char[] characters  = inputString.toCharArray();
        // Uncomment the line below for debugging purposes.
        // System.out.println("hash string is: " + inputString + "\n");

        for (char currentChar : characters) {
            result += (int) currentChar;
        }

        return (result % table.length);
    }

    /** Place a key and value pair, inside the hashtable. */
    public void put(Object key, Object data) {
        if (data == null || key == null) {
            System.err.println("ERROR: Either the key or the data are null");
            return;
        }

        /* If trying to add duplicate keys, that means we want to update the value
         * associated with that existing key. We first delete the existing mapping, then
         * insert a new record that key.
         */
        if (this.contains(key)) { remove(key); }
        // Find out where, in our array, the new item should go.
        int pos = this.hash(key);
        // If nothing exists in the position, create a new linked list there.
        if (this.table[pos] == null) { this.table[pos] = new LinkedList<HashtableRecord>(); }

        LinkedList<HashtableRecord> theList = (LinkedList<HashtableRecord>) this.table[pos];
        // Add to the linked list in the appropriate position.
        theList.add(new HashtableRecord(key, data));
        this.numElements++;
    }

    /** Alternative put method. */
    public void put(Object[] keys, Object[] inputData) {
        for (int i = 0; i < inputData.length; i++) {
            this.put(keys[i], inputData[i]);
        }
    }

    /** Get the value of a specified key. */
    public Object get(Object key) {
        int pos = this.hash(key);

        if (this.table[pos] != null) {
            /// Create a new hashtable record and add the 'key' to the record, to use
            /// the equals() method in HashtableNode.
            HashtableRecord node = new HashtableRecord();
            node.key             = key;
            // Create a linked list from items at 'pos' inside of 'table'.
            LinkedList<HashtableRecord> theList =
                    (LinkedList<HashtableRecord>) this.table[pos];

            for (HashtableRecord hashtableRecord : theList) {
                if (hashtableRecord.key.equals(key)) { return hashtableRecord.value; }
            }
        }

        return null;
    }

    /** Remove a key and value pair from the hashtable. */
    public void remove(Object key) {
        int pos = this.hash(key);

        if (this.table[pos] != null) {
            /// Create a new hashtable record and add the 'key' to the record, to use
            /// the equals() method in HashtableNode.
            HashtableRecord node = new HashtableRecord();
            node.key             = key;
            // Create a linked list from items at 'pos' inside of 'table'.
            LinkedList<HashtableRecord> theList =
                    (LinkedList<HashtableRecord>) this.table[pos];

            boolean removed = theList.remove(node);
            if (theList.size() == 0) this.table[pos] = null;
            if (removed) this.numElements--;
        }
    }

    /** Alternative remove method. */
    public void remove(Object[] keys) {
        for (Object key : keys) {
            this.remove(key);
        }
    }

    /** Returns 'numElements'. */
    public int getNumElements() {
        return this.numElements;
    }

    /** Checks if a given key exists in hashtable. */
    public boolean contains(Object key) {
        boolean result = false;
        int     hash   = this.hash(key);

        if (this.table[hash] != null) {
            HashtableRecord node = new HashtableRecord();
            node.key             = key;
            if (((LinkedList<HashtableRecord>) this.table[hash]).indexOf(node) > -1) {
                result = true;
            }
        }
        return result;
    }

    /** toString method. */
    public String toString() {
        String buffer = "";

        buffer += "{\n";
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[i] != null) { buffer = buffer + "\t" + this.table[i] + "\n"; }
        }
        buffer += "}";
        return buffer;
    }

    /** Main method. */
    public static void main(String[] argv) {
        Hashtable myHash = new Hashtable();

        // Test of strings
        System.out.println("Initial hash table is: \n" + myHash);
        myHash.put("smith", 30);
        myHash.put("john", 10);
        System.out.println("After two adds, hashtalbe is: \n" + myHash);
        myHash.put("green", 10);
        // This will be added successfully, updating existing record.
        myHash.put("green", 60);
        System.out.println("After four adds, hashtalbe is: \n" + myHash);

        myHash.remove("green");
        System.out.println("After remove green, hashtalbe is: \n" + myHash);
    }
}
