package sabrosoproject;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Home extends JFrame{
	
	private JButton btnNewButton_1,btnNewButton,btnNewButton_2,btnNewButton_3,btnNewButton_4;
	private Container Panel;
	private Font font,f,ff;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		this.setBounds(100, 100, 731, 453);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		font = new Font("Bookman Old Style",Font.BOLD,19);
		f = new Font("Bookman Old Style",Font.PLAIN,15);
		ff = new Font("Bookman Old Style",Font.PLAIN,12);
		Color textColor = Color.WHITE;
		
		JLabel lblNewLabel = new JLabel("Welcome to Subroso");
		lblNewLabel.setForeground(textColor);
		lblNewLabel.setBounds(267, 47, 206, 20);
		lblNewLabel.setFont(font);
		Panel.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(ff);
		btnNewButton_1.setBounds(635, 75, 70, 23);
		Panel.add(btnNewButton_1);
		
		btnNewButton = new JButton("Signup");
		btnNewButton.setFont(ff);
		btnNewButton.setBounds(530, 75, 76, 23);
		Panel.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Our history");
		btnNewButton_2.setBounds(35, 358, 103, 14);
		Panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to our restaurant. We believe that, we have the best kitchen in this area. We");
		lblNewLabel_1.setForeground(textColor);
		lblNewLabel_1.setFont(f);
		lblNewLabel_1.setBounds(25, 121, 655, 14);
		Panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("are always ready to serve fresh and healthy food to our honourable customers.");
		lblNewLabel_2.setForeground(textColor);
		lblNewLabel_2.setFont(f);
		lblNewLabel_2.setBounds(25, 146, 655, 14);
		Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Everyday we create healthy children\u2019s menus, and fast-food. We are always ready to ");
		lblNewLabel_3.setForeground(textColor);
		lblNewLabel_3.setFont(f);
		lblNewLabel_3.setBounds(25, 171, 655, 14);
		Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("About us");
		lblNewLabel_4.setForeground(textColor);
		lblNewLabel_4.setFont(f);
		lblNewLabel_4.setBounds(48, 322, 68, 14);
		Panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("please you by the taste of our food. We really want the best review from our customers");
		lblNewLabel_5.setForeground(textColor);
		lblNewLabel_5.setFont(f);
		lblNewLabel_5.setBounds(25, 196, 655, 14);
		Panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("and we want to keep them coming back. That\u2019s why we always try to give our customer");
		lblNewLabel_6.setForeground(textColor);
		lblNewLabel_6.setFont(f);
		lblNewLabel_6.setBounds(25, 221, 655, 14);
		Panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("the best service. We want our restaurants promotion. But we want the honest review ");
		lblNewLabel_7.setForeground(textColor);
		lblNewLabel_7.setFont(f);
		lblNewLabel_7.setBounds(25, 246, 655, 14);
		Panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("from our customer. Our restaurant is open 24/7. ");
		lblNewLabel_8.setForeground(textColor);
		lblNewLabel_8.setFont(f);
		lblNewLabel_8.setBounds(25, 271, 655, 14);
		Panel.add(lblNewLabel_8);
		
		btnNewButton_3 = new JButton("System and Root");
		btnNewButton_3.setBounds(148, 358, 134, 14);
		Panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Meet Our People: Staff & Management");
		btnNewButton_4.setBounds(292, 358, 263, 14);
		Panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\Home.jpg"));
		lblNewLabel_9.setBounds(0, 0, 715, 403);
		getContentPane().add(lblNewLabel_9);
	}
	private void first() {
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Signup sing = new Signup();
				sing.setVisible(true);
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				close();
				Login logi = new Login();
				logi.setVisible(true);
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				About ab = new About();
				ab.setVisible(true);
				
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				SystemAndRoot sys = new SystemAndRoot();
				sys.setVisible(true);
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				AllStuffs all = new AllStuffs();
				all.setVisible(true);
			}
		});
		
	}
}
