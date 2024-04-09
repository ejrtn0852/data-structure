package Stack;

import java.util.Stack;

public class TwoStackToQueue<T> {

    private Stack<T> inputStack = new Stack<>();
    private Stack<T> outputStack = new Stack<>();



    public void push(T data) {
        inputStack.push(data);
    }

    public T dequeue() {
        if (outputStack.isEmpty()) {
            while(!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.isEmpty() ? null : outputStack.pop();
    }




}
