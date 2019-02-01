package Model;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class Collor {
	
	public static String IfImportant1;
	public static String IfDone;
	public static int a,b;
	
	@SuppressWarnings("unchecked")
	public static void SetColor() 
	{
		ConnectionToDB.listT.setCellRenderer(new DefaultListCellRenderer() 
		{
            public Component getListCellRendererComponent(JList list, Object value, int index,boolean isSelected, boolean cellHasFocus) 
            {
                 Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                 if(Size(value.toString()))
                 {
                	 //'a' and 'b' are special flags. They are necessary for checking, which task is important in the future.
                	 a=10;
                	 b=7;
                	 if (value.toString().length()<10)
                	 {
                    	 a=2;
                    	 b=1;
                	 }
                 }
                 else
                 {
                  	a=15;
                  	b=12;
                 }
                 if(Done(value.toString()))
                 {
                	 setBackground(new Color(171, 253, 160));
                 }
                 if(Important(value.toString()))
                 {
                	 setBackground(new Color(253, 253, 160));
                 }
                 if(isSelected)
                 {
                	 setBackground(Color.DARK_GRAY);
                	 setForeground(Color.white);
                 }
				return c;
            }
       });
	}

	public static boolean Size(String value)
	{
		int size = value.length();
		return (size<16);
	}
	
	public static boolean Done(String value)
	{
		int size = value.length();
		IfDone = value.substring(size-6, size);
		return (IfDone.equals("(Done)"));
	}
	
	public static boolean Important(String value)
	{
		int size = value.length();
		IfImportant1 = value.substring(size-a, size-b);
		return (IfImportant1.equals("(i)"));
	}
}


