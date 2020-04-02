package 内部类;

public class TestMain {
	public static void main(String[] args) {
		Test test = new Test();
		Contents contents = test.getPcontent();
		Destination destination = test.getPdestinaton("hello");
		
		
		System.out.println(contents.value());
		System.out.println(destination.readLabel());
	}

}
