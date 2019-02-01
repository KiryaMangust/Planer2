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
		
		JButton ButtonDone = new JButton("Выполнено");
		ButtonDone.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonDone.setForeground(Color.DARK_GRAY);
		ButtonDone.setBackground(Color.WHITE);
		ButtonDone.setFocusable(false);
		ButtonDone.setFocusTraversalKeysEnabled(false);
		ButtonDone.setFocusPainted(false);
		ButtonDone.setBounds(48, 233, 341, 33);
		ButtonDone.addActionListener(new TodayListener());
		frmTodayTasks.getContentPane().add(ButtonDone);
		
		JButton ButtonDelete = new JButton("Удалить выполненые");
		ButtonDelete.setForeground(Color.DARK_GRAY);
		ButtonDelete.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonDelete.setFocusable(false);
		ButtonDelete.setFocusTraversalKeysEnabled(false);
		ButtonDelete.setBackground(Color.WHITE);
		ButtonDelete.setBounds(48, 279, 341, 33);
		ButtonDelete.addActionListener(new TodayListener());
		frmTodayTasks.getContentPane().add(ButtonDelete);
		
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
