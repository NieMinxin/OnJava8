package 集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Demo02 {
    public static void main(String[] args) {
        List list = Arrays.asList("jack","ellen","bob","alice","andy","mike");
        System.out.println(list);
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("index"+":"+iterator.nextIndex()+"--"+iterator.previousIndex()+"--"+iterator.next());
        }
        System.out.println();
        System.out.println(list);

        ListIterator listIterator = list.listIterator(3);
        while(listIterator.hasNext()){
            System.out.println("index"+":"+listIterator.nextIndex()+"--"+listIterator.previousIndex()+"--"+listIterator.next());

        }
        System.out.println(listIterator);
        listIterator.set("mj");//修改最近访问的一个元素
        System.out.println(list);
    }
}
