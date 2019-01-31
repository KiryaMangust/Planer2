package Controiler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.ConnectionToDB;
import Model.TaskOperation;
import View.TommorowTask;

public class TommorowListener implements ActionListener 
{
	@Override
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("�������"))
		{
			TaskOperation.CreateNewTask();
		} 
		if(a.getActionCommand().equals("��������"))
		{
			TommorowTask.textArea.setText("");
		}
		if(a.getActionCommand().equals("�������� ��"))
		{
			ConnectionToDB.Refresh();
		}
		if(a.getActionCommand().equals("�������")) 
		{
			TaskOperation.DeleteSelected();
		}
	}
}
