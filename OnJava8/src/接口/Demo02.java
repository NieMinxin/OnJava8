package 接口;

public class Demo02 implements Instrument {
	public void test(Instrument instrument) {
		instrument.adjust();
	}
	public static void main(String[] args) {
		
		Demo02 demo02 = new Demo02();
		demo02.test(demo02);
		
	}

}

