package Controiler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ConnectionToDB;
import Model.TaskOperation;
import View.TodayTask;

public class TodayListener  implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("���������"))
		{
			TaskOperation.DoneTask();
		}
		
		if(a.getActionCommand().equals("������� ����������"))
		{
			TaskOperation.DeleteDone();
		}
	}

}
