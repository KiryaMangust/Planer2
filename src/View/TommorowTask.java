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
//Class with graphic initialization
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
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.setBounds(Position.X[2],Position.Y[2], 800, 735);
		
		JButton ButtonCreate = new JButton("Создать");
		ButtonCreate.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonCreate.setForeground(Color.DARK_GRAY);
		ButtonCreate.setBackground(Color.WHITE);
		ButtonCreate.setFocusable(false);
		ButtonCreate.setFocusTraversalKeysEnabled(false);
		ButtonCreate.setFocusPainted(false);
		ButtonCreate.setBounds(51, 636, 145, 32);
		ButtonCreate.addActionListener(new TommorowListener());
		frame.getContentPane().add(ButtonCreate);
		
		JButton ButtonDelete = new JButton("Удалить");
		ButtonDelete.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonDelete.setForeground(Color.DARK_GRAY);
		ButtonDelete.setBackground(Color.WHITE);
		ButtonDelete.setFocusable(false);
		ButtonDelete.setFocusTraversalKeysEnabled(false);
		ButtonDelete.setFocusPainted(false);
		ButtonDelete.addActionListener(new TommorowListener());
		ButtonDelete.setBounds(608, 636, 135, 32);
		frame.getContentPane().add(ButtonDelete);
		
		JButton ButtonShowAll = new JButton("Показать всё");
		ButtonShowAll.setForeground(Color.DARK_GRAY);
		ButtonShowAll.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonShowAll.setFocusable(false);
		ButtonShowAll.setFocusTraversalKeysEnabled(false);
		ButtonShowAll.setFocusPainted(false);
		ButtonShowAll.setBackground(Color.WHITE);
		ButtonShowAll.addActionListener(new TommorowListener());
		ButtonShowAll.setBounds(415, 636, 181, 32);
		frame.getContentPane().add(ButtonShowAll);
		
		JButton ButtonClear = new JButton("Очистить");
		ButtonClear.setForeground(Color.DARK_GRAY);
		ButtonClear.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonClear.setFocusable(false);
		ButtonClear.setFocusTraversalKeysEnabled(false);
		ButtonClear.setFocusPainted(false);
		ButtonClear.setBackground(Color.WHITE);
		ButtonClear.addActionListener(new TommorowListener());
		ButtonClear.setBounds(208, 636, 164, 32);
		frame.getContentPane().add(ButtonClear);
		
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
		
		ConnectionToDB.listAll.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ConnectionToDB.listAll.setFont(new Font("Arial", Font.PLAIN, 18));
		ConnectionToDB.listAll.setSelectedIndex(0);
		frame.getContentPane().add(ConnectionToDB.listAll);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(415, 373, 328, 250);
		scrollPane_1.getViewport().setView(ConnectionToDB.listAll);
		frame.getContentPane().add(scrollPane_1);
		
	}
}
