package 函数式编程;

public class Demo10 {
    class Inner{
       String f(String s) {
            return s;
        }
    }
    static  String la(String s){
        return  s.toUpperCase();
    }

    public static void main(String[] args) {
        Demo10.la("hello");
    }
}
