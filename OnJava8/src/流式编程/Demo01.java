package 流式编程;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);

        Map<String,Integer> map  = new HashMap<>();
        map.put("1",1);
        map.put("2",2);

        map.forEach((k,v)->System.out.println(k+"==="+v));


    }
}
