package 初始化和清理;

public class VarArgs {
	public static void printArray(Object[] args) {
		for (Object object : args) {
			System.out.println(object+" ");
		}
		System.out.println("------------------");
	}
	public static void main(String[] args) {
		printArray(new Object[] {1,2,3});
		printArray(new Object[] {"hello","kugou"});
		printArray(new Object[] {1.34,"hello"
		});
		printArray(new Object[] {new A()
				
		});
	}
}

class A{
	
}

