package 初始化和清理;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] a =new int[random.nextInt(20)];
		for(int i =0;i<a.length;i++) {
			a[i] = random.nextInt(500);
			
		}
		System.out.println(Arrays.toString(a));
		
	}
}
