package 初始化和清理;

public class Mus {
	Mug mug1;
    Mug mug2;
    { // [1]
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    
    Mus() {
        System.out.println("Mus()");
    }
    
    Mus(int i) {
        System.out.println("Mus(int)");
    }
    public static void main(String[] args) {
    	System.out.println("Inside main()");
        new Mus();
        System.out.println("new Mugs() completed");
        new Mus(1);
        System.out.println("new Mugs(1) completed");
	}
}

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}