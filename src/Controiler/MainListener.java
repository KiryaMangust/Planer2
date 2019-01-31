package Controiler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.ConnectionToDB;
import Model.PositionOperations;
import Model.TaskOperation;
import View.*;

public class MainListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getActionCommand().equals("������� �� �������"))
		{
			ConnectionToDB.SelectToday();
			TodayTask.main();
		}
		
		if(a.getActionCommand().equals("������ ������"))
		{
			ConnectionToDB.SelectAll();
			TommorowTask.main();
		}
		
		if(a.getActionCommand().equals("������������ �������"))
		{
			ConnectionToDB.SelectLong();
			LongTimeTask.main();
		}
		if(a.getActionCommand().equals("����������������"))
		{
			PositionWindow.main();
		}
		if(a.getActionCommand().equals("������� ��"))
		{
			TaskOperation.DeleteAll();
		}
		if(a.getActionCommand().equals("� ���������"))
		{
			JOptionPane.showMessageDialog(null, "������! "
												+ "\n��� ����� ������, ����� � ��� �� ����������� "
												+ "\n������ ������������ ������� ��� ������� "
												+ "\n�����������. ��� ���� ���� ����� � ����������� "
												+ "\n�� �� �������� ��������� �����������!"
												+ "\n����� ������� ������ ���������"
												+ "\n������� WSIU ����� Lodz 2019");
		}
		
		
	}

}
