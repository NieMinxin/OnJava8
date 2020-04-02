package 复用;

public class Bath {
	private String  s1 = "Happy",//s1，第三输出，s2第四输出，s3第五输出，s4最后，其中s3是构造器初始化，s4是延迟初始化
		    s2 = "Happy",
		    s3, s4;
	//从s1，s2，s3，s4.我们就可以得出一个结论  ，对象被定义最先初始化。
	//组合
	private Soap castille;
	 private int i;
	  private float toy;
	  public Bath() {
		  System.out.println("Inside Bath()");//第一
		    s3 = "Joy";//构造器初始化
		    toy = 3.14f;//构造器初始化成员数据
		    castille = new Soap();//第二输出---说明当对象被定义时。这意味着它们总是在调用构造函数之前初始化。
	  }
	  
	  { i = 47; }//非静态实例初始化--类似静态代码块
	  @Override
	  public String toString() {
	    if(s4 == null) // Delayed initialization:
	      s4 = "Joy";//延迟初始化----非常妙  
	    return
	      "s1 = " + s1 + "\n" +
	      "s3 = " + s3 + "\n" +
	      "s2 = " + s2 + "\n" +
	      "s4 = " + s4 + "\n" +
	      "i = " + i + "\n" +
	      "toy = " + toy + "\n" +
	      "castille = " + castille;
	  }
	  public static void main(String[] args) {
		  Bath b = new Bath();//实例初始化
		    System.out.println(b);//这里将执行tostring方法
	}
	  
}

class Soap {
	  private String s;
	  Soap() {
	    System.out.println("Soap()");
	    s = "Constructed";
	  }
	  @Override
	  public String toString() { return s; }
	}
