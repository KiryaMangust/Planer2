package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ConnectionToDB 
{
	public static Connection co;
	public static DefaultListModel listModel = new DefaultListModel();
	public static DefaultListModel listModelAll = new DefaultListModel();
	public static DefaultListModel listModelLong = new DefaultListModel();
	public static JList listT = new JList(listModel);
	public static JList listAll = new JList(listModelAll);
	public static JList listLong = new JList(listModelLong);
	
	//Void with creating connection with DB
	public static boolean open ()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			co = DriverManager.getConnection("jdbc:sqlite:Sql\\Plans.db");
			return true;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	//Taking information about TODAY tasks
	public static void SelectToday ()
	{
		try
		{	
			listModel.removeAllElements();	
			Statement statement = co.createStatement();
			String querry = "SELECT * From Plans;";
			ResultSet rs = statement.executeQuery(querry);
			while (rs.next()) 
			{
		        String date = rs.getString(1);
				String Task = rs.getString(2);
				String Impo = rs.getString(3);
				String Done = rs.getString(4);
				if(date.equals(Date.TodayDate))
				{
					if(Impo.equals("(i)"))
					{
						listModel.addElement(Task+" "+Impo+" "+Done);
					}
					else
					{
						listModel.addElement(Task+" "+Done);					
					}
				}
				else;
			}
			rs.close();
			statement.close();
			Collor.SetColor();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	//Taking information about All tasks
	public static void SelectAll ()
	{
		try
		{	
			listModelAll.removeAllElements();	
			Statement statement = co.createStatement();
			String querry = "SELECT * From Plans;";
			ResultSet rs = statement.executeQuery(querry);
			while (rs.next()) 
			{
		        String Date = rs.getString(1);
				String Task = rs.getString(2);
				String Impo = rs.getString(3);
				String Done = rs.getString(4);
				if(Impo.equals("(i)"))
				{
					listModelAll.addElement(Date +" " +Task+" "+Impo+" "+Done);
				}
				else
				{
					listModelAll.addElement(Date +" " +Task+" "+Done);					
				}
			}
			rs.close();
			statement.close();
			Collor.SetColor();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	//Void witch send information into list, with date selected on JCalendar
	public static void DaySelection()
	{
			Date.CalendarDate();	
			try
			{
				listModelAll.removeAllElements();	
				Statement statement = co.createStatement();
				String querry = "SELECT * From Plans Where Date = '"+ Date.sqlDate1 +"';";
				ResultSet rs = statement.executeQuery(querry);
				while (rs.next()) 
				{
			        String Date = rs.getString(1);
					String Task = rs.getString(2);
					String Impo = rs.getString(3);
					String Done = rs.getString(4);
					if(Impo.equals("(i)"))
					{
						listModelAll.addElement(Date +" " +Task+" "+Impo+" "+Done);
					}
					else
					{
						listModelAll.addElement(Date +" " +Task+" "+Done);					
					}
				}
				rs.close();
				statement.close();
				Collor.SetColor();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
	}
	//Taking information about LONG tasks
	public static void SelectLong()
	{
		try
		{	
			listModelLong.removeAllElements();	
			Statement statement = co.createStatement();
			String querry = "SELECT * From LPlans;";
			ResultSet rs = statement.executeQuery(querry);
			while (rs.next()) 
			{
				String Task = rs.getString(1);
				String Done = rs.getString(2);
				listModelLong.addElement( Task+" "+Done);

			}
			rs.close();
			statement.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	//Refreshing information
	public static void Refresh()
	{
		SelectToday();
		SelectAll();
		SelectLong();
	}
}
