package 内部类;

import 内部类.Parcel1.Contents;

public class Parcel1 {
	class Contents{
		private int i = 11;
	      
        public int value() { return i;}
	}
	class Destination {
        private String label;
      
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
     
        
	}
	public void ship(String dest) {
		Contents contents = new Contents();
		Destination destination = new Destination(dest);
		System.out.println(destination.readLabel());
		System.out.println(contents.i);
		
	
	}
	public Contents getContents() {
		
		return new Contents();
	}
	
	public static void main(String[] args) {
		Parcel1 parcel1 = new Parcel1();
		parcel1.ship("Los anglest");
		System.out.println();
		
	}

}
//
//通常在外部类里会添加一个方法返回内部类的对象，这样就会显得十分合理.