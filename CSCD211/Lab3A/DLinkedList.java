// *************************************************************************************
//
// Name:        Hunter T.
// Date:        February 4, 2021
// Class:       CSCD 211
// Description: A recreation (of sort) of the already existing LinkedList class in Java.
//
// *************************************************************************************

import java.lang.*;

/** The DLinkedList class implements a doubly Linked list. */
class DLinkedList {
    private Node first;  // First element in the list.
    private Node last;   // Last element in the list.

    /** Constructor. */
    public DLinkedList() { }

    /** The Node class stores a list element and a reference to the next node. */
    private class Node {
        String element;  // The element in the list.
        Node   next;     // Next element in the list.
        Node   prev;     // Previous element in the list.

        /**
         * Constructor.
         *
         * @param elem The element to be stored in the node.
         * @param n    The reference to the successor node.
         * @param p    The reference to the predecessor node.
         */
        Node(String elem, Node n, Node p) {
            element = elem;
            next    = n;
            prev    = p;
        }

        /**
         * Constructor.
         *
         * @param val The element to be stored in the node.
         */
        Node(String val) { this(val, null, null); }
    }

    /**
     * The isEmpty method checks to see if the list is empty.
     *
     * @return True if list is empty, false otherwise.
     */
    public boolean isEmpty() { return first == null; }

    /**
     * The size method returns the length of the list.
     *
     * @return The number of elements in the list.
     */
    public int size() {
        int  count = 0;
        Node p     = first;

        // Null marks the end of the list.
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    /**
     * The add method adds to the end of the list.
     *
     * @param e The element to add.
     */
    public void add(String e) {
        if (isEmpty()) {  // Add to an empty list.
            first = new Node(e);
            last  = first;
        } else {  // Add to end of existing list
            last.next = new Node(e);
            last      = last.next;
        }
    }

    /**
     * Adds an element at a specified index.
     *
     * @param e     The element to add to the list.
     * @param index The index at which to add.
     *
     * @throws IndexOutOfBoundsException When the index is out of bounds.
     */
    public void add(int index, String e) {
        Node pred;

        if (index < 0 || index > size()) { throw new IndexOutOfBoundsException(); }

        // New element is placed at the beginning
        if (index == 0) {
            first = new Node(e, first, null);
            if (last == null) { last = first; }
            return;
        }

        // Sets pred to node, which will be the predecessor of the new node.
        pred = first;
        for (int i = 1; i < index; i++) { pred = pred.next; }
        // Adds new node containing the element.
        pred.next = new Node(e, pred.next, pred);
        // If the last element changed.
        if (pred.next.next == null) { last = pred.next; }
    }

    /**
     * The toString method computes the string representation of the list.
     *
     * @return The string representation of the linked list.
     */
    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        Node          p          = first;

        // Null marks the end of the list.
        while (p != null) {
            strBuilder.append(p.element).append("\n");
            p = p.next;
        }
        return strBuilder.toString();
    }

    /**
     * Removes an element at a given position, from the list.
     *
     * @param index The position of the element to remove.
     *
     * @exception IndexOutOfBoundsException When index is out of bounds.
     */
    public void remove(int index) {
        Node previous = first, current;

        if (index < 0 || index >= size()) { throw new IndexOutOfBoundsException(); }

        // Remove first element.
        if (index == 0) {
            first = first.next;
            // If there was only one element in list.
            if (first == null) { last = null; }
            return;
        }

        for (int k = 1; k < index; k++) { previous = previous.next; }

        current       = previous.next;
        previous.next = current.next;
    }

    /*
    // I could not figure out how to get this to work
    /**
     * Locates the index at which a given string is located inside the list.
     *
     * @param element The element to remove.
     * @return true   If the element was removed, false otherwise.
     */
    /*public void remove(String element) {
        int  index, i;
        Node current = first;

        for (i = 0; i < size() - 1; i++) {
            if (element.contentEquals(String.valueOf(current))) {
                index = i;
                remove(index);
                return;
            }
            current = current.next;
            System.out.println(current.getValue());
        }

        //throw new InvalidParameterException(element + " does not exist in list");
    }*/

    public static void main(String[] args) {
        DLinkedList ll = new DLinkedList();
        ll.add("Amy");
        ll.add("Bob");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add("Larry");
        ll.add("Carol");
        ll.remove(4);

        System.out.println("The elements of the list are:");
        System.out.println(ll.toString());
    }
}
