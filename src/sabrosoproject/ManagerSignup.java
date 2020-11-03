package sabrosoproject;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ManagerSignup extends JFrame{

	private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
	private JPasswordField passwordField,passwordField_1;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8,lblNewLabel_9;
	private JButton btnNewButton_2,btnNewButton,btnNewButton_1;
	private Container Panel;
	private Font f,ff;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerSignup wind = new ManagerSignup();
					wind.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ManagerSignup() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		
		this.setBounds(100, 100, 736, 416);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		f = new Font("Bookman Old Style",Font.BOLD,15);
		ff = new Font("Bookman Old Style",Font.PLAIN,12);
		
		lblNewLabel_1 = new JLabel("Enter your name :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(ff);
		lblNewLabel_1.setBounds(125, 79, 142, 14);
		Panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Enter password :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(ff);
		lblNewLabel_2.setBounds(125, 121, 142, 14);
		Panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Re-enter password :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(ff);
		lblNewLabel_3.setBounds(125, 146, 142, 14);
		Panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(326, 77, 233, 20);
		Panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(326, 119, 233, 20);
		passwordField.setEchoChar('$');
		Panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(326, 144, 233, 20);
		passwordField_1.setEchoChar('$');
		Panel.add(passwordField_1);
		
		lblNewLabel_5 = new JLabel("Enter Birth Date :");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(ff);
		lblNewLabel_5.setBounds(125, 196, 142, 14);
		Panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Enter nationality :");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(ff);
		lblNewLabel_6.setBounds(125, 221, 142, 14);
		Panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Enter religion :");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(ff);
		lblNewLabel_7.setBounds(125, 246, 142, 14);
		Panel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Enter email :");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(ff);
		lblNewLabel_8.setBounds(125, 271, 142, 14);
		Panel.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Enter contact no :");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(ff);
		lblNewLabel_9.setBounds(125, 296, 142, 14);
		Panel.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(326, 169, 233, 20);
		Panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(326, 194, 233, 20);
		Panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(326, 219, 233, 20);
		Panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(326, 244, 233, 20);
		Panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(326, 269, 233, 20);
		Panel.add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setFont(ff);
		btnNewButton_2.setBounds(461, 325, 89, 23);
		Panel.add(btnNewButton_2);
		
		lblNewLabel = new JLabel("New Cheif! Please fill up the form");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(f);
		lblNewLabel.setBounds(231, 32, 293, 20);
		Panel.add(lblNewLabel);
		
		lblNewLabel_4 = new JLabel("Enter your address :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(ff);
		lblNewLabel_4.setBounds(125, 171, 142, 14);
		Panel.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(326, 294, 233, 20);
		Panel.add(textField_6);
		textField_6.setColumns(10);
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(10, 11, 41, 23);
		Panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(ff);
		btnNewButton_1.setBounds(637, 10, 73, 23);
		Panel.add(btnNewButton_1);
		
		lblNewLabel_10 = new JLabel("At least 8 char, digit, upper and lower case char");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(ff);
		lblNewLabel_10.setBounds(274, 104, 287, 14);
		getContentPane().add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\Outside.jpg"));
		lblNewLabel_11.setBounds(0, 0, 720, 377);
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
						FileWriter writer = new FileWriter("Manager.txt");
						writer.write(userName + ","+ password+ "\n"+ address+ ","+ birthDate+ ","+ nationality+ ","+ religion+ ","+ email+ ","+ contact+"\n");
						writer.close();
						JOptionPane.showMessageDialog(null, "Signup successful");
						close();
						ManagerLogin man = new ManagerLogin();
						man.setVisible(true);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Manager data saving Error!");
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Password not matched! Or did not match with condition!");
				}
				
				
			}
			
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Signup si = new Signup();
				si.setVisible(true);
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
