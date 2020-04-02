package 函数式编程;

public class Demo11 {
    static String f(){
        return "hello";
    }
    public static void main(String[] args) {
        Runnable r = Demo11::f;
        r.toString();
    }
}
