package 异常;

public class Demo05 {

	public static void main(String[] args){
		
		try {
			throw new Exception();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			e.getStackTrace();
			
		}
	}
}
