package datastructrue.stack;

import java.util.EmptyStackException;

public class StackV1<T>   {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    private int size;

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
        size++;
    }


    public void get() {
        Node<T> newNode = top;
        while(newNode != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }

    public T peek() {
        if(isEmpty() ) throw new EmptyStackException();
        return top.data;
    }

    public T get(int index) {
        Node<T> current = top;

        int count = 0;
        while (current != null) {
            if (index == count) {
                return current.data;
            } else {
                count++;
                current = current.next;
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public T pop () {
        if(top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        size--;
        return  item;
    }


    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }


}
