package 复用;
/*这样采用继承的预防会将Ship的具体方法全部暴露在NasaShip之中。此时我们可以采用委托的方法来实现。
 * 见ChinaShip
 * */
public class NasaShip extends Ship {
	private String name;
	public NasaShip(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public static void main(String[] args) {
		NasaShip nasaShip = new NasaShip("NASA01");
		nasaShip.back(100);
	}

}
