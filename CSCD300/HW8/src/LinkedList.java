public class LinkedList {
    private class Node {
        private Object data;
        private Node   next, prev;
        private Node(Object data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private int  size;

    /** Constructor. */
    public LinkedList() {
        this.head      = new Node(null, null, null);
        this.head.next = this.head;
        this.head.prev = this.head;
        this.size      = 0;
    }

    /**
     * Check if the LinkedList is empty.
     *
     * @return True if LinkedList is empty, else false.
     */
    public boolean isNotEmpty() { return this.head != this.head.next; }

    /**
     * Check if the LinkedList is sorted.
     *
     * @return True if the LinkedList is sorted, false else.
     */
    public boolean isSorted() {
        Comparable cur, prev;

        for (Node current = this.head.next.next; current != this.head;
             current      = current.next) {
            cur  = (Comparable) current.data;
            prev = (Comparable) current.prev.data;

            if (cur.compareTo(prev) < 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Return size.
     *
     * @return size.
     */
    public int getSize() { return this.size; }

    /**
     * Retrieve the data from the first node inside the LinkedList.
     *
     * @return The data from the first node inside the LinkedList.
     */
    public Object getFirst() { return this.head.next.data; }

    /**
     * Add Object data to start of this LinkedList.
     *
     * @param data Value to be stored in a specified Node.
     */
    public void addFirst(Object data) {
        Node nextNode       = new Node(data, this.head, this.head.next);
        this.head.next.prev = nextNode;
        this.head.next      = nextNode;
        this.size++;
    }

    /**
     * Insert the piece of data at the end of the LinkedList.
     *
     * @param data Value to be stored in a specified Node.
     */
    public void addLast(Object data) {
        Node current = this.head.prev, newNode;

        newNode           = new Node(data, current, current.next);
        current.next.prev = newNode;
        current.next      = newNode;
        this.size++;
    }

    /** Remove the first node in the LinkedList. */
    private void removeFirst() {
        Node current      = this.head.next;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    /** Merge and sort the LinkedList*/
    public void mergeSort() throws Exception {
        Queue      q       = new Queue();
        Node       current = this.head.next;
        LinkedList newLL   = new LinkedList();

        while (current != this.head) {
            LinkedList newList = new LinkedList();
            newList.addFirst(current.data);
            q.enqueue(newList);
            current = current.next;
        }

        while (q.getSize() > 1) {
            LinkedList subList1 = (LinkedList) q.dequeue();
            LinkedList subList2 = (LinkedList) q.dequeue();
            LinkedList tempList = merge(subList1, subList2);
            q.enqueue(tempList);
        }

        for (int i = 0; i < q.getSize(); i++) {
            newLL.addLast(q.dequeue());
        }

        this.head = newLL.head;
    }

    /**
     * mergeSort helper function.
     *
     * @param A First LinkedList.
     * @param B Second LinkedList.
     *
     * @return A merged version of the two provided LinkedLists.
     */
    public LinkedList merge(LinkedList A, LinkedList B) {
        LinkedList S = new LinkedList();
        Comparable fa, fb;

        while (A.isNotEmpty() && B.isNotEmpty()) {
            fa = (Comparable) A.getFirst();
            fb = (Comparable) B.getFirst();

            if (fa.compareTo(fb) < 0) {
                A.removeFirst();
                S.addLast(fa);
            } else {
                B.removeFirst();
                S.addLast(fb);
            }
        }

        while (A.isNotEmpty()) {
            fa = (Comparable) A.getFirst();
            S.addLast(fa);
            A.removeFirst();
        }

        while (B.isNotEmpty()) {
            fb = (Comparable) B.getFirst();
            S.addLast(fb);
            B.removeFirst();
        }

        return S;
    }

    /** insertionSort method. */
    public void insertionSort() {
        for (Node lastSorted = this.head.next; lastSorted.next != this.head;
             lastSorted      = lastSorted.next) {
            Comparable firstUnsortedData = (Comparable) lastSorted.next.data;
            Node       sortedWalker;

            for (sortedWalker = lastSorted;
                 sortedWalker != this.head &&
                 firstUnsortedData.compareTo(sortedWalker.data) < 0;
                 sortedWalker = sortedWalker.prev) {
                sortedWalker.next.data = sortedWalker.data;
            }

            sortedWalker.next.data = firstUnsortedData;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (Node node = this.head.next; node != this.head; node = node.next) {
            if (node.next != this.head)
                result.append(node.data).append("->");
            else
                result.append(node.data);
        }
        return result + "}";
    }
}
