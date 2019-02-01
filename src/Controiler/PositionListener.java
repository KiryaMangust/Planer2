package Controiler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.PositionOperations;

public class PositionListener implements ActionListener{
	
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("Применить")) PositionOperations.Complete();
		if(a.getActionCommand().equals("Просмотреть")) PositionOperations.Seen();
	}
}
