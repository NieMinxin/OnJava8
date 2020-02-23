package 初始化和清理;

import java.util.Arrays;
import java.util.Random;

public class Array {
	public static void main(String[] args) {
		Random random = new Random(10);
		int[] a;
		a = new int[random.nextInt(20)];
		System.out.println("length of a:" + a.length);
		System.out.println(Arrays.toString(a));
	}
}
