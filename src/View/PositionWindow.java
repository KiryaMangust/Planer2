package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import Controiler.PositionListener;
import Model.PositionOperations;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class PositionWindow {

	private JFrame frame;
	public static JTextField textField = new JTextField();
	public static JTextField textField_1 = new JTextField();
	public static JTextField textField_2 = new JTextField();
	public static JTextField textField_3 = new JTextField();
	public static JTextField textField_4 = new JTextField();
	public static JTextField textField_5 = new JTextField();
	public static JTextField textField_6 = new JTextField();
	public static JTextField textField_7 = new JTextField();

	public static void main() 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					PositionWindow window = new PositionWindow();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public PositionWindow() 
	{
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setTitle("\u041F\u043E\u0437\u0438\u0446\u0438\u043E\u043D\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435");
		frame.setType(Type.UTILITY);
		frame.setBounds(30, 30, 310, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(32, 50, 85, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(32, 79, 85, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(186, 50, 85, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(186, 79, 85, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(32, 151, 85, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(32, 180, 85, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(186, 151, 85, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(186, 180, 85, 22);
		frame.getContentPane().add(textField_7);
		
		JLabel label = new JLabel("\u0413\u043B\u0430\u0432\u043D\u043E\u0435 \u043E\u043A\u043D\u043E");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(12, 13, 180, 24);
		frame.getContentPane().add(label);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(12, 50, 56, 16);
		frame.getContentPane().add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setForeground(Color.WHITE);
		lblY.setBounds(12, 82, 56, 16);
		frame.getContentPane().add(lblY);
		
		JLabel label_1 = new JLabel("\u041D\u0430 \u0441\u0435\u0433\u043E\u0434\u043D\u044F");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(176, 114, 226, 24);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("X");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(166, 50, 56, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Y");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(166, 82, 56, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u0412\u0441\u0435 \u0437\u0430\u0434\u0430\u043D\u0438\u044F");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(15, 114, 226, 24);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("X");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(12, 151, 56, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Y");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(12, 183, 56, 16);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u0414\u043E\u043B\u0433\u043E\u0441\u0440\u043E\u0447\u043D\u044B\u0435");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_7.setBounds(166, 13, 226, 24);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("X");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(166, 151, 56, 16);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Y");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(166, 183, 56, 16);
		frame.getContentPane().add(label_9);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 221, 255, 24);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("Просмотреть");
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.addActionListener(new PositionListener());
		btnNewButton.setBounds(32, 241, 239, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Применить");
		button.setRequestFocusEnabled(false);
		button.setFocusable(false);
		button.setBackground(Color.WHITE);
		button.setForeground(Color.DARK_GRAY);
		button.setFocusTraversalKeysEnabled(false);
		button.setFocusPainted(false);
		button.setFont(new Font("Arial", Font.PLAIN, 20));
		button.addActionListener(new PositionListener());
		button.setBounds(32, 293, 239, 39);
		frame.getContentPane().add(button);
		
		PositionOperations.SentInfo();
		TodayTask.main();
		TommorowTask.main();
		LongTimeTask.main();
	}
}
