package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import Controiler.LongListener;
import Controiler.Position;
import Model.ConnectionToDB;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class LongTimeTask {

	public static JFrame frame;

	public static void main() 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					LongTimeTask window = new LongTimeTask();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public LongTimeTask() 
	{
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Долгосрочные задания");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setType(Type.UTILITY);
		frame.setBounds(Position.X[3],Position.Y[3], 560, 340);
		
		ConnectionToDB.listLong.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ConnectionToDB.listLong.setFont(new Font("Arial", Font.PLAIN, 18));
		ConnectionToDB.listLong.setSelectedIndex(0);
		frame.getContentPane().add(ConnectionToDB.listLong);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 32, 455, 200);
		scrollPane.getViewport().setView(ConnectionToDB.listLong);
		frame.getContentPane().add(scrollPane);
		
		JButton buttonDone = new JButton("Выполнено");
		buttonDone.setForeground(Color.DARK_GRAY);
		buttonDone.setFont(new Font("Arial", Font.PLAIN, 20));
		buttonDone.setFocusable(false);
		buttonDone.setFocusTraversalKeysEnabled(false);
		buttonDone.setFocusPainted(false);
		buttonDone.setBackground(Color.WHITE);
		buttonDone.addActionListener(new LongListener());
		buttonDone.setBounds(50, 245, 193, 32);
		frame.getContentPane().add(buttonDone);
		
		JButton buttonDeleteDone = new JButton("Удалить выполненые");
		buttonDeleteDone.setForeground(Color.DARK_GRAY);
		buttonDeleteDone.setFont(new Font("Arial", Font.PLAIN, 20));
		buttonDeleteDone.setFocusable(false);
		buttonDeleteDone.setFocusTraversalKeysEnabled(false);
		buttonDeleteDone.setFocusPainted(false);
		buttonDeleteDone.setBackground(Color.WHITE);
		buttonDeleteDone.addActionListener(new LongListener());
		buttonDeleteDone.setBounds(255, 245, 250, 32);
		frame.getContentPane().add(buttonDeleteDone);
		
	}
}
