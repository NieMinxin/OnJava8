package 集合;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Demo05 {
    public static  void printQueue(Queue queue){
        while(queue.peek()!=null){
            System.out.print(queue.poll()+" ");
        }

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for(int i =0;i<20;i++){
            queue.offer(rand.nextInt(i+10));
        }
        printQueue(queue);
        Queue<Character> chars = new LinkedList<>();
        for(char c:"hello,java".toCharArray()){
            chars.add(c);
        }
        System.out.println();
        printQueue(chars);

    }
}
