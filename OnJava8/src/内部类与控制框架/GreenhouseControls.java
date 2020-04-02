package 内部类与控制框架;

public class GreenhouseControls extends Controller{
	private boolean lighton =false;
	public class LightOn extends Event{

		public LightOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			lighton =true;
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "light on";
		}
		
	}
	public class LightOff extends Event{

		public LightOff(long millisecondDelay) {
			super(millisecondDelay);
			// TODO Auto-generated constructor stub
			
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			lighton =false;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "light off";
		}
		
	}
	
	//添加一个新的对象本身的时间到action方法
	public class Bell extends Event{

		public Bell(long millisecondDelay) {
			super(millisecondDelay);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			addEvent(new Bell(delayTime.toMillis()));
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bing";
		}
	}
	
	public class Restart extends Event{
		private Event [] events;

		public Restart(long millisecondDelay,Event[] events) {
			super(millisecondDelay);
			this.events = events;
			for(Event event:events) {
				addEvent(event);
			}
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			for(Event e : events) {
                e.start(); // Rerun each event
                addEvent(e);//添加到控制器
            }
			start();//// Rerun this Event,restart 也是一个event
			addEvent(this);//把rstart添加到event
			
		}
		@Override
        public String toString() {
            return "Restarting system";
        }
		
		
	}
	public static void main(String[] args) {
		
	}

}
