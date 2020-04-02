package 复用;

public class Chess extends BoardGame{
	Chess(){
		super(11);
		System.out.println("chess constructor");
		
		
	}
	public static void main(String[] args) {
		new Chess();
	}

}
class Game {
	  Game(int i) {
	    System.out.println("Game constructor");
	  }
}

//如果找不到Game的构造函数，编译器就会报错。
class BoardGame extends Game {
	  BoardGame(int i) {
	    super(i);
	    System.out.println("BoardGame constructor");
	  }
}
