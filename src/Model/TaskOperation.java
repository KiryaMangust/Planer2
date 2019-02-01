package Model;

import java.sql.SQLException;
import java.sql.Statement;
import View.TommorowTask;

public class TaskOperation 
{
	public static String query;
	public static int a,b; 
	public static void CreateNewTask()
	{
		try
		{
			Date.CalendarDate();
			//���������� ������ �������
			String quest = TommorowTask.textArea.getText();
			String date = Date.sqlDate1.toString();
			//������������ �������
			if( quest.equals("") | quest.equals("� ����� �������, ��?"))
			{
				TommorowTask.textArea.setText("� ����� �������, ��?");
			}
			else
			{
				//������ � ��
				if(TommorowTask.checkBox_1.isSelected())
				{
					query = "INSERT INTO LPlans (Task, Done) " + "VAlUES ('"+ quest + "', '(In proces)')";
					Statement statement = ConnectionToDB.co.createStatement ();
					statement.executeUpdate(query);
					statement.close();
				}
				else
				{
					if (TommorowTask.checkBox.isSelected())
					{
						query = "INSERT INTO Plans (Date, Task, Important, Done) " + "VAlUES ('"+ date + "', '" + quest + "', '(i)', '(In proces)')";	
					}
					Statement statement = ConnectionToDB.co.createStatement ();
					statement.executeUpdate(query);
					statement.close();
					//��������� ������
				}
			}
			ConnectionToDB.Refresh();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void DoneTask()
	{
			try
			{
				Statement statement = ConnectionToDB.co.createStatement ();
				String task = ConnectionToDB.listT.getSelectedValue().toString();
				if(task.length()<14)
				{
					a=10;
					b=7;
				}
				else
				{
					a=15;
					b=12;
				}
				if(IfImportant(task))
				{
					String DBtask = task.substring(0, task.length()-16);
					String query = "Update Plans Set Done = '(Done)' Where Task = '" + DBtask + "';";
					statement.executeUpdate(query);
					statement.close();
				}
				else
				{
					String DBtask = task.substring(0, task.length()-12);
					String query = "Update Plans Set Done = '(Done)' Where Task = '" + DBtask + "';";
					statement.executeUpdate(query);
					statement.close();
				}
					ConnectionToDB.Refresh();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
	}
	
	public static void DeleteDone()
	{
		try
		{
			//���������� ������ �������
			a=10;
			b=7;
			int size = ConnectionToDB.listModel.size();
			for(int i=0; i < size ; i++)
			{
				String quest = ConnectionToDB.listModel.getElementAt(i).toString();
				if (Done(quest))
				{
					if(quest.length()<10)
					{
						int a=0,b=7;
						DeleteDoneDB(quest,a,b);
					}
					else
					{
						if (IfImportant(quest)) 
						{
							int a=0,b=11;
							DeleteDoneDB(quest,a,b);
						}
						else
						{
							int a=0,b=7;
							DeleteDoneDB(quest,a,b);
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void DeleteDoneDB(String quest, Integer a, Integer b)
	{
		try
		{
			Statement statement = ConnectionToDB.co.createStatement ();
			String task = quest.substring(a,quest.length()-b );
			String query = "Delete From Plans Where Task = '" + task + "';";
			statement.executeUpdate(query);
			statement.close();
			ConnectionToDB.Refresh();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void DeleteSelected()
	{
		try
		{
			//���������� ������ �������
					String quest = ConnectionToDB.listAll.getSelectedValue().toString();
					if (Done(quest))
					{
						a=10;
						b=7;
							if (IfImportant(quest)) 
							{
								int a=11,b=11;
								DeleteSelectedDB(quest,a,b);
							}
							else
							{
								int a=11,b=7;
								DeleteSelectedDB(quest,a,b);
							}
					}
					else
					{
						a=15;
						b=12;
							if (IfImportant(quest)) 
							{
								int a=11,b=16;
								DeleteSelectedDB(quest,a,b);
							}
							else
							{
								int a=11,b=12;
								DeleteSelectedDB(quest,a,b);
							}
					}
			}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void DeleteSelectedDB(String quest, Integer a, Integer b)
	{
		try 
		{
			Statement statement = ConnectionToDB.co.createStatement ();
			String task = quest.substring(a,quest.length()-b );
			String query = "Delete From Plans Where Task = '" + task + "';";
			statement.executeUpdate(query);
			statement.close();
			ConnectionToDB.Refresh();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void DoneLong()
	{
		try
		{
			Statement statement = ConnectionToDB.co.createStatement ();
			String task = ConnectionToDB.listLong.getSelectedValue().toString();
			String DBtask = task.substring(0, task.length()-12);
			String query = "Update LPlans Set Done = '(Done)' Where Task = '" + DBtask + "';";
			statement.executeUpdate(query);
			statement.close();
			ConnectionToDB.Refresh();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void DeleteDoneSelected()
	{
		try
		{
			//���������� ������ �������
				int size = ConnectionToDB.listModelLong.size();
				for(int i=0; i < size ; i++)
				{
					String quest = ConnectionToDB.listModelLong.getElementAt(i).toString();
					if (Done(quest))
					{
							Statement statement = ConnectionToDB.co.createStatement ();
							String task = quest.substring(0,quest.length()-7 );
							String query = "Delete From LPlans Where Task = '" + task + "';";
							statement.executeUpdate(query);
							statement.close();
					}
				}
				ConnectionToDB.Refresh();
			}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static boolean IfImportant(String task)
	{
		int longer = task.length();
		String IfImportant = task.substring(longer-a, longer-b);
		return (IfImportant.equals("(i)"));
	}

	public static boolean Done(String value)
	{
		int longer = value.length();
		String IfDone = value.substring(longer-6, longer);
		return (IfDone.equals("(Done)"));
	}

	public static void DeleteAll() 
	{
		try
		{
			String query = "DELETE FROM Plans;";
			Statement statement = ConnectionToDB.co.createStatement ();
			statement.executeUpdate(query);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		ConnectionToDB.Refresh();
	}
	
}
