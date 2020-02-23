package 初始化和清理;



public class Demo01 {
	//无参构造器
	
	public Demo01() {
		// TODO Auto-generated constructor stub
		System.out.printf("Rock\t");
	}
	//
	Demo01(int i){
		System.out.printf("rock:%d\t",i);
		
	}
	public static void main(String[] args) {
		for(int i =0;i<10;i++) {
			new Demo01();
			new Demo01(i);
		}
	}

}
