package 内部类;

public class Parce7 {
	private static class ParceContent implements Contents{
		private int i=11;
		
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
	}
	static final class ParcelDestination implements Destination{
		 private String label;
	        private ParcelDestination(String whereTo) {
	            label = whereTo;
	        }
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		public static void f() {}
        static int x = 10;
        //嵌套类
        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }
		
	}
	public static Destination destination(String s) {
        return new ParcelDestination(s);
    }
    public static Contents contents() {
        return new Contents() {
			
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
    }
    public static void main(String[] args) {
    	Contents contents = contents();
    	Parce7 parce7 = new Parce7();
    	Parce7.ParceContent pp = new ParceContent();
    	System.out.println(pp.i);
	}
}
