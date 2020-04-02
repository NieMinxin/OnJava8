package 接口;

public class Music {
	static void tune(Instrument i) {
		i.play(Note.A);
	}
	
	static void tuneAll(Instrument[] instruments) {
		for (Instrument instrument : instruments) {
			tune(instrument);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] instruments = {
				new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()
		};
		
		tuneAll(instruments);
		
	
	}
	
	/*在这个实例中，有许多学习和复习的地方，我们一一到来。
	 * 1.this instrument接口定义play方法，this我们都知道指代对象，指代调用该方法的当前对象，准确的说this生成了一个对象引用，从而该对象调用了play方法
	 * 2.Note 为枚举类型，其中都是常量。
	 * 3.default，默认方法
	 * 4.toString 方法 众多类实现了instrument接口  打印引用时会打印引用的内存地址等一些信息，实现tostring后打印tostring返回的值
	 * 在本例子很好的说明了this生成该引用！！
	 * 5.在Music 类中 没有实现接口instrument 就可以使用接口的方法，这就是default关键字优势所在！！
	 * 6，接口作为方法参数？这里我们先简单解释一下，学到匿名内部类便会恍然大悟。我们先将接口看作普通类，抽象类，或者就是一个接口。
	 * 于是便可以使用多态思想解释它。(在匿名内部类中传入的引用对象都会默认继承或实现该接口，类，抽象类！！)我们后面再仔细讨论。
	 * */

}
