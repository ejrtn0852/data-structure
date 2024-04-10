package stack;

import java.util.NoSuchElementException;

public class StaticArrayToStack<T> {

    private T[] arr;
    private int count;

    public StaticArrayToStack(int index) {
        this.arr = (T []) new Object[index];
        this.count = 0;
    }

    public void push(T data) {
        if (isFullSize()) {
            throw new IndexOutOfBoundsException();
        }
            arr[count] = data;
            count++;
    }

    public T peek() {
        return arr[count -1];
    }

    public T pop () {
        if (count == 0) {
            throw new NoSuchElementException("Stack is empty");
        }

        T item = arr[count -1];
        arr[count -1] = null;
        count--;
        return item;
    }






    private boolean isFullSize() {
        return count >= arr.length;
    }

}
