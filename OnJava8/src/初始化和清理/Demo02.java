package 初始化和清理;

public class Demo02 {
	
	int i=0;
	Demo02 increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		demo02.increment().increment().increment().print();
	}

}
