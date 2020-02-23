package 初始化和清理;



public class Enum {

	public static void main(String[] args) {
		System.out.println(Spiciness.HOT);
		for(Spiciness spi:Spiciness.values()) {
			System.out.println(spi);
			System.out.println("ordinal: " + spi.ordinal());
			
		}
	}
	
}

