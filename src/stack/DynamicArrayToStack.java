package stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class DynamicArrayToStack<T> {

    private int capacity;
    private int size;
    private T[] arr;

    public DynamicArrayToStack() {
        this.capacity = 1; // 배열의 초기 용량 설정
        this.size = 0;     // 스택에 현재 저장된 요소의 수 초기화
        this.arr = (T[]) new Object[capacity];
    }

    public void push(T item) {
        if(isFullSize()) sizeUp();
        arr[size] = item;
        size++;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return arr[size -1];
    }

    public T pop () {
        T item = arr[size - 1];
        arr[size -1] = null;
        size--;
        return item;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    private boolean isFullSize() {
        return size >= capacity;
    }

    private void sizeUp() {
        capacity *= 2;
        this.arr = Arrays.copyOf(arr, capacity);
    };


    public static void main(String[] args) {
        DynamicArrayToStack<Integer> s = new DynamicArrayToStack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        Integer pop1 = s.pop();
        Integer pop2 = s.pop();
        Integer pop3 = s.pop();
        Integer pop4 = s.pop();
        System.out.println("pop1 = " + pop1);
        System.out.println("pop2 = " + pop2);
        System.out.println("pop3 = " + pop3);
        System.out.println("pop4 = " + pop4);



    }


}
