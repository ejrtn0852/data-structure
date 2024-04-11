package datastructrue.linkedlist.test;

public class LinkedListV2 {
    private Node header;


    private static class Node {
        private static int count;
        private int index;

        int data;
        Node next = null;

        private Node() {
            index = count;
            count++;
        }
    }

    public LinkedListV2() {
        this.header = new Node();
    }

    public void append(int data) {
        Node end = new Node();
        end.data = data;
        Node n = header;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void delete(int d) {
        Node n = header;
        while(n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    public void get() {
        Node n = header.next;
        while(n.next != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void RemoveDups() {
        Node n = header;

        while(n.next != null) {
            Node r  = n;
            while(r.next != null) {
                if(n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
        get();
    }


}
