package 函数式编程;

import java.util.function.Function;

class Foo {}

class Bar {
    Foo f;
    Bar(Foo f) { this.f = f; }//构造函数
}

class IBaz {
    int i;
    IBaz(int i) {
        this.i = i;
    }
}

class LBaz {
    long l;
    LBaz(long l) {
        this.l = l;
    }
}

class DBaz {
    double d;
    DBaz(double d) {
        this.d = d;
    }
}
public class FunctionVariants {
    static Function<Foo,Bar> f1 = f-> new Bar(f);
    Function<Foo,Bar> f = new Function<Foo, Bar>() {
        @Override
        public Bar apply(Foo foo) {
            return new Bar(foo);
        }
    };


}
