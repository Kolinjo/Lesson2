package exercises;

import javax.swing.JOptionPane;

/*
 * Count down a rocket launch!
 * 
 * Print the numbers from 10 to 1, then print  “blastoff”. 
 */

public class NASACountdown {

	
	
	public static void main(String[] args) 
	{
	
		JOptionPane.showMessageDialog(null, "NASA is counting down before a rocket lunch!");
		
		for (int i = 10; i >= 0 ; i--) 
		{
			if (i > 0){
				JOptionPane.showMessageDialog(null, "It has left " + i + " seconds to blastoff!!");
			}else if (i == 0){
				JOptionPane.showMessageDialog(null, "Rocket is launched!!");
			}else{
				JOptionPane.showMessageDialog(null, "Unsucessful rocket launch");
			}
			
		}
		
	}
}
