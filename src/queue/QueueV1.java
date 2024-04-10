package queue;

import java.util.NoSuchElementException;

public class QueueV1<T> {

    private class Node<T> {
        private T data;
        private Node<T> next;


        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;


    public void add(T data) {
        Node<T> n = new Node<>(data);

        if(last != null) {
            last.next = n;
        }
        last = n;

        if (first == null) {
            first = n;
        }
    }

    public void get() {
        Node<T> current = first;
        while(current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }


    public void dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        first = first.next;
        if (first == null) {
            last = null;
        }
    }
    public boolean isEmpty() {
        return first.next == null;
    }

    public void isNull() {
        if (first == null) {
            last = null;
        }
    }

}
