package 接口;

 public class X implements A1, B1 {
	 
 }
 class Y implements A1 {
	    B1 makeB() {
	        // Anonymous inner class:
	        return new B1() {};//匿名内部类
	    }
	}

interface A1{
	
}

interface B1{
	
}