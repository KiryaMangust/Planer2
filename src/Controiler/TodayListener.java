package Controiler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.TaskOperation;
//Listener for 'Today' window
public class TodayListener  implements ActionListener{

	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("���������")) TaskOperation.DoneTask();
		if(a.getActionCommand().equals("������� ����������")) TaskOperation.DeleteDone();
	}
}
