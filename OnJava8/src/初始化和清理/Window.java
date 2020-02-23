package 初始化和清理;

public class Window {
	public Window(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Window(" + i + ")");
	}
	public Window(String string) {
		// TODO Auto-generated constructor stub
		Window w3;
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		House house = new House();
		house.f();
	}
	
}
class House {
	Window w1 = new Window(1); // Before constructor
	House() {
        // Show that we're in the constructor:
        System.out.println("House()");
        w3 = new Window(33); // Reinitialize w3
    }
	
    


    Window w2 = new Window(2); // After constructor

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3); // At end
    
    
}