package 复用;

public class Car {
	private Engine engine = new Engine();
	private Wheel[] wheels = new Wheel[4];
	private Door leftDoor = new Door();
	private Door rightDoor  = new Door();
	
	Car(){
		for(int i =0;i<4;i++) {
			wheels[i] = new Wheel();
		}
		
	}

}

class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    
    public void open() {}
    public void close() {}
}