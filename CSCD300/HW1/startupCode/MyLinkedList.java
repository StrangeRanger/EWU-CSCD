/**
 * Author:      Hunter T.
 * Description: Mimics the built-in LinkedList provided by java.
 */
public class MyLinkedList {
    private ListNode head;
    private int      size;

    /** Inner class for ListNode. */
    private class ListNode {
        private Object   data;
        private ListNode next;

        /** Class constructor. */
        private ListNode(Object d) {
            this.data = d;
            this.next = null;
        }
    }

    /** Class constructor. */
    public MyLinkedList() {
        this.head = new ListNode(null);  // With a dummy head node.
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Add Object e to start of this LinkedList.
     *
     * Please DO NOT change this addFirst() method. You must keep and include this
     * provided addFirst() method in your source code.
     */
    public void addFirst(Object e) {
        ListNode node = new ListNode(e);
        node.next     = head.next;
        head.next     = node;
        size++;
    }

    /**
     * Remove(cut out) the first data node(the node succeeding the dummy node) in this
     * list, then returns the data in the node removed. If the size of this list is
     * zero, throws an Exception.
     */
    public Object removeFirst() throws Exception {
        if (isEmpty()) { throw new Exception("LinkedList is empty!"); }

        ListNode previous = head, current = head.next;

        previous.next = current.next;
        size--;
        return current.data;
    }

    /**
     * Returns true if this list contains the specified element o. More formally,
     * returns true if and only if this list contains at least one element e such that
     * (o==null ? e==null : o.equals(e)).
     *
     * Note: you have to handle the case where a list node stores null data element.
     */
    public boolean contains(Object o) {
        for (ListNode current = head.next; current != null; current = current.next) {
            if (current.data == o) { return true; }
        }
        return false;
    }

    /**
     * Removes the first occurrence of the specified element o from this list and
     * returns true, if it is present. If this list does not contain the element o, it
     * is unchanged and the method returns false. More formally, removes the element o
     * with the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))) (if
     * such an element exists).
     *
     * Note: you have to handle the case where a list node stores null data element.
     */
    public boolean remove(Object o) {
        for (ListNode previous = head, current = head.next; current != null;
             previous = current, current = current.next) {
            if (current.data == o) {
                previous.next = current.next;
                size--;
                return true;
            }
        }
        return false;
    }

    /**
     * Removes all copies of o from this linked list.
     * You have to handle the cases where Object o may have zero, one or multiple copies
     * in this list. If any element has been removed from this list, returns true.
     * Otherwise, returns false.
     *
     * Note: be careful when multiple copies of Object o are stored in
     * consecutive(adjacent) list nodes. E.g. []->["A"]->["A"]->["B"]. Be careful when
     * removing all "A"s in this example.
     *
     * Note: This list may contain zero, one or multiple copies of null data elements.
     */
    public boolean removeAllCopies(Object o) {  // passed test
        ListNode previous = head, current = head.next;

        while (previous.next != null) {
            if (current.data == o) {
                if (current.next == null) {
                    previous.next = null;
                } else {
                    previous.next = current.next;
                    current       = current.next;
                }
                size--;
                continue;
            }
            previous = current;
            current  = current.next;
        }

        return false;
    }

    /**
     * Insert data elements from linkedlist A and B alternately into a new linkedlist C,
     * then returns C. Follow the pattern to pick items in list A and B, linkedlist
     * A->linkedlist B->linkedlist A->linkedlist B... If A is longer than B, append
     * remaining items in A to C when the end of B is first reached. If B is longer than
     * A, append remaining items in B to C when the end of A is first reached.
     *
     * E.g1 A = {1, 3, 5, 7, 9} and B = {2, 4, 6}; and C will be {1, 2, 3, 4, 5, 6, 7,
     * 9}.
     *
     * E.g2 A = {1, 3, 5} and B = {2, 4, 6, 8, 10}; and C will be {1, 2, 3, 4, 5, 6, 8,
     * 10}.
     *
     * Note: After this method is called, both list A and B are UNCHANGED.
     */
    public static MyLinkedList interleave(MyLinkedList A, MyLinkedList B) {
        MyLinkedList C           = new MyLinkedList();
        MyLinkedList[] listArray = {A, B};

        for (MyLinkedList myLinkedList : listArray) {
            for (int j = 0; j < myLinkedList.size; j++) {
                C.add(myLinkedList.get(j));
                C.size++;
            }
        }
        return C;
    }

    /**
     * Inserts the specified element at the specified position in this list. Shifts the
     * element currently at that position (if any) and any subsequent elements to the
     * right (adds one to their indices). if(index < 0 or index > this.size), throws
     * IndexOutOfBoundsException.
     *
     * E.g, if this list is [dummy]->["A"]->["B"]->["C"] with size = 3. add(0,D) will
     * result in [dummy]->["D"]->["A"]->["B"]->["C"]. Continuing on the previous add()
     * call, add(1,"E") will change the existing list to
     * [dummy]->["D"]->["E"]->["A"]->["B"]->["C"].
     */
    public void add(int index, Object o) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Provided index is out of bounds!");
        }

        ListNode current = head, newNode = new ListNode(o);

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    /**
     * Returns the element at the specified index in this list.
     *
     * Be noted that the listnode at head.next has index 0 and the last list node has
     * index of size()-1. If index < 0 or index >= this.size, throws
     * IndexOutOfBoundsException.
     */
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Provided index is out of bounds!");
        }

        ListNode current = head.next;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    /**
     * Removes (cuts out) the list node at the specified index in this list.
     *
     * Returns the data element in the node that is removed.
     *
     * Be noted that the list node at head.next has index 0 and the last list node has
     * index of size()-1. If index < 0 or index >= this.size, throws
     * IndexOutOfBoundsException.
     */
    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Passed index is invalid!\n" + index);
        }

        ListNode previous = this.head, current = this.head.next;

        for (int i = 0; i < index; i++) {
            previous = current;
            current  = current.next;
        }

        previous.next = current.next;
        size--;
        return true;
    }

    /**
     * Add the object e to the end of this list. It returns true, after e is
     * successfully added.
     */
    public boolean add(Object e) {
        ListNode current = this.head, newNode = new ListNode(e);

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        size++;
        return true;
    }

    /**
     * Please DO NOT Change the following toString() method!!!
     *
     * You must include the following toString() method in your source code.
     */
    @Override
    public String toString() {
        String result = "{";
        for (ListNode node = this.head.next; node != null; node = node.next) {
            if (node.next != null) result += node.data + "->";
            else result += node.data;
        }
        return result + "}";
    }
}
