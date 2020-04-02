package 集合;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo04 {
    public static void main(String[] args) {
        Set<String> colors1 = new HashSet<>();
        for(int i = 0; i < 100; i++) {
            colors1.add("Yellow");
            colors1.add("Blue");
            colors1.add("Red");
            colors1.add("Red");
            colors1.add("Orange");
            colors1.add("Yellow");
            colors1.add("Blue");
            colors1.add("Purple");
        }
        System.out.println(colors1);
        Set<String> colors = new TreeSet<>();
        for(int i = 0; i < 100; i++) {
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Red");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Purple");
        }
        System.out.println(colors);
    }
}
