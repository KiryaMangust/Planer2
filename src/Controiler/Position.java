package Controiler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Model.Collor;
import Model.ConnectionToDB;
import Model.PositionOperations;

public class Position {
	
	public static int[] X = new int[8];
	public static int[] Y = new int[8];
	public static Connection co2;
	public static String[] Winodws = new String[4];

	public static void open ()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			co2 = DriverManager.getConnection("jdbc:sqlite:Sql\\Position.db");
			SelectXY();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void SelectXY ()
	{
		try
		{	
			for(int i=0; i<4; i++)
			{
				Winodws[0] = "Main";
				Winodws[1] = "Today";
				Winodws[2] = "AllT";
				Winodws[3] = "LongT";
				Statement statement = co2.createStatement();
				String querry = ("SELECT * From "+Winodws[i]+";");
				ResultSet rs = statement.executeQuery(querry);
				while (rs.next()) 
				{
			        X[i] = rs.getInt(1);
			        Y[i] = rs.getInt(2);
				}
				rs.close();
				statement.close();
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void SentXY()
	{
		try 
		{
			Winodws[0] = "Main";
			Winodws[1] = "Today";
			Winodws[2] = "AllT";
			Winodws[3] = "LongT";
			for(int i=0; i<4; i++)
			{
				String query2 = ("Delete From "+Winodws[i]+";");
				String query = ("INSERT INTO "+Winodws[i]+" (X,Y) VAlUES ("+X[i]+","+Y[i]+");");
				Statement statement = co2.createStatement ();
				statement.executeUpdate(query2);
				statement.executeUpdate(query);
				statement.close();
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
