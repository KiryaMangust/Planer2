package Model;
import Controiler.Position;
import View.*;
//Just main class
public class Main 
{
	public static void main(String[] args) 
	{
		//Taking information about windows position from DB
		Position.open();
		//Graphic realization
		MainWindow ViewProgram = new MainWindow();
		ViewProgram.main();
		//Return today date
		Date.TodayIs();
		//Connection to DB with tasks
		ConnectionToDB.open();
	}

}
