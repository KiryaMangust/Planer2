package Controiler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.ConnectionToDB;
import Model.TaskOperation;
import View.TommorowTask;
//Listener for 'Tommorow' window with full list of tasks
public class TommorowListener implements ActionListener{
	
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("Создать")) TaskOperation.CreateNewTask();
		if(a.getActionCommand().equals("Очистить")) TommorowTask.textArea.setText("");
		if(a.getActionCommand().equals("Показать всё")) ConnectionToDB.Refresh();
		if(a.getActionCommand().equals("Удалить")) TaskOperation.DeleteSelected();
	}
}
