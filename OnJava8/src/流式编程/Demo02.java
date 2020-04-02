package 流式编程;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        List<Integer> collect = Stream.iterate(0, i -> i + 1).limit(5).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
