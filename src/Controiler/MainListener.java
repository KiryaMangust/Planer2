package Controiler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.ConnectionToDB;
import Model.TaskOperation;
import View.*;

public class MainListener implements ActionListener {

	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("Задания на сегодня"))
		{
			ConnectionToDB.SelectToday();
			TodayTask.main();
		}
		if(a.getActionCommand().equals("Полный список"))
		{
			ConnectionToDB.SelectAll();
			TommorowTask.main();
		}
		if(a.getActionCommand().equals("Долгосрочные задания"))
		{
			ConnectionToDB.SelectLong();
			LongTimeTask.main();
		}
		if(a.getActionCommand().equals("О Программе"))
		{
			JOptionPane.showMessageDialog(null, "Привет! "
												+ "\nЭто самая первая, сырая и еще не законченная "
												+ "\nверсия планировщика заданий для личного "
												+ "\nпользования. Еще есть куча багов и топорностей "
												+ "\nно он работает Приятного пользования!"
												+ "\nАвтор проекта Кирилл Тараненко"
												+ "\nСтудент WSIU город Lodz 2019");
		}
		if(a.getActionCommand().equals("Позиционирование"))	PositionWindow.main();
		if(a.getActionCommand().equals("Удалить всё"))	TaskOperation.DeleteAll();
		
	}
}
