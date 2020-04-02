package 函数式编程;

public class Demo03 {
    static IntCall fib;
    Demo03(){
        fib= n -> n==0 ? 0
                : n==1 ? 1 : fib.call(n-1) + fib.call(n-2);
    }

    int fibona(int n){ return fib.call(n);}

    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        for(int i =0;i<10;i++){
            System.out.println(demo03.fibona(i));
        }
    }
}
