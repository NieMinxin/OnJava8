package 复用;

public class Cartoon extends Drawing {
	
	public static void main(String[] args) {
		Cartoon cartoon = new Cartoon();
	}
/*观察输出的打印内容，我们就能明白
 * 构造从基类“向外”进行，因此基类在派生类构造函数能够访问它之前进行初始化。即使不为 **Cartoon** 创建构造函数，编译器也会为你合成一个无参数构造函数，调用基类构造函数。
 * 
 * 于是，我们删除cartoon的构造函数试试,于是水落石出，基类初始化就是派生类一条向上追溯的链
 * */

}

class Art {
	  Art() {
	    System.out.println("Art constructor");
	  }
}
class Drawing extends Art {
	  Drawing() {
	    System.out.println("Drawing constructor");
	  }
}
