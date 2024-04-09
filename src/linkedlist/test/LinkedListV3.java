package linkedlist.test;

public class LinkedListV3 {

    private Node header; // 리스트의 헤더(시작)를 가리키는 노드
    private Node tail;   // 리스트의 마지막 노드를 가리키는 노드

    // 노드를 정의하는 내부 클래스
    private static class Node {
        int data;   // 노드가 저장할 데이터
        Node next;  // 다음 노드를 가리키는 포인터

        // 노드 생성자
        Node(int data) {
            this.data = data;
            this.next = null; // 새 노드의 next는 기본적으로 null
        }
    }

    // 링크드 리스트 생성자
    public LinkedListV3() {
        this.header = null; // 초기에는 헤더와 테일 모두 null
        this.tail = null;
    }

    // 리스트 끝에 데이터를 추가하는 메소드
    public void append(int data) {
        Node newNode = new Node(data); // 새 노드 생성

        if (header == null) {
            // 리스트가 비어있으면, header와 tail 모두 새 노드를 가리킵니다.
            header = newNode;
            tail = newNode;
        } else {
            // 리스트가 비어있지 않으면, 현재 tail의 next를 새 노드로 설정하고, tail을 새 노드로 업데이트합니다.
            tail.next = newNode;
            tail = newNode;
        }
    }

    // 리스트의 모든 요소를 출력하는 메소드
    public void printList() {
        Node current = header;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int get(int index) {
        // index가 0 또는 양수이며 리스트 길이보다 작은지 확인
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }

        Node current = header; // 시작점 설정
        int count = 0; // 현재 노드의 인덱스를 추적
        while (current != null) {
            if (count == index) {
                return current.data; // 찾은 데이터 반환
            }
            count++;
            current = current.next; // 다음 노드로 이동
        }

        // 인덱스가 리스트 길이보다 큰 경우
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }

}