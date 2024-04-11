package datastructrue.linkedlist.test;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> {

    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        private static int count;
        private int index;


        public Node(T data) {
            this.data = data;
            this.index = count;
            count++;
        }

    }

    private Node<T> header;
    private Node<T> tail;


    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (isHeaderNull()) {
            header = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    public void prepend(T data) {
        Node<T> node = new Node<>(data);

        if (isHeaderNull()) {
            header = node;
            tail = node;
        } else {
            node.next = header;
            header.prev = node;
            header = node;
        }
    }

    public void insertAfter(int index, T data) {
        Node<T> node = new Node<>(data);

        Node<T> midElement = findIndex(index);
        Node<T> firstElement = midElement.prev;

        node.next = midElement;
        node.prev = firstElement;

        firstElement.next = node;
        midElement.prev = node;
    }

    public void bubbleSort() {
        int size = size();

        for (int i = 0; i < size; i++) {
            Node<T> current = header;
            for (int j = 0; j < (size - i -1); j++) {
                if (current.index > current.next.index) {
                    int index = current.index;
                    current.index = current.next.index;
                    current.next.index = index;
                }
                current = current.next;
            }
        }
    }

    public void indexLoop () {
        Node<T> current = header;
        while (current != null) {
            System.out.println(current.index);
            current = current.next;
        }
    }


    public int size() {
        Node<T> current = header;

        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    public void iterator() {
        Node<T> current = header;

        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
    }

    public Node<T> findIndex (int index) {
        Node<T> current = header;

        while (current != null) {
            if (current.index == index) {
                return current;
            }
            current = current.next;
        }
        throw new NoSuchElementException();
    }

    public void reverseIterator() {
        Node<T> current = tail;

        while(current != null) {
            System.out.print(current.data + " ->");
            current = current.prev;
        }
    }


    public T getFirst() {
        if (isEmpty(header)) {
            throw new NoSuchElementException();
        }
        return header.data;
    }

    public T getLast() {
        if (isEmpty(tail)) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }


    private Boolean isEmpty(Node<T> node) {
        return node == null;
    }

    private boolean isHeaderNull () {
        return header == null;
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.insertAfter(2,10);
        list.iterator();


        int[] arr = {3,4,5,7,8,1,10,2};

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1] ) {
                    int item = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = item;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // 버블 정렬로 인덱스 정렬해보기

        int size = list.size();
        list.bubbleSort();
        list.indexLoop();

    }
}