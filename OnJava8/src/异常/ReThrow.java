package 异常;

public class ReThrow {
	static void f() throws Exception{
		System.out.println(
                "originating the exception in f()");
        throw new Exception("thrown from f()");
	}
	static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(
                    "Inside g(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	static void h() throws Exception{
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println(
	                    "Inside h(), e.printStackTrace()");
			 e.printStackTrace(System.out);
			 throw (Exception)e.fillInStackTrace();//强转，可以看出fillInStackTrace 更新了堆栈了信息添加到异常对象
		}
	}
	public static void main(String[] args) {
        try {
            g();
        } catch(Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch(Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
	
}
