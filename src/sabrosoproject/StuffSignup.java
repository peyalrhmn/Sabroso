package sabrosoproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class StuffSignup extends JFrame{

	private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
	private JPasswordField passwordField,passwordField_1;
	JButton btnNewButton_2,btnNewButton,btnNewButton_1;
	private Container Panel;
	private Font f,ff;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuffSignup window = new StuffSignup();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StuffSignup() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}

	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		
		this.setBounds(100, 100, 741, 417);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		f = new Font("Bookman Old Style",Font.BOLD,15);
		ff = new Font("Bookman Old Style",Font.PLAIN,12);
		
		JLabel lblNewLabel = new JLabel("Please fill up the form for Stuff signup");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(f);
		lblNewLabel.setBounds(215, 27, 325, 24);
		Panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your name :");
		lblNewLabel_1.setFont(ff);
		lblNewLabel_1.setBounds(123, 64, 149, 14);
		Panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter password :");
		lblNewLabel_2.setFont(ff);
		lblNewLabel_2.setBounds(123, 116, 149, 14);
		Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Re-enter password :");
		lblNewLabel_3.setFont(ff);
		lblNewLabel_3.setBounds(123, 141, 149, 14);
		Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Birth Date :");
		lblNewLabel_4.setFont(ff);
		lblNewLabel_4.setBounds(123, 191, 149, 14);
		Panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter nationality :");
		lblNewLabel_5.setFont(ff);
		lblNewLabel_5.setBounds(123, 216, 149, 14);
		Panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter religion :");
		lblNewLabel_6.setFont(ff);
		lblNewLabel_6.setBounds(123, 241, 149, 14);
		Panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter email :");
		lblNewLabel_7.setFont(ff);
		lblNewLabel_7.setBounds(123, 266, 149, 14);
		Panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter contact no. :");
		lblNewLabel_8.setFont(ff);
		lblNewLabel_8.setBounds(123, 291, 149, 14);
		Panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Enter your address :");
		lblNewLabel_9.setFont(ff);
		lblNewLabel_9.setBounds(123, 166, 149, 14);
		Panel.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(380, 62, 229, 20);
		Panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(380, 110, 229, 20);
		passwordField.setEchoChar('$');
		Panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(380, 139, 229, 20);
		passwordField_1.setEchoChar('$');
		Panel.add(passwordField_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(380, 164, 229, 20);
		Panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(380, 189, 229, 20);
		Panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(380, 214, 229, 20);
		Panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(380, 239, 229, 20);
		Panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(380, 264, 229, 20);
		Panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(380, 289, 229, 20);
		Panel.add(textField_6);
		textField_6.setColumns(10);
		
		btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setFont(ff);
		btnNewButton_2.setBounds(509, 320, 89, 23);
		Panel.add(btnNewButton_2);
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(11, 11, 41, 23);
		Panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(ff);
		btnNewButton_1.setBounds(637, 10, 78, 23);
		Panel.add(btnNewButton_1);
		
		lblNewLabel_10 = new JLabel("At least 8 char, digit, upper and lower case char");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(ff);
		lblNewLabel_10.setBounds(304, 93, 305, 14);
		getContentPane().add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\Menu.jpg"));
		lblNewLabel_11.setBounds(0, 0, 725, 378);
		getContentPane().add(lblNewLabel_11);
	}
	
	private void first() {
		btnNewButton_2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				
				String userName = textField.getText();
				String password = passwordField.getText();
				String password1 = passwordField_1.getText();
				String address = textField_1.getText();
				String birthDate = textField_2.getText();
				String nationality = textField_3.getText();
				String religion = textField_4.getText();
				String email = textField_5.getText();
				String contact = textField_6.getText();
				
				if(second() && password.length()>7 && password.equals(password1)) {
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter("Stuff.txt",true));
						BufferedWriter writer1 = new BufferedWriter(new FileWriter("Information Stuff.txt",true));
						//FileWriter writer = new FileWriter("Stuff.txt");
						writer.write(userName + ","+ password+ "\n"+ address+ ","+ birthDate+ ","+ nationality+ ","+ religion+ ","+ email+ ","+ contact+"\n");
						writer1.write("Name : "+userName + ","+"Nationality : "+ nationality+ ","+"Religion : "+ religion+ ","+"Email: "+ email+"\n");
						writer.close();
						writer1.close();
						JOptionPane.showMessageDialog(null, "Signup successful");
						close();
						StuffLogin stuff = new StuffLogin();
						stuff.setVisible(true);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Stuff data saving Error!");
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Password not matched! Or did not match with condition!");
				}
				
			}
			
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					close();
					Signup s = new Signup();
					s.setVisible(true);
					
					
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Something went wrong!");
				}
				
				
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Home ho = new Home();
				ho.setVisible(true);
			}
		});
	}
	private boolean second() {
		String password  = passwordField.getText();
		String password1  = passwordField_1.getText();
		
			boolean hasNum = false; boolean hasCap = false; boolean hasLow = false; char c;
			
			for(int i=0;i<password.length();i++) {
				c = password.charAt(i);
				if(Character.isDigit(c)) {
					hasNum=true;
				}
				else if(Character.isUpperCase(c)) {
					hasCap=true;
				}
				else if(Character.isLowerCase(c)) {
					hasLow=true;
				}
				if(hasNum && hasCap && hasLow) {
					return true;
				}
			}
			return false;
	}

}
