package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
			Robot r1 = new Robot(100, 200);
			Robot r2 = new Robot(150, 300);
			Robot r3 = new Robot(200, 200);
			Robot r4 = new Robot(250, 300);
			Robot r5 = new Robot(300, 200);
			r1.penDown();
			r2.penDown();
			r3.penDown();
			r4.penDown();
			r5.penDown();
			
			Thread t1 = new Thread (()-> {	
				for (int i = 0; i < 360; i++) {
				r1.move(1);
				r1.turn(1);
				}
			});
			Thread t2 = new Thread (()-> {	
				for (int i = 0; i < 360; i++) {
				r2.move(1);
				r2.turn(1);
				}
			});
			Thread t3 = new Thread (()-> {	
				for (int i = 0; i < 360; i++) {
				r3.move(1);
				r3.turn(1);
				}
			});
			Thread t4 = new Thread (()-> {	
				for (int i = 0; i < 360; i++) {
				r4.move(1);
				r4.turn(1);
				}
			});
			Thread t5 = new Thread (()-> {	
				for (int i = 0; i < 360; i++) {
				r5.move(1);
				r5.turn(1);
				}
			});
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
	}
}
