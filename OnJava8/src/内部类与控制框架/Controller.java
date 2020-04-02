package 内部类与控制框架;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event event) {
		eventList.add(event);
		
	}
	public void run() {
		while(eventList.size()>0) {
			for (Event event : eventList) {
				if(event.ready()) {
					System.out.println(event);
					event.action();
					eventList.remove(event);
				}
				
			}
		}
		
	}
	
	
}
