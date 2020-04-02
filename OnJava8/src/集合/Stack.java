package 集合;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<T> {
    private Deque<T> deque = new ArrayDeque<T>();

    public void push(T value){
        deque.push(value);
    }
    public T pop(){
        return deque.pop();
    }
    @Override
    public String toString() {
        return deque.toString();
    }

}
