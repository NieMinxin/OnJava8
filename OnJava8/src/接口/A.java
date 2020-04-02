package 接口;

public class A implements Ainterface{
	@Override
	public void fun() {
		// TODO Auto-generated method stub
	System.out.println("fun");	
	}
	@Override
	public void fun2() {
		// TODO Auto-generated method stub
	System.out.println("fun2");	
	}
	
	public static void main(String[] args) {
		A  a= new A();
		//A类实例没有实现所有的接口，这很方便不是吗
		a.fun2();
		a.fun3();
	}
}
