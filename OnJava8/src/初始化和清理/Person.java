package 初始化和清理;



public class Person {
	public void eat(Apple apple) {
		Apple peeler =apple.getPeeler();
		
		System.out.println("yummy");
	}
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}

}

class Apple{
	Apple getPeeler() {
		
		return Peeler.peer(this);
	}
}

class Peeler{
	static Apple peer(Apple apple) {
		return apple;
	}
}


