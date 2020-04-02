package 函数式编程;

import java.util.function.BiConsumer;

public class BiConsumerPermutations {
    static BiConsumer<Integer, Double> bicid = (i, d) ->
            System.out.format("%d, %f%n", i, d);
    static BiConsumer<Double, Integer> bicdi = (d, i) ->
            System.out.format("%d, %f%n", i, d);
    static BiConsumer<Integer, Long> bicil = (i, l) ->
            System.out.format("%d, %d%n", i, l);

    public static void main(String[] args) {
        bicid.accept(10,20.0);
        bicdi.accept(18.7,20);
        bicil.accept(12,20L);

    }
}
