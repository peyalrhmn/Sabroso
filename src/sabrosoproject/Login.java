package sabrosoproject;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Login extends JFrame{
	
	private JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3;
	private Container Panel;
	private Font f,ff;
	private JLabel lblNewLabel_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		this.setBounds(100, 100, 740, 417);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		f = new Font("Bookman Old Style",Font.PLAIN,15);
		ff = new Font("Bookman Old Style",Font.PLAIN,12);
		
		JLabel lblNewLabel = new JLabel("Login as Manager");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(f);
		lblNewLabel.setBounds(159, 103, 150, 23);
		Panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login as Stuff");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(f);
		lblNewLabel_1.setBounds(453, 105, 121, 19);
		Panel.add(lblNewLabel_1);
		
		btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setFont(ff);
		btnNewButton_2.setBounds(185, 179, 71, 23);
		Panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Login");
		btnNewButton_3.setFont(ff);
		btnNewButton_3.setBounds(479, 179, 71, 23);
		Panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("OR");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(f);
		lblNewLabel_2.setBounds(348, 161, 30, 23);
		Panel.add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(ff);
		btnNewButton_1.setBounds(637, 10, 77, 23);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(10, 11, 41, 23);
		getContentPane().add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\Outside.jpg"));
		lblNewLabel_3.setBounds(0, 0, 724, 378);
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
				close();
				Home ho = new Home();
				ho.setVisible(true);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				close();
				AdminSubmit1 Admin1 = new AdminSubmit1();
				Admin1.setVisible(true);
				
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				close();
				StuffLogin stuff = new StuffLogin();
				stuff.setVisible(true);
				
			}
		});
	}

}
