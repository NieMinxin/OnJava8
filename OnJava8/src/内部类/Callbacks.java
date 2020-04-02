package 内部类;
//接口
interface Incrementable{
	void increament();
}

//callee1 类实现Incrementable接口//callee1直接实现接口
class Callee1 implements Incrementable {
    private int i = 0;//成员变量
    @Override
    public void increament() {
        i++;
        System.out.println(i);
    }
}



class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi) { mi.increment(); }//静态方法
}
// If your class must implement increment() in
// some other way, you must use an inner class:使用内部类实现接口，同时保留自己increment方法的独特性
class Callee2 extends MyIncrement {
    private int i = 0;
    @Override
    public void increment() {
        super.increment();//1
        i++;//2
        System.out.println(i);//3
    }
    private class Closure implements Incrementable {
        @Override
        public void increament() {
            // Specify outer-class method, otherwise
            // you'll get an infinite recursion:注意防止无穷的递归，在内部类中调用接口的方法实际上是调用myincrement
            Callee2.this.increment();//包含外部类的引用
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();//
    }
}
class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }
    void go() { callbackReference.increament(); }
}
//main方法类
public class Callbacks {
	public static void main(String[] args) {
		 Callee1 c1 = new Callee1();//非匿名内部类实现
	        Callee2 c2 = new Callee2();
	        MyIncrement.f(c2);//static void f(MyIncrement mi) { mi.increment(); }//静态方法  多态，调用子类方法
	        Caller caller1 = new Caller(c1);//Callee1 implements Incrementable 接口指向实现类
	        Caller caller2 = new Caller(c2.getCallbackReference());//回调返回一个内部类Closure对象，内部类实现了incrementable
	        caller1.go();//打印1
	        caller1.go();//打印2
	        caller2.go();//回调的内部类对象
	        caller2.go();
	        //**Caller** 的构造器需要一个 **Incrementable** 的引用作为参数（虽然可以在任意时刻捕获回调引用）
	        //然后在以后的某个时刻，**Caller** 对象可以使用此引用回调 **Callee** 类。￥￥回调
	        
	}
}
