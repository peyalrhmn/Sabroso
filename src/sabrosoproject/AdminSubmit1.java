package sabrosoproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class AdminSubmit1 extends JFrame{

	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton_1,btnNewButton;
	private Container Panel;
	private Font f,ff;
	private JLabel lblNewLabel_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSubmit1 window = new AdminSubmit1();
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminSubmit1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		this.setBounds(100, 100, 740, 416);
		this.setTitle("Subroso");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		f = new Font("Bookman Old Style",Font.BOLD,15);
		ff = new Font("Bookman Old Style",Font.PLAIN,12);
		
		JLabel lblNewLabel = new JLabel("Please Submit for the further access");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(f);
		lblNewLabel.setBounds(231, 49, 324, 22);
		Panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(193, 122, 89, 14);
		Panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(ff);
		lblNewLabel_2.setBounds(193, 199, 89, 14);
		Panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(356, 120, 199, 20);
		Panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(356, 197, 199, 20);
		passwordField.setEchoChar('$');
		Panel.add(passwordField);
		
		btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setFont(ff);
		btnNewButton_1.setBounds(356, 257, 89, 23);
		Panel.add(btnNewButton_1);
		
		btnNewButton = new JButton("HOME");
		btnNewButton.setFont(ff);
		btnNewButton.setBounds(637, 11, 77, 23);
		Panel.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\Admin.jpg"));
		lblNewLabel_3.setBounds(0, 0, 724, 377);
		getContentPane().add(lblNewLabel_3);
		
		
	}
	private void first() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Home ho = new Home();
				ho.setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				String userName = textField.getText();
				String password = passwordField.getText();
				
				try {
					File writer = new File("Admin.txt");
					Scanner myreader = new Scanner(writer);
					
					String a = userName + "," + password;
					int count = 0;
					
					while(myreader.hasNextLine()) {
						String data = myreader.nextLine();
						
						if(a.equals(data)) {
							count++;
						}
					}
					
					
					if(count != 0) {
						JOptionPane.showMessageDialog(null, "Successful");
						close();
						ManagerLogin login = new ManagerLogin();
						login.setVisible(true);
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
					}
					myreader.close();
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Admin login Error!");
				}
			}
			
		});
		
	}
}
