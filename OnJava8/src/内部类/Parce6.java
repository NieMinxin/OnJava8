package 内部类;

public class Parce6 {
	public static Base getBase(int i) {
		return new Base(i) {
			  { System.out.println(
	                    "Inside instance initializer"); }
			//可以使用其他初始化的方法，例如代码块
			@Override
			void f() {
				// TODO Auto-generated method stub
				
			}
			
			
		};
	}
	public static void main(String[] args) {
		Base base = getBase(10);
		
	}

}
