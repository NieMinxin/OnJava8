package 接口;

import java.util.Random;

public interface RandomDoubles {
	Random random = new Random(47);
	default double next() {
		return random.nextDouble();
	}
	
	public static void main(String[] args) {
		RandomDoubles randomDoubles = new RandomDoubles() {
		};
		
		
	}

}
