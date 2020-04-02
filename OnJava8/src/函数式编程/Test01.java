package 函数式编程;
interface A{
    String f(String s);
}
public class Test01 {

    A[] as = {
            new A() {
                @Override
                public String f(String s) {
                    return s;
                }

            },s -> s.substring(0,5)
    };

    public static void main(String[] args) {
        Test01 t = new Test01();
        for( A a: t.as){
            System.out.println(a.f("hello,world"));
        }
    }

}
