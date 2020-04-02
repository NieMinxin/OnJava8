package 复用;

public class ChinaShip extends Ship{
	private String name;
	
	public ChinaShip(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	void back(int velocity) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ChinaShip cShip = new ChinaShip("hello");
		cShip.back(100);
	}

}
