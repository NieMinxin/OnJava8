package 多态;

public class  PrivateOverride {
	
	 private void f() {
	        System.out.println("private f()");
	    }
	public static void main(String[] args) {
		 PrivateOverride po = new D();
		 po.f();
	}
	
	
}

class D extends PrivateOverride{
	public void f() {
		System.out.println("Paivate fo");
	}
	
}

//结论是只有非 **private** 方法才能被重写，但是得小心重写 **private** 方法的现象，编译器不报错，但不会按我们所预期的执行。为了清晰起见，派生类中的方法名采用与基类中 **private** 方法名不同的命名。

//如果使用了 `@Override` 注解，就能检测出问题：