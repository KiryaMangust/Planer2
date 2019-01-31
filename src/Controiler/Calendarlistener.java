package Controiler;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import Model.ConnectionToDB;
//Листенер считывающий переключения между датами в DayChooser

public class Calendarlistener implements PropertyChangeListener 
{
	public void propertyChange(PropertyChangeEvent arg0) 
	{
		ConnectionToDB.DaySelection();
	}
}
