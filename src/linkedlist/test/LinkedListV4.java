package linkedlist.test;

public class LinkedListV4 {

    Node header;
    Node tail;

    public LinkedListV4(){
        header = null;
        tail = null;
    }

    private static class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void append(int data) {
        Node node = new Node(data);
        if(header == null) {
            header = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public int size() {
        int count = 0;
        Node current = header;
        while(current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int get(int index) {
        if(index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node pointer = header;
        int count = 0;
        while(pointer != null) {
            if(count == index) {
                return pointer.data;
            }
            count++;
            pointer = pointer.next;
        }
        throw new IndexOutOfBoundsException();
    }


    public void notBufferSet() {
        Node current = header;
        while(current != null) {
            Node runner = current;
            while(runner.next != null) {
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void getAll() {
        Node pointer = header;
        while(pointer != null) {
            System.out.print(pointer.data);
            System.out.print("->");
            pointer = pointer.next;
        }
    }

    public static void main(String[] args) {

    }

}
