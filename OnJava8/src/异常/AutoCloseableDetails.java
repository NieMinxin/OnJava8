package 异常;
class Repoter implements AutoCloseable{

	@Override
	public void close() throws Exception {
		String name = getClass().getSimpleName();
		// TODO Auto-generated method stub
		System.out.println("closing"+name);
	}
	
}
class First extends Repoter {}
class Second extends Repoter {}
public class AutoCloseableDetails {
	public static void main(String[] args) {
		
	}
}
