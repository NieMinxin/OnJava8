package 内部类与控制框架;

import java.time.Duration;
import java.time.Instant;

public class Demo {
	
	public static void main(String[] args) {
	Instant time = Instant.now().plus(Duration.ofMillis(2000));
		if (Instant.now().isAfter(time)) {
			System.out.println("hello");
			
		}
	}

}
