package Model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import View.TommorowTask;

public class Date 
{
	public static String TodayDate = new String();
	public static java.sql.Date sqlDate1;
	
	//Сегодняшняя дата
	public static void TodayIs() 
	{
		java.util.Date date = new java.util.Date();
		DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy");
		View.MainWindow.date.setText("Сегодня "+dateFormat.format(date));
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		TodayDate = dateFormat2.format(date);
	}

	//Считывание даты с календаря и трансформация в формат БД
	public static void CalendarDate() 
	{
		try
		{
			java.util.Date Date = TommorowTask.calendar.getDate();
			SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
			String Rdate = formatter1.format(Date);
			SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yy", Locale.ROOT);
			java.util.Date dat_utl = formatter2.parse(Rdate);
			sqlDate1 = new java.sql.Date(dat_utl.getTime());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
}
