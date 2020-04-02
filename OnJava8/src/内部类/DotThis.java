package 内部类;

public class DotThis {
	void f() {
		System.out.println("f() DotThis");
	}
	class Inner{
		DotThis getReDotThis() {
			return DotThis.this;
		}
	}
	
	
	//得到inner对象实例
	public Inner getInner() {
		return new Inner();
		
	}
	
	public static void main(String[] args) {
		DotThis dos = new DotThis();
		DotThis.Inner dir = dos.getInner();
		dir.getReDotThis().f();
				
		//如果打印结果为DotThis类方法f就证明 DotThis.this 获得了指向外部类的引用，this关键字本身也是获得某类的引用
	}
}
