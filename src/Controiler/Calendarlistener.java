package Controiler;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import Model.ConnectionToDB;
//Listener for JCalendar in 'Tommorow Task' window
public class Calendarlistener implements PropertyChangeListener{
	
	public void propertyChange(PropertyChangeEvent arg0) 
	{
		ConnectionToDB.DaySelection();
	}
}
