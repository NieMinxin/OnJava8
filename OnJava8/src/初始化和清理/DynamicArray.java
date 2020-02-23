package 初始化和清理;

public class DynamicArray {
	public static void main(String[] args) {
		//Other.main(new String[] {"fiddler","de"});
		for(int i =0;i<args.length;i++) {
			System.out.printf("%s\n",args[i]);
		}
	}

	
}

class Other{
	public static void main(String[] args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
    }
}
