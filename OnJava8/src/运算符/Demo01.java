package 运算符;

public class Demo01 {
	public static void main(String[] args) {
		Integer integer1 = 45;
		Integer integer2 =45;
		System.out.println(integer1==integer2);
		System.out.println(integer1!=integer2);
		System.out.println(integer1.equals(integer2));
		
		
		//当integer 范围超过[-127-128]时我们再来看看结果
		Integer i3 = 987;
		Integer i5 = 987;
		System.out.println(i3==i5);
		//结果就变了
	}

}
