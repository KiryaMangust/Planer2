package Controiler;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import Model.ConnectionToDB;
//�������� ����������� ������������ ����� ������ � DayChooser

public class Calendarlistener implements PropertyChangeListener 
{
	public void propertyChange(PropertyChangeEvent arg0) 
	{
		ConnectionToDB.DaySelection();
	}
}
