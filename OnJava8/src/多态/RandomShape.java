package 多态;

import java.util.Random;

public class RandomShape {
	 private Random rand = new Random(47);
	public Shape get() {
		switch(rand.nextInt(3)) {
        default:
        case 0: return new Circle();
        case 1: return new Square();
        case 2: return new Triangle();
    }
		
		
	}
	public Shape[] array(int size) {
		Shape[] shapes = new Shape[size];
		for(int i=0;i<size;i++) {
			shapes[i]=get();
		}
		return shapes;
	} 
}
