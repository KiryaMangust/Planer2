package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.DebugGraphics;
import com.toedter.calendar.JCalendar;

import Controiler.Calendarlistener;
import Controiler.Position;
import Controiler.TommorowListener;
import Model.ConnectionToDB;
import java.awt.Dimension;
import javax.swing.JSeparator;

public class TommorowTask {

	public static JFrame frame;
	public static JCalendar calendar = new JCalendar();
	public static JTextArea textArea = new JTextArea();
	public static JCheckBox checkBox = new JCheckBox("Важное");
	public static JCheckBox checkBox_1 = new JCheckBox("Долгосрочное");

	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TommorowTask window = new TommorowTask();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TommorowTask() 
	{
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.setTitle("\u0412\u0441\u0435 \u0437\u0430\u0434\u0430\u043D\u0438\u044F");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 373, 321, 214);
		frame.getContentPane().add(scrollPane);
		
		scrollPane.setViewportView(textArea);
		textArea.setMargin(new Insets(2, 6, 2, 2));
		textArea.setTabSize(2);
		textArea.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea.setLineWrap(true);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(79, 348, 636, 11);
		frame.getContentPane().add(separator);
		
		JButton button = new JButton("Создать");
		button.setFont(new Font("Arial", Font.PLAIN, 20));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.WHITE);
		button.setFocusable(false);
		button.setFocusTraversalKeysEnabled(false);
		button.setFocusPainted(false);
		button.setBounds(51, 636, 145, 32);
		button.addActionListener(new TommorowListener());
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Удалить");
		button_1.setFont(new Font("Arial", Font.PLAIN, 20));
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setBackground(Color.WHITE);
		button_1.setFocusable(false);
		button_1.setFocusTraversalKeysEnabled(false);
		button_1.setFocusPainted(false);
		button_1.addActionListener(new TommorowListener());
		button_1.setBounds(608, 636, 135, 32);
		frame.getContentPane().add(button_1);
		
		checkBox.setForeground(Color.WHITE);
		checkBox.setFont(new Font("Arial", Font.PLAIN, 16));
		checkBox.setBackground(Color.DARK_GRAY);
		checkBox.setBounds(77, 602, 86, 25);
		frame.getContentPane().add(checkBox);
		
		checkBox_1.setForeground(Color.WHITE);
		checkBox_1.setFont(new Font("Arial", Font.PLAIN, 16));
		checkBox_1.setBackground(Color.DARK_GRAY);
		checkBox_1.setBounds(219, 602, 135, 25);
		frame.getContentPane().add(checkBox_1);
		
		calendar.getDayChooser().setForeground(Color.DARK_GRAY);
		calendar.getDayChooser().getDayPanel().setPreferredSize(new Dimension(122, 133));
		calendar.getDayChooser().getDayPanel().setMinimumSize(new Dimension(122, 133));
		calendar.getDayChooser().getDayPanel().setBackground(Color.DARK_GRAY);
		calendar.getDayChooser().setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		calendar.getDayChooser().setFocusTraversalKeysEnabled(false);
		calendar.getDayChooser().setDoubleBuffered(false);
		calendar.getDayChooser().setFont(new Font("Arial", Font.PLAIN, 18));
		calendar.getDayChooser().setWeekOfYearVisible(false);
		calendar.setDecorationBackgroundColor(new Color(192, 192, 192));
		calendar.getDayChooser().addPropertyChangeListener(new Calendarlistener());
		calendar.setBounds(51, 28, 692, 345);
		frame.getContentPane().add(calendar);
		
		ConnectionToDB.listAll.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ConnectionToDB.listAll.setFont(new Font("Arial", Font.PLAIN, 18));
		ConnectionToDB.listAll.setSelectedIndex(0);
		frame.getContentPane().add(ConnectionToDB.listAll);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(415, 373, 328, 250);
		scrollPane_1.getViewport().setView(ConnectionToDB.listAll);
		frame.getContentPane().add(scrollPane_1);
		
		JButton button_2 = new JButton("Показать всё");
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setFont(new Font("Arial", Font.PLAIN, 20));
		button_2.setFocusable(false);
		button_2.setFocusTraversalKeysEnabled(false);
		button_2.setFocusPainted(false);
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new TommorowListener());
		button_2.setBounds(415, 636, 181, 32);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Очистить");
		button_3.setForeground(Color.DARK_GRAY);
		button_3.setFont(new Font("Arial", Font.PLAIN, 20));
		button_3.setFocusable(false);
		button_3.setFocusTraversalKeysEnabled(false);
		button_3.setFocusPainted(false);
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new TommorowListener());
		button_3.setBounds(208, 636, 164, 32);
		frame.getContentPane().add(button_3);
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.setBounds(Position.X[2],Position.Y[2], 800, 735);
	}
}
