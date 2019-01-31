package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import Controiler.MainListener;
import Controiler.Position;

import java.awt.Cursor;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainWindow {

	public static JFrame frmMyPlans;
	public static JLabel date = new JLabel();

	public static void main() 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MainWindow window = new MainWindow();
					window.frmMyPlans.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public MainWindow() 
	{
		initialize();
	}

	private void initialize() {
		frmMyPlans = new JFrame();
		frmMyPlans.setResizable(false);
		frmMyPlans.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmMyPlans.setBackground(Color.DARK_GRAY);
		frmMyPlans.getContentPane().setForeground(Color.WHITE);
		frmMyPlans.setType(Type.UTILITY);
		frmMyPlans.getContentPane().setBackground(Color.DARK_GRAY);
		frmMyPlans.getContentPane().setLayout(null);
		
		
		JButton ButtonToday = new JButton("Задания на сегодня");
		ButtonToday.setFocusPainted(false);
		ButtonToday.setFocusTraversalKeysEnabled(false);
		ButtonToday.setFocusable(false);
		ButtonToday.setAlignmentX(Component.CENTER_ALIGNMENT);
		ButtonToday.setForeground(Color.DARK_GRAY);
		ButtonToday.setBackground(Color.WHITE);
		ButtonToday.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonToday.setBounds(50, 73, 250, 40);
		ButtonToday.addActionListener(new MainListener());
		frmMyPlans.getContentPane().add(ButtonToday);
		
		JButton ButtonTomorrow = new JButton("Полный список");
		ButtonTomorrow.setFocusPainted(false);
		ButtonTomorrow.setFocusTraversalKeysEnabled(false);
		ButtonTomorrow.setFocusable(false);
		ButtonTomorrow.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonTomorrow.setBackground(Color.WHITE);
		ButtonTomorrow.setForeground(Color.DARK_GRAY);
		ButtonTomorrow.setBounds(50, 126, 250, 40);
		ButtonTomorrow.addActionListener(new MainListener());
		frmMyPlans.getContentPane().add(ButtonTomorrow);
		
		JButton ButtonReset = new JButton("\u041E\u0431\u043D\u043E\u0432\u0438\u0442\u044C ");
		ButtonReset.setForeground(Color.DARK_GRAY);
		ButtonReset.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonReset.setFocusable(false);
		ButtonReset.setFocusTraversalKeysEnabled(false);
		ButtonReset.setFocusPainted(false);
		ButtonReset.setBackground(Color.WHITE);
		ButtonReset.setBounds(50, 232, 250, 40);
		frmMyPlans.getContentPane().add(ButtonReset);
		date.setHorizontalTextPosition(SwingConstants.CENTER);
		
		date.setForeground(Color.WHITE);
		date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		date.setBounds(59, 285, 236, 35);
		
		frmMyPlans.getContentPane().add(date);
		
		JLabel lblVersion = new JLabel("\u0412\u0435\u0440\u0441\u0438\u044F 1.0");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVersion.setForeground(Color.DARK_GRAY);
		lblVersion.setBounds(217, 23, 83, 26);
		frmMyPlans.getContentPane().add(lblVersion);
		
		JButton button = new JButton("Долгосрочные задания");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Arial", Font.PLAIN, 20));
		button.setFocusable(false);
		button.setFocusTraversalKeysEnabled(false);
		button.setFocusPainted(false);
		button.setBackground(Color.WHITE);
		button.setBounds(50, 179, 250, 40);
		button.addActionListener(new MainListener());
		frmMyPlans.getContentPane().add(button);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(50, 23, 250, 26);
		frmMyPlans.getContentPane().add(menuBar);
		
		JMenu menu = new JMenu("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438");
		menu.setForeground(Color.DARK_GRAY);
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Позиционирование");
		menuItem.addActionListener(new MainListener());
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Удалить всё");
		menuItem_1.addActionListener(new MainListener());
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("О Программе");
		menuItem_2.addActionListener(new MainListener());
		menu.add(menuItem_2);
		frmMyPlans.setTitle("\u041C\u043E\u0438 \u041F\u043B\u0430\u043D\u044B");
		frmMyPlans.setBounds(Position.X[0],Position.Y[0], 350, 380);
		frmMyPlans.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

