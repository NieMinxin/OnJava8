package 接口;

public interface Ainterface {
	
	void fun();
	
	void fun2();
	
	default void fun3() {
		System.out.println("hello");
	}

}
