package sabrosoproject;

import java.awt.event.*;
import java.io.File;
import java.util.Scanner;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class StuffLogin extends JFrame{

	private JTextField textField;
	private JPasswordField passwordField;
	JButton btnNewButton_2,btnNewButton,btnNewButton_1;
	private Container Panel;
	private Font f,ff;
	private JLabel lblNewLabel_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuffLogin window = new StuffLogin();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StuffLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		
		this.setBounds(100, 100, 740, 418);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		f = new Font("Bookman Old Style",Font.BOLD,15);
		ff = new Font("Bookman Old Style",Font.PLAIN,12);
		
		JLabel lblNewLabel = new JLabel("Please login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(f);
		lblNewLabel.setBounds(300, 72, 118, 22);
		Panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your name :");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(ff);
		lblNewLabel_1.setBounds(178, 136, 127, 14);
		Panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter password :");
		lblNewLabel_2.setFont(ff);
		lblNewLabel_2.setBounds(178, 203, 127, 14);
		Panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(390, 134, 165, 20);
		Panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(390, 201, 165, 20);
		passwordField.setEchoChar('$');
		Panel.add(passwordField);
		
		btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setFont(ff);
		btnNewButton_2.setBounds(390, 256, 89, 23);
		Panel.add(btnNewButton_2);
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(10, 11, 41, 23);
		Panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(ff);
		btnNewButton_1.setBounds(635, 10, 79, 23);
		Panel.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\FoodsAndGirl6.jpg"));
		lblNewLabel_3.setBounds(0, 0, 724, 379);
		getContentPane().add(lblNewLabel_3);
	}
	private void first() {
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				String password = passwordField.getText();
				
				try {
					File writer = new File("Stuff.txt");
					Scanner myreader = new Scanner(writer);
					
					String h = userName + "," + password;
					int count = 0;
					
					while(myreader.hasNextLine()) {
						String data = myreader.nextLine();
						
						if(h.equals(data)) {
							count++;
						}
					}
					
					
					if(count != 0) {
						JOptionPane.showMessageDialog(null, "Successful");
						
						close();

						new Order().setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
					}
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Stuff login error!");
				}
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Login lo = new Login();
				lo.setVisible(true);
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

}
