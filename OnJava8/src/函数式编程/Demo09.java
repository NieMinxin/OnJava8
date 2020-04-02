package 函数式编程;
class X{
    String f(){return "X::f()";};
}
interface  MakeString {
    String make();
}
interface  Transform{
    String transform(X x);
}
public class Demo09  {
    public static void main(String[] args) {
        //MakeString mk = X::f;
        Transform tr = X::f;
        X X = new X();
        MakeString mk =X::f;//对象实例
    }
}
