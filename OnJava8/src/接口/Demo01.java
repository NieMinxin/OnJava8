package 接口;

public class Demo01 extends F {

	@Override
	protected void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun1");
	}

	@Override
	void fun3() {
		// TODO Auto-generated method stub
		System.out.println("fun3");
		
	}
	public static void main(String[] args) {
		Demo01 demo01 = new Demo01();
		demo01.fun3();
	}
}

abstract class F{
    protected	abstract void fun1();
    private void f2() {
    	
    }
    
    abstract void fun3();
	 
}
