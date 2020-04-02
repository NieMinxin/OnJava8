package 接口;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomStrings implements Readable {
	private static Random rand = new Random(47);
    private static final char[] CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] LOWERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] VOWELS = "aeiou".toCharArray();
    private int count;
    
    RandomStrings(int count){
    	this.count = count;
    	
    }
    public RandomStrings() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(count--==0) {
			return -1;
		}
		cb.append(CAPITALS[rand.nextInt(CAPITALS.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(VOWELS[rand.nextInt(VOWELS.length)]);
            cb.append(LOWERS[rand.nextInt(LOWERS.length)]);
        }
        cb.append(" ");
        return 10; // Number of characters appended
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new RandomStrings(10));
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}
	

}
