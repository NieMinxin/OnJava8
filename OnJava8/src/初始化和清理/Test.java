package 初始化和清理;

public class Test {
	public static void main(String[] args) {
		 System.out.println("Inside main()");
	        Cups.cup1.f(99);
	        //static Cups cups1 = new Cups();
	}
}
class Cups {
    static Cup cup1;
    static Cup cup2;
    
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    
    Cups() {
        System.out.println("Cups()");
    }
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}


