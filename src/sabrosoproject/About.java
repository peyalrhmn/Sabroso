package sabrosoproject; 

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class About extends JFrame{

	private JButton btnNewButton;
	private Container Panel;
	private Font font,f;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}


	private void initialize() {
		this.setBounds(100, 100, 733, 416);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		Panel.setLayout(null);
		
		font = new Font("Bookman Old Style",Font.BOLD,19);
		f = new Font("Bookman Old Style",Font.PLAIN,15);
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(0, 0, 42, 23);
		Panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Origins");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(30, 36, 677, 23);
		lblNewLabel.setFont(font);
		Panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("In 2019, Rahi and Hasib wanted do something beside their study. They were planning ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(f);
		lblNewLabel_1.setBounds(30, 70, 677, 14);
		Panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("about some kind of business. But they weren\u2019t sure what kind of business they will start. ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(f);
		lblNewLabel_2.setBounds(30, 95, 677, 14);
		Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("At the very middle of 2019, they visited a restaurant in San Bernardino, California that ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(f);
		lblNewLabel_3.setBounds(30, 120, 677, 14);
		Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("had purchased several Multimixers. There they found a small but successful restaurant ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(f);
		lblNewLabel_4.setBounds(30, 145, 677, 14);
		Panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("run by brothers John and Mike, and was stunned by the effectiveness of their operation. ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(f);
		lblNewLabel_5.setBounds(30, 170, 677, 14);
		Panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mikes brothers produced a limited menu, concentrating on just a few items \u2013 burgers, ");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(f);
		lblNewLabel_6.setBounds(30, 195, 677, 14);
		Panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("fries and beverages \u2013 which allowed them to focus on quality and quick service.");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(f);
		lblNewLabel_7.setBounds(30, 220, 677, 14);
		Panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("That was the first time when Rahi and Hasibur decided to start a restaurant. They ");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(f);
		lblNewLabel_9.setBounds(30, 270, 677, 14);
		Panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("wanted to make a best restaurant in Bashundhara residential area, Dhaka. ");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(f);
		lblNewLabel_10.setBounds(30, 295, 677, 14);
		Panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\Home.jpg"));
		lblNewLabel_8.setBounds(0, 0, 717, 377);
		getContentPane().add(lblNewLabel_8);
	}
	private void first() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				close();
				Home ho = new Home();
				ho.setVisible(true);
				
			}
		});
	}
}
