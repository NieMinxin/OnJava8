package 初始化和清理;

public class Book {
	boolean checkedOut=false;
	
	Book(boolean signal){
		checkedOut =signal;
		
	}
	void checkIn() {
		checkedOut =false;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(checkedOut) {
			System.out.printf("error: checked OUT");
			
		}
		
	}
	
	public static void main(String[] args) {
		Book book = new Book(true);
		book.checkIn();
		new Book(true);
		System.gc();
		//`System.gc()` 用于强制进行终结动作。但是即使不这么做，只要重复地执行程序（假设程序将分配大量的存储空间而导致垃圾回收动作的执行），最终也能找出错误的 **Book** 对象。
	}

}
