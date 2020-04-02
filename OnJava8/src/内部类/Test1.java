package 内部类;

public class Test1 extends WithInner.Innr{
	//编译器要求添加构造器初始化基类
	
	  public Test1(WithInner withInner) { // TODO Auto-generated constructor stub
	  withInner.super();
	 }
	//或者使用关键字
	
	public static void main(String[] args) {
		WithInner withInner  = new WithInner();
		Test1 test1 = new Test1(withInner);
	}

}
