package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Controiler.LongListener;
import Controiler.Position;
import Controiler.TodayListener;
import Model.ConnectionToDB;

import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class LongTimeTask {

	public static JFrame frame;

	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LongTimeTask window = new LongTimeTask();
					window.frame.setVisible(true);
				} catch (Exception e) {
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
		frame.setTitle("\u0414\u043E\u043B\u0433\u043E\u0441\u0440\u043E\u0447\u043D\u044B\u0435 \u0437\u0430\u0434\u0430\u043D\u0438\u044F");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		ConnectionToDB.listLong.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ConnectionToDB.listLong.setFont(new Font("Arial", Font.PLAIN, 18));
		ConnectionToDB.listLong.setSelectedIndex(0);
		frame.getContentPane().add(ConnectionToDB.listLong);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 32, 455, 200);
		scrollPane.getViewport().setView(ConnectionToDB.listLong);
		frame.getContentPane().add(scrollPane);
		
		JButton button_2 = new JButton("Выполнено");
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setFont(new Font("Arial", Font.PLAIN, 20));
		button_2.setFocusable(false);
		button_2.setFocusTraversalKeysEnabled(false);
		button_2.setFocusPainted(false);
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new LongListener());
		button_2.setBounds(50, 245, 193, 32);
		frame.getContentPane().add(button_2);
		
		JButton button = new JButton("Удалить выполненые");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Arial", Font.PLAIN, 20));
		button.setFocusable(false);
		button.setFocusTraversalKeysEnabled(false);
		button.setFocusPainted(false);
		button.setBackground(Color.WHITE);
		button.addActionListener(new LongListener());
		button.setBounds(255, 245, 250, 32);
		frame.getContentPane().add(button);
		
		frame.setType(Type.UTILITY);
		frame.setBounds(Position.X[3],Position.Y[3], 560, 340);
	}
}
