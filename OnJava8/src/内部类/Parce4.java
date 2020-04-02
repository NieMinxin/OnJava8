package 内部类;

public class Parce4 {
	public Wrap wrap(int x) {
		return new Wrap(x);
	}
	public static void main(String[] args) {
		Parce4 p = new Parce4();
		Wrap w = p.wrap(10);
	}

}
