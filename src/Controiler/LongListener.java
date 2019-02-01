package Controiler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.TaskOperation;

public class LongListener implements ActionListener{

	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("Выполнено")) TaskOperation.DoneLong();
		if(a.getActionCommand().equals("Удалить выполненые")) TaskOperation.DeleteDoneSelected();
	}

}
