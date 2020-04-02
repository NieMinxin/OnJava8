package 函数式编程;

import java.util.function.Function;

interface Func extends Function<String,String> {};
public class ProduceFunction {
    Func procuce(){
       return  s -> s.toUpperCase();
    }

    public static void main(String[] args) {
        ProduceFunction pro = new ProduceFunction();
        Func func = pro.procuce();
        System.out.println(func.apply("hello,world"));
    }
    //**[1]** 使用继承，可以轻松地为专用接口创建别名。
    //
    //**[2]** 使用 Lambda 表达式，可以轻松地在方法中创建和返回一个函数。
}
