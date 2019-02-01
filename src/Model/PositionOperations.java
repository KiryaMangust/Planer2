package Model;
import javax.swing.JOptionPane;
import Controiler.Position;
import View.LongTimeTask;
import View.MainWindow;
import View.PositionWindow;
import View.TodayTask;
import View.TommorowTask;

public class PositionOperations 
{
	public static void Complete() 
	{
		TakeInfo();
		Position.SentXY();
	}
	
	//Void for refreshing windows positions
	public static void Seen()
	{
		TakeInfo();
		MainWindow.frmMyPlans.dispose();
		TodayTask.frmTodayTasks.dispose();
		TommorowTask.frame.dispose();
		LongTimeTask.frame.dispose();
		MainWindow.main();
		TodayTask.main();
		TommorowTask.main();
		LongTimeTask.main();
	}
	
	//Taking information from fields on 'Position' window
	public static void TakeInfo()
	{
		try 
		{
			Position.X[0] = Integer.parseInt(PositionWindow.textField.getText());
			Position.X[1] = Integer.parseInt(PositionWindow.textField_6.getText());
			Position.X[2] = Integer.parseInt(PositionWindow.textField_4.getText());
			Position.X[3] = Integer.parseInt(PositionWindow.textField_2.getText());
			
			Position.Y[0] = Integer.parseInt(PositionWindow.textField_1.getText());
			Position.Y[1] = Integer.parseInt(PositionWindow.textField_7.getText());
			Position.Y[2] = Integer.parseInt(PositionWindow.textField_5.getText());
			Position.Y[3] = Integer.parseInt(PositionWindow.textField_3.getText());
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Все поля должны быть заполнены, и ТОЛЬКО целыми числами!");
		}
	}
	
	//Sending values to fields into 'Position' window
	public static void SentInfo()
	{
		PositionWindow.textField.setText(Integer.toString(Position.X[0]));
		PositionWindow.textField_6.setText(Integer.toString(Position.X[1]));
		PositionWindow.textField_4.setText(Integer.toString(Position.X[2]));
		PositionWindow.textField_2.setText(Integer.toString(Position.X[3]));
		
		PositionWindow.textField_1.setText(Integer.toString(Position.Y[0]));
		PositionWindow.textField_7.setText(Integer.toString(Position.Y[1]));
		PositionWindow.textField_5.setText(Integer.toString(Position.Y[2]));
		PositionWindow.textField_3.setText(Integer.toString(Position.Y[3]));
	}
}
