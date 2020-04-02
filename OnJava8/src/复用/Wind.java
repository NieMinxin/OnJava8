package 复用;

public class Wind extends Instrument{
	public static void main(String[] args) {
		tune(new Wind());
	}

}
class Instrument {
    public void play() {
    	System.out.println("ding.....");
    }
    
    static void tune(Instrument i) {
        // ...
        i.play();
    }
}
