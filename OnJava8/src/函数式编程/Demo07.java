package 函数式编程;
class Go{
    static  void go(){
        System.out.println("Go::go");
    }
}
public class Demo07 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();
        new Thread(
                ()->System.out.println("Java")
        ).start();

        new Thread(Go::go).start();
    }
}
