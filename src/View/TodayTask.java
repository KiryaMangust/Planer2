package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import Model.ConnectionToDB;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import Controiler.Position;
import Controiler.TodayListener;

public class TodayTask {

	public static JFrame frmTodayTasks;

	public static void main() 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					TodayTask window = new TodayTask();
					window.frmTodayTasks.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public TodayTask() 
	{
		initialize();
	}

	private void initialize() {
		frmTodayTasks = new JFrame();
		frmTodayTasks.setTitle("\u0417\u0430\u0434\u0430\u043D\u0438\u044F \u043D\u0430 \u0441\u0435\u0433\u043E\u0434\u043D\u044F");
		frmTodayTasks.setResizable(false);
		frmTodayTasks.setType(Type.UTILITY);
		frmTodayTasks.getContentPane().setBackground(Color.DARK_GRAY);
		frmTodayTasks.getContentPane().setLayout(null);
		frmTodayTasks.setBounds(Position.X[1],Position.Y[1], 450, 380);
		
		JButton btnNewButton = new JButton("Выполнено");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(48, 233, 341, 33);
		btnNewButton.addActionListener(new TodayListener());
		frmTodayTasks.getContentPane().add(btnNewButton);
		
		JButton button_1 = new JButton("Удалить выполненые");
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setFont(new Font("Arial", Font.PLAIN, 20));
		button_1.setFocusable(false);
		button_1.setFocusTraversalKeysEnabled(false);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(48, 279, 341, 33);
		button_1.addActionListener(new TodayListener());
		frmTodayTasks.getContentPane().add(button_1);
		
		ConnectionToDB.listT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ConnectionToDB.listT.setFont(new Font("Arial", Font.PLAIN, 18));
		ConnectionToDB.listT.setSelectedIndex(0);
		frmTodayTasks.getContentPane().add(ConnectionToDB.listT);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 30, 344, 190);
		scrollPane.getViewport().setView(ConnectionToDB.listT);
		frmTodayTasks.getContentPane().add(scrollPane);
		
	}
}
