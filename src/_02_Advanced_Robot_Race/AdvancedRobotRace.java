package _02_Advanced_Robot_Race;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.

	public static void main(String[] args) {
		Robot r1 = new Robot(100, 200);
		Robot r2 = new Robot(150, 300);
		Robot r3 = new Robot(200, 200);
		Robot r4 = new Robot(250, 300);
		Robot r5 = new Robot(300, 200);
		ArrayList <Robot> robo = new ArrayList <Robot>();
		robo.add(r1);
		robo.add(r2);		
		robo.add(r3);
		robo.add(r4);
		robo.add(r5);
		for (int i = 0; i < robo.size(); i++) {
			robo.get(i).moveTo(150*i+150,800);;
		}
		Thread t = new Thread(()->r1.move(500));
		Thread t2 = new Thread(()->r2.move(500));
		Thread t3 = new Thread(()->r3.move(500));
		Thread t4 = new Thread(()->r4.move(500));
		Thread t5 = new Thread(()->r5.move(500));
		
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
