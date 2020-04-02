package 多态;

public class StaticSub extends StaticSuper{
	public static String staticGet() {
        return "Derived staticGet()";
    }
	@Override
    public String Get() {
        return "Derived dynamicGet()";
    }
    
    public static void main(String[] args) {
		StaticSuper sup = new StaticSub();//向上转型
		System.out.println(StaticSuper.staticGet());
		System.out.println(sup.Get());
		
	}

}
