package 函数式编程;
interface Pow{
    int pow(int x,int n);
}
public class Demo01 {

    public static void main(String[] args) {
        Pow test;
        test = (x,n) -> x*n;

        for(int i=0;i<10;i++){
            System.out.println(test.pow(10,i));
        }

    }
}
