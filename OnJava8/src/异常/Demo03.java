package 异常;
 class OnOffException1 extends Exception {}
//exceptions/OnOffException2.java
 class OnOffException2 extends Exception {}
public class Demo03 {
	private boolean state = false;
	public boolean read() {return state;}
	public void on() {
		state = true;
	}
	public void off() {
		this.state = false;
	}
	@Override
    public String toString() {
        return state ? "on" : "off";
    }
	
	 public static void f()
	            throws OnOffException1, OnOffException2 {}
	 
	 public static void main(String[] args) {
		Demo03 demo03 = new Demo03();
		
		try {
			demo03.on();
			f();
			demo03.off();
			
		} catch (OnOffException1 e) {
			// TODO: handle exception
			e.getMessage();
			demo03.off();
		}catch (OnOffException2 e) {
			// TODO: handle exception
			e.getMessage();
			demo03.off();
		}
	}
	
	
}
