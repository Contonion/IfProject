package controller;
import java.util.ArrayList;

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
		whileandfor();
		loopy();
		loopz();
		
	}
	/**
	 * Does a loop until the user has a certain abount of candy bars
	 */
	private void whileandfor() {
		boolean IsComplete = false;
		int AmountOfCandy = 0;
		int AmountNeeded = 10;
		while(!IsComplete) {
		AmountOfCandy++;
		if (AmountOfCandy >= AmountNeeded) {
		System.out.println("I have " + AmountNeeded + " Candy bars!");
		IsComplete = true;
		} else {
			System.out.println("Im going to go to the store to buy a Caiden Tolman flavored candy bar!");
		}
		}
		
	}
	/**
	 * Another loop that just repeats numbers until it has reached 10
	 */
	private void loopz()
	{
		int number = 0;
		boolean LoopDone = false;
		while(!LoopDone)
		{
			number++;
			if (number >= 10)
			{
				LoopDone = true;
			}
		}
	}
	private void loopy() 

	{
		
		//Define variable before loop
		boolean isDone = false;
		int count = 0;
		boolean complete = false;
		/**
		 * Has the user create a password, and asks the user for input, and then adds the "Give me Input" to the item, and then 
		 */
		
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
	private void lotsOfRuns()
	{
		ArrayList<Run> myRuns = new ArrayList<Run>();
		
	}
	
	public String toString()
	{
		String description = "This is a run";
		String name = ""
				+ "Bob";
		description += " The Run is named " + name;
		int timeMinutes = 5;
		description += " and it took " + timeMinutes  + " minutes to run";
		return description;
	}
	
	private void askUser() {
		String response = JOptionPane.showInputDialog(null, "Price");
		Car userRun = new Car();
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "No! type a valid number in for the distance");
		}
		userRun.setDistance(Double.parseDouble(response));
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type an integer value like 826458723649875692386425...");
		}
		return isValid;
	}
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a .");
		}
		return isValid;
}
	
}