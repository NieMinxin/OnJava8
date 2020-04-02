package 封装;
import java.util.Arrays;

import util.*;
public class Hide {
	
	public static void main(String[] args) {
		Range range = new  Range();
		int[] test1 =range.range(10);
		System.out.println(Arrays.toString(test1));
		int[] test2 = range.range(2, 20, 2);
		System.out.println(Arrays.toString(test2));
	}

}
