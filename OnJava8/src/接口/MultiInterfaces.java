package 接口;

public class MultiInterfaces {
	static void takesA(A1 a) {}
    static void takesB(B1 b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }

}
