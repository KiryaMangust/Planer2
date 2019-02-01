package Controiler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.TaskOperation;

public class TodayListener  implements ActionListener{

	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("Выполнено")) TaskOperation.DoneTask();
		if(a.getActionCommand().equals("Удалить выполненые")) TaskOperation.DeleteDone();
	}
}
