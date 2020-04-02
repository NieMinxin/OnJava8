package 内部类;

public class Parce {
	public Destination destination(final String dest) {
		return new Destination() {
			private String lable = dest;
			
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return lable;
			}
		};
	}
	public static void main(String[] args) {
		Parce p = new Parce();
		Destination destination = p.destination("hello");
		System.out.println(destination.readLabel());
	}

}
