package BinaryComputer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Font;
import java.awt.Color;

public class FullTactic {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	static int Cin = 0;
	ArrayList<String> answer = new ArrayList<String>();
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FullTactic window = new FullTactic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FullTactic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 590, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 354, 284, 57);
		frame.getContentPane().add(textField_2);

		textField = new JTextField();
		textField.setBounds(144, 35, 284, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(144, 113, 284, 57);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String stuff1 = textField.getText();
				String stuff2 = textField_1.getText();

				ArrayList<Character> ch1 = new ArrayList<Character>(stuff1.length());
				ArrayList<Character> ch2 = new ArrayList<Character>(stuff2.length());
				System.out.println(ch1);
				System.out.println(ch2);

				textField_2.setText("");

				for (int i = 0; i < stuff1.length(); i++) {
					ch1.add(i, stuff1.charAt(i));
				}
				for (int i = 0; i < stuff2.length(); i++) {
					ch2.add(i, stuff2.charAt(i));
				}
				System.out.println(ch1);
				System.out.println(ch2);
				while (ch1.size() > ch2.size()) {
					ch2.add(0, '0');
				}

				while (ch2.size() > ch1.size()) {
					ch1.add(0, '0');
				}
				System.out.println(ch1);
				System.out.println(ch2);
				ch1.add(0, '0');
				ch2.add(0, '0');
				System.out.println(ch1);
				System.out.println(ch2);

				for (int x = stuff1.length(); x >= 0; x--) {
					System.out.println(Cin + "what is Cinnnn");
					boolean A;
					boolean B;
					boolean C;

					String test1 = Character.toString(ch1.get(x));
					String test2 = Character.toString(ch2.get(x));

					int A1 = Integer.parseInt(test1);
					int B1 = Integer.parseInt(test2);

					if (A1 == 0) {
						A = false;
					} else {
						A = true;
					}
					if (B1 == 0) {
						B = false;
					} else {
						B = true;
					}
					if (Cin == 0) {
						C = false;
					} else {
						C = true;
					}

					System.out.println("A is: " + A);
					System.out.println("B is: " + B);
					System.out.println("C is: " + C);

					boolean Sum = ((A ^ B) ^ C);
					System.out.println(Sum + " SUM");
					boolean Cin2 = ((A && B) || (C && (A ^ B)));
					System.out.println(Cin2 + " Cin");

					if (Sum == true) {
						answer.add("1");
					}
					if (Sum == false) {
						answer.add("0");
					}

					if (Cin2 == true) {
						Cin = 1;
					} else {
						Cin = 0;
					}
				}
				for (int i = answer.size() - 1; i >= 0; i--) {
					textField_2.setText(textField_2.getText() + answer.get(i));
				}
				textField_2.cut();

				textField_3.setText(String.valueOf(Integer.parseInt(textField_2.getText(), 2)));
			}
		});
		btnNewButton.setBounds(322, 202, 207, 57);
		frame.getContentPane().add(btnNewButton);

		JButton btnSubtract = new JButton("SUBTRACT");
		btnSubtract.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnSubtract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String stuff1 = textField.getText();
				String stuff2 = textField_1.getText();

				ArrayList<Character> ch1 = new ArrayList<Character>(stuff1.length());
				ArrayList<Character> ch2 = new ArrayList<Character>(stuff2.length());
				System.out.println(ch1);
				System.out.println(ch2);

				textField_2.setText("");

				for (int i = 0; i < stuff1.length(); i++) {
					ch1.add(i, stuff1.charAt(i));
				}
				for (int i = 0; i < stuff2.length(); i++) {
					ch2.add(i, stuff2.charAt(i));
				}
				System.out.println(ch1);
				System.out.println(ch2);
				while (ch1.size() > ch2.size()) {
					ch2.add(0, '0');
				}

				while (ch2.size() > ch1.size()) {
					ch1.add(0, '0');
				}
				System.out.println(ch1);
				System.out.println(ch2);
				ch1.add(0, '0');
				ch2.add(0, '0');
				System.out.println(ch1);
				System.out.println(ch2);

				for (int x = stuff1.length(); x >= 0; x--) {
					System.out.println(Cin + "what is Cinnnn");
					boolean A;
					boolean B;
					boolean C;

					String test1 = Character.toString(ch1.get(x));
					String test2 = Character.toString(ch2.get(x));

					int A1 = Integer.parseInt(test1);
					int B1 = Integer.parseInt(test2);

					if (A1 == 0) {
						A = false;
					} else {
						A = true;
					}
					if (B1 == 0) {
						B = false;
					} else {
						B = true;
					}
					if (Cin == 0) {
						C = false;
					} else {
						C = true;
					}

					System.out.println("A is: " + A);
					System.out.println("B is: " + B);
					System.out.println("C is: " + C);

					boolean Sum = ((A ^ B) ^ C);
					System.out.println(Sum + " SUM");
					boolean Cin2 = ((C && !(A ^ B)) || (!A && B));
					System.out.println(Cin2 + " Cin");

					if (Sum == true) {
						answer.add("1");
					}
					if (Sum == false) {
						answer.add("0");
					}

					if (Cin2 == true) {
						Cin = 1;
					} else {
						Cin = 0;
					}
				}
				String x = "";
				for (int i = answer.size() - 1; i >= 0; i--) {
					 x +=  "" + answer.get(i);
				}
				
				textField_2.setText(x);

				textField_3.setText(String.valueOf(Integer.parseInt(textField_2.getText(), 2)));
				
				Cin = 0;
			}
		});
		btnSubtract.setBounds(57, 202, 207, 57);
		frame.getContentPane().add(btnSubtract);

		JButton btnNewButton_2 = new JButton("Decimal Add");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String stuff1 = textField.getText();
				String stuff2 = textField_1.getText();
				stuff1 = Integer.toBinaryString(Integer.parseInt(stuff1));
				stuff2 = Integer.toBinaryString(Integer.parseInt(stuff2));
				ArrayList<Character> ch1 = new ArrayList<Character>(stuff1.length());
				ArrayList<Character> ch2 = new ArrayList<Character>(stuff2.length());
				System.out.println(ch1);
				System.out.println(ch2);

				textField_2.setText("");

				for (int i = 0; i < stuff1.length(); i++) {
					ch1.add(i, stuff1.charAt(i));
				}
				for (int i = 0; i < stuff2.length(); i++) {
					ch2.add(i, stuff2.charAt(i));
				}
				System.out.println(ch1);
				System.out.println(ch2);
				while (ch1.size() > ch2.size()) {
					ch2.add(0, '0');
				}

				while (ch2.size() > ch1.size()) {
					ch1.add(0, '0');
				}
				System.out.println(ch1);
				System.out.println(ch2);
				ch1.add(0, '0');
				ch2.add(0, '0');
				System.out.println(ch1);
				System.out.println(ch2);

				for (int x = stuff1.length(); x >= 0; x--) {
					System.out.println(Cin + "what is Cinnnn");
					boolean A;
					boolean B;
					boolean C;

					String test1 = Character.toString(ch1.get(x));
					String test2 = Character.toString(ch2.get(x));

					int A1 = Integer.parseInt(test1);
					int B1 = Integer.parseInt(test2);

					if (A1 == 0) {
						A = false;
					} else {
						A = true;
					}
					if (B1 == 0) {
						B = false;
					} else {
						B = true;
					}
					if (Cin == 0) {
						C = false;
					} else {
						C = true;
					}

					System.out.println("A is: " + A);
					System.out.println("B is: " + B);
					System.out.println("C is: " + C);

					boolean Sum = ((A ^ B) ^ C);
					System.out.println(Sum + " SUM");
					boolean Cin2 = ((A && B) || (C && (A ^ B)));
					System.out.println(Cin2 + " Cin");

					if (Sum == true) {
						answer.add("1");
					}
					if (Sum == false) {
						answer.add("0");
					}

					if (Cin2 == true) {
						Cin = 1;
					} else {
						Cin = 0;
					}
				}
				for (int i = answer.size() - 1; i >= 0; i--) {
					textField_2.setText(textField_2.getText() + answer.get(i));
				}
				textField_2.cut();

				textField_3.setText(String.valueOf(Integer.parseInt(textField_2.getText(), 2)));
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_2.setBounds(322, 270, 207, 57);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("Decimal Sub");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String stuff1 = textField.getText();
				String stuff2 = textField_1.getText();
				stuff1 = Integer.toBinaryString(Integer.parseInt(stuff1));
				stuff2 = Integer.toBinaryString(Integer.parseInt(stuff2));
				ArrayList<Character> ch1 = new ArrayList<Character>(stuff1.length());
				ArrayList<Character> ch2 = new ArrayList<Character>(stuff2.length());
				System.out.println(ch1);
				System.out.println(ch2);

				textField_2.setText("");

				for (int i = 0; i < stuff1.length(); i++) {
					ch1.add(i, stuff1.charAt(i));
				}
				for (int i = 0; i < stuff2.length(); i++) {
					ch2.add(i, stuff2.charAt(i));
				}
				System.out.println(ch1);
				System.out.println(ch2);
				while (ch1.size() > ch2.size()) {
					ch2.add(0, '0');
				}

				while (ch2.size() > ch1.size()) {
					ch1.add(0, '0');
				}
				System.out.println(ch1);
				System.out.println(ch2);
				ch1.add(0, '0');
				ch2.add(0, '0');
				System.out.println(ch1);
				System.out.println(ch2);

				for (int x = stuff1.length(); x >= 0; x--) {
					System.out.println(Cin + "what is Cinnnn");
					boolean A;
					boolean B;
					boolean C;

					String test1 = Character.toString(ch1.get(x));
					String test2 = Character.toString(ch2.get(x));

					int A1 = Integer.parseInt(test1);
					int B1 = Integer.parseInt(test2);

					if (A1 == 0) {
						A = false;
					} else {
						A = true;
					}
					if (B1 == 0) {
						B = false;
					} else {
						B = true;
					}
					if (Cin == 0) {
						C = false;
					} else {
						C = true;
					}

					System.out.println("A is: " + A);
					System.out.println("B is: " + B);
					System.out.println("C is: " + C);

					boolean Sum = ((A ^ B) ^ C);
					System.out.println(Sum + " SUM");
					boolean Cin2 = ((C && !(A ^ B)) || (!A && B));
					System.out.println(Cin2 + " Cin");

					if (Sum == true) {
						answer.add("1");
					}
					if (Sum == false) {
						answer.add("0");
					}

					if (Cin2 == true) {
						Cin = 1;
					} else {
						Cin = 0;
					}
				}
				for (int i = answer.size() - 1; i >= 0; i--) {
					textField_2.setText(textField_2.getText() + answer.get(i));
				}
				textField_2.cut();

				textField_3.setText(String.valueOf(Integer.parseInt(textField_2.getText(), 2)));

			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_2_1.setBounds(57, 270, 207, 57);
		frame.getContentPane().add(btnNewButton_2_1);

		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				textField_2.setText("");
				textField_3.setText("");
				answer.clear();
			}
		});
		btnNewButton_1.setBounds(453, 371, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 354, 118, 57);
		frame.getContentPane().add(textField_3);

	}
}
