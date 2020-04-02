package 函数式编程;
interface  IntCall{
    int call(int n);
}
public class Demo02 {
    static IntCall intCall;

    public static void main(String[] args) {
        intCall = n -> n==0 ? 1 : n*intCall.call(n-1);
        for(int i = 0;i<5;i++){
            System.out.println(intCall.call(i));
        }
    }
}
