package sabrosoproject;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Signup extends JFrame{

	private JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3;
	private Container Panel;
	private Font f,ff;
	private JLabel lblNewLabel_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Signup() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		this.setBounds(100, 100, 731, 412);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		f = new Font("Bookman Old Style",Font.BOLD,15);
		ff = new Font("Bookman Old Style",Font.PLAIN,12);
		
		JLabel lblNewLabel = new JLabel("Signup as Manager");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(f);
		lblNewLabel.setBounds(149, 107, 155, 23);
		Panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Signup as Stuff");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(f);
		lblNewLabel_1.setBounds(421, 109, 141, 19);
		Panel.add(lblNewLabel_1);
		
		btnNewButton_2 = new JButton("Signup");
		btnNewButton_2.setFont(ff);
		btnNewButton_2.setBounds(173, 168, 78, 23);
		Panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Signup");
		btnNewButton_3.setFont(ff);
		btnNewButton_3.setBounds(435, 168, 78, 23);
		Panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("OR");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(f);
		lblNewLabel_2.setBounds(331, 168, 30, 23);
		Panel.add(lblNewLabel_2);
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(10, 11, 41, 23);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(ff);
		btnNewButton_1.setBounds(627, 11, 78, 23);
		getContentPane().add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\JoinUs1.jpg"));
		lblNewLabel_3.setBounds(0, 0, 715, 373);
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
				AdminSubmit Admin = new AdminSubmit();
				Admin.setVisible(true);
				
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				close();
				StuffSignup stuff = new StuffSignup();
				stuff.setVisible(true);
				
			}
		});
	}

}
