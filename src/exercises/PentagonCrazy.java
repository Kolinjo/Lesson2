package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		
		Robot robot = new Robot ();
		robot.penDown();
		robot.setSpeed(10);
		robot.setRandomPenColor();
			int sides = 5;
	    //	int sides1 = 6;
		//	int sides2 = 7;
			double angle = 360/sides;
		for (int i = 0; i < 200; i++) {
					robot.move(i);
					robot.setPenWidth(10);
					robot.setRandomPenColor();
					robot.turn(angle+1);
				}
			
	}

	
	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}