package datastructrue.linkedlist.test;

public class NodeV1 {
    /*
       *  단방향 연결 리스트는 데이터와 다음 노드의 주소의 참조를 가지고 있음
       *  int data == 데이터
       *  next == 다음 노드의 주소 참조 값
       *  마지막 노드는 아무것도 참조하지 않기 때문에 null로 시작.
    */
    int data;
    NodeV1 next = null;

    public NodeV1(int data) {
        /*
        * 생성자로 데이터 생성
        * */
        this.data = data;
    }


    public void append(int data) {
        //TODO: 데이터를 담은 새로운 Node객체 생성
        NodeV1 node = new NodeV1(data);
        // TODO: n은 현재 index를 의미 (포인터 생성)
        // 추측으로 이렇게 생성하면 첫 번쨰 값은 무조건 null임.
        NodeV1 n = this;
        // TODO: 연결 리스트는 마지막 값 이전까지 실직적인 데이터를 가진 노드들이기 때문에 null값 전까지 순회
        while(n.next != null) {
            // TODO: 다음 노드의 참조값을 현재 index에 할당
            /* 현재 처리하는건 다음 노드에 새로운 노드를 생성하는 과정*/
            n = n.next;
            System.out.println("반복문 실행 ");
        }
        // TODO: 현재 노드( 여기서 n에 할당되어 있는 참조값은 다음 노드의 참조 값)에 새로 생성한 node객체 추가
        n.next = node;
        System.out.println(n.next);
    }

    public void delete(int d) {
        // TODO: this로 포인터 생성
        NodeV1 n = this;
        // TODO: null전 까지 순회
        while(n.next != null) {
            if(n.next.data == d) {
                // TODO: 다음 노드가 인자의 값과 같다면
                n.next = n.next.next;
                // TODO: 현재 index의 다음,다음의 노드의 값을 현재 index에 저장
                // TODO  [] -> [삭제 예정 노드] -> <-[삭제 예정 노드에 값읠 덮어씌움]
            } else {
                n = n.next;
            }
        }
    }

    public void get() {
        NodeV1 n = this;
        while(n.next != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
