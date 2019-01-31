package Controiler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.PositionOperations;
import Model.TaskOperation;

public class PositionListener implements ActionListener 
{

	@Override
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("Применить"))
		{
			PositionOperations.Complete();
		} 
		if(a.getActionCommand().equals("Просмотреть"))
		{
			PositionOperations.Seen();
		} 
	}

}
