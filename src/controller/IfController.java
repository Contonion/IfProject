package controller;
import javax.swing.JOptionPane;

import ifmodel.Car;
public class IfController
{
	/**
	 * * Builds the instance of the Controller
	 */
	public IfController() 
	{
		
	}
	/**
	 * This is where the program starts calling methods to run the program
	 */
	
	public void start() 
	{
		loopy();
	}
	private void loopy() 
	{
		//Define variable before loop
		boolean isDone = false;
		int count = 0;
		boolean complete = false;
		
		String password = JOptionPane.showInputDialog(null, "Create a Password");
		while(!complete)
		{
			JOptionPane.showInputDialog("GIVE ME INPUT!!!!");
			JOptionPane.showMessageDialog(null, "NOM NOM");
			count++;
			if (count >= 10)
			{
				String answer = JOptionPane.showInputDialog(null, "whats the password out of this?");
				if (answer.equals(password)) {
					complete = true;
				} else {
					complete = false;
				}
			}
		}
		while (!isDone) //Test the Variable
		{
			JOptionPane.showMessageDialog(null, "Oke sorry");
			//Eventually change the loop variable
			
			count++;
			if (count >= 10)
			{
				isDone = true;	//update the variable		
			}
		}
	}
	
}

