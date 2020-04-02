package 内部类;

public class Test {
	private class Pcontent implements Contents{
		private int i=11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
		
	}
	//Pdestinaton ,Pcontent类为私有的，除了外部类没人能访问该类
	private final class Pdestinaton implements Destination{
		private String label;
		 private Pdestinaton(String whereTo) {
	            label = whereTo;
	        }
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		
	}
	
	public Pdestinaton getPdestinaton(String str) {
		return new Pdestinaton(str);
	}
	
	public Pcontent getPcontent() {
		return new Pcontent();
	}
}
