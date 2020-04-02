package 函数式编程;

import java.util.function.Function;

class A1{
    @Override
    public String toString() {
        return "A1";
    }
}
class B1{
    @Override
    public String toString() {
        return "B1";
    }
}
public class Consume {
    static  B1 consumer(Function<A1,B1> ab ){// t r
        return ab.apply(new A1());
    }

    public static void main(String[] args) {
        B1 b1 = consumer(s->new B1());
    }
}
