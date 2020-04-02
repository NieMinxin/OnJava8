package 多态;

public class RoundGlyph extends Glypy{
	private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
    public static void main(String[] args) {
    	new RoundGlyph(5);
	}
    
}
