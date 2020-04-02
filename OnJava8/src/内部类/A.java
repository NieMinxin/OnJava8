package 内部类;

public class A {
	private int i=10;
	class B{
		void printA() {
			System.out.println(A.this.i);
		}
	}
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.printA();
		
	}

}
