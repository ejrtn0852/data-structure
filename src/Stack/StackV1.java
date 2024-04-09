package Stack;

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

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
    }


    public void get() {
        Node<T> newNode = top;
        while(newNode != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
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
        return  item;
    }


    public boolean isEmpty() {
        return top == null;
    }





}
