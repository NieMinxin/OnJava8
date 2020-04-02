package 函数式编程;

public class Demo05 {
    static  class Demo06{
        int i=10;

    }

    public static void main(String[] args) {
        Demo06 demo06 = new Demo06();
        Demo05 demo05 = new Demo05();
        Demo05.Demo06 de = new Demo05.Demo06();
        System.out.println(de.i);


    }
}
