package examples;

import org.jointheleague.graphical.robot.Robot;

public class FourSquareRobot 
{

	public static void main(String[] args) 
	{
		Robot marko = new Robot ();
		marko.penDown();
		marko.setPenWidth(20);
		marko.setSpeed(10);
	
		
		for (int i = 0; i < 4; i++) 
		{
			marko.move(100);
			marko.turn(90);
			marko.setRandomPenColor();
			
		}
		
		marko.turn(-90);

		for (int i = 0; i < 4; i++) 
		{
			marko.move(100);
			marko.turn(-90);
			marko.setRandomPenColor();
			
		}
		
		marko.move(100);
		marko.turn(90);
		
		for (int i = 0; i < 3; i++) 
		{
			marko.move(100);
			marko.turn(90);
			marko.setRandomPenColor();
			
		}
		
		marko.turn(-180);
		marko.move(100);
		
		for (int i = 0; i < 3; i++) 
		{
			
			marko.turn(90);
			marko.move(100);
			marko.setRandomPenColor();
			
		}
		
		
		
		
		
	}

}
