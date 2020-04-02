package 多态;

public class Shapes {
	public static void main(String[] args) {
		RandomShape rand = new RandomShape();
		for(Shape shape :rand.array(5)) {
			shape.draw();
			shape.erase();
		}
	}

}
