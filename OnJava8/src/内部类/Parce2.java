package 内部类;

public class Parce2 {
	public Destination destination(String string) {
		final class TestDest implements Destination {
			private String lable;
			private TestDest(String whereTo) {
				lable =whereTo;
			}

			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return lable;
			}
			
		}
		return new TestDest(string);//方法中返回内部类的实例
	}
	public static void main(String[] args) {
		Parce2 p = new Parce2();
		Destination destination = p.destination("北京");//创建并返回对实现接口的引用
		System.out.println(destination.readLabel());
	}
	/*
	 * TestDest是该方法的一部分，而不是parce2的一部分 ，**return** 语句中的向上转型-返回的是 **TestDest** 的引用*/

}
