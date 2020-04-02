package 接口;

public interface Instrument {
	int i =5;//接口的成员默认为常量不可以更改
	default void play(Note n) { // Automatically public 
		System.out.println(this + ".play() " + n);
	}
	
	default void adjust() {
		System.out.println("adjusting "+this);
		
	}
	
	
}
