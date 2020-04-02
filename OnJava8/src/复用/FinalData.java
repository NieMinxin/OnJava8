package 复用;

import java.util.Random;

public class FinalData {
	private static Random rand = new Random(47);//Static数据只会加载一次
    private String id;
    
    public FinalData(String id) {
        this.id = id;
    }
    // Can be compile-time constants:编译时值的 **final** 基本类型
    private final int valueOne = 9;//final修饰的数据
    private static final int VALUE_TWO = 99;//静态存储区域不可改变的常量
    // Typical public constant:
    public static final int VALUE_THREE = 39;
    // Cannot be compile-time constants:表示该变量必须初始化，且值不能改变。
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);//引用类型，不可以指向其他对象
    private static final Value VAL_3 = new Value(33);
    // Arrays://注意引用类型指的是不能再引用其他对象，但是最初引用对象的值只可以修改的
    private final int[] a = {1, 2, 3, 4, 5, 6};
    
    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }
    
    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //- fd1.valueOne++; // Error: can't change value
        fd1.v2.i++; // Object isn't constant//对象的值是可以改变的，基本数据类型的值不可以改变
        fd1.v1 = new Value(9); // OK -- not final
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; // Object isn't constant
        }
        //- fd1.v2 = new Value(0); // Error: Can't
        //fd1.VAL_3 = new Value(1); // change reference
        //- fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
    
        
        System.out.println(fd2);
        
        //为什么fd2的i4和fd1的i4打印值不同？
        /*INT_5是村出来静态内存的final变量，它只会初始化一次，所以之不会改变，
         * i4的值是final修饰的基本数据类型变量，此区别只有当值在运行时被初始化时才会显现，因为编译器对编译时数值一视同仁
         * final修饰的基本数据类型变量初始化会在运行时。 
         * */
    }

}
class Value {
    int i; // package access
    
    Value(int i) {
        this.i = i;
    }
}
