package Controiler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ConnectionToDB;
import Model.TaskOperation;
import View.TodayTask;

public class LongListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("���������"))
		{
			TaskOperation.DoneLong();
		}
		if(a.getActionCommand().equals("������� ����������"))
		{
			TaskOperation.DeleteDoneSelected();
		}
	}

}
