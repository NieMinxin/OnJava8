package 集合;

import java.util.ArrayDeque;

public class Demo03 {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for(String s: "hello,www,html,java".split(",")){
            arrayDeque.push(s);
        }
        while(!arrayDeque.isEmpty()){
            System.out.println(arrayDeque.pop());
        }
    }
}
