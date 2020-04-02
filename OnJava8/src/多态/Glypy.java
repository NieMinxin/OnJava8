package 多态;

public class Glypy {
	void draw() {
		System.out.println("Glyph draw");
		
	}
	public Glypy() {
		// TODO Auto-generated constructor stub
		System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
	}

}

