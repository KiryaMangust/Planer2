package Model;

import Controiler.Position;
import View.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Position.open();
		MainWindow ViewProgram = new MainWindow();
		ViewProgram.main();
		Date.TodayIs();
		ConnectionToDB.open();
	}

}
