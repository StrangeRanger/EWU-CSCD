public class Queue {
    private class Node {
        Object data;
        Node   next;

        public Node(Object elem) {
            this.data = elem;
            this.next = null;
        }
    }

    protected Node head, tail;
    protected int  size;

    /** Constructor that creates an empty queue. */
    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Return the current queue size.
     *
     * @return The current queue size.
     */
    public int getSize() { return this.size; }

    /**
     * Return true if queue is empty, else return false.
     *
     * @return True if queue is empty, else false.
     */
    public boolean isEmpty() {
        return (head == null) && (tail == null) || this.size == 0;
    }

    /**
     * Add a new node to the front of the queue.
     *
     * @param elem The element to be added.
     */
    public void enqueue(Object elem) {
        Node node = new Node(elem);

        if (size == 0) {
            head = node;
        } else {
            tail.next = node;
        }

        tail = node;
        size++;
    }

    /**
     * Remove the first node in the queue.
     *
     * @return The removed node element.
     * @throws Exception
     */
    public Object dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty.");
        }

        Object tmp = head.data;
        head       = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return tmp;
    }

    public String toString() {
        String s = "";
        s += "(";
        if (! isEmpty()) {
            Node p = this.head;
            do {
                s += p.data;
                if (p != tail)
                    s += ", ";
                p = p.next;
            } while (p != null);
        }
        s += ")";
        return s;
    }
}
