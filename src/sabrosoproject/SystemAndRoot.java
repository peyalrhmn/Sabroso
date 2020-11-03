package sabrosoproject;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SystemAndRoot extends JFrame{

	private JButton btnNewButton; 
	private Container Panel;
	private Font font,f;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemAndRoot window = new SystemAndRoot();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SystemAndRoot() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
	}
	private void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	private void initialize() {
		this.setBounds(100, 100, 742, 418);
		this.setTitle("Subroso");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel = this.getContentPane();
		getContentPane().setLayout(null);
		
		font = new Font("Bookman Old Style",Font.BOLD,19);
		f = new Font("Bookman Old Style",Font.PLAIN,15);
		Color textColor = Color.BLACK;
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(10, 11, 41, 23);
		Panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("System first");
		lblNewLabel.setForeground(textColor);
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(31, 45, 685, 26);
		Panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First and foremost, Kroc advocated adherence to the system approach. So while many ");
		lblNewLabel_1.setForeground(textColor);
		lblNewLabel_1.setFont(f);
		lblNewLabel_1.setBounds(31, 82, 685, 14);
		Panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("of Subroso\u2019s most famous menu items \u2013 like the Filet-O-Fish, Big Mac, and Egg ");
		lblNewLabel_2.setForeground(textColor);
		lblNewLabel_2.setFont(f);
		lblNewLabel_2.setBounds(31, 107, 685, 14);
		Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("McMuffin \u2013 were created by franchisees, the Subroso\u2019s operating system required ");
		lblNewLabel_3.setForeground(textColor);
		lblNewLabel_3.setFont(f);
		lblNewLabel_3.setBounds(31, 132, 685, 14);
		Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("franchisees to follow the core Subroso\u2019s principles of quality, service, cleanliness and ");
		lblNewLabel_4.setForeground(textColor);
		lblNewLabel_4.setFont(f);
		lblNewLabel_4.setBounds(31, 157, 685, 14);
		Panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("value.");
		lblNewLabel_5.setForeground(textColor);
		lblNewLabel_5.setFont(f);
		lblNewLabel_5.setBounds(31, 182, 685, 14);
		Panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Roots of quality");
		lblNewLabel_6.setForeground(textColor);
		lblNewLabel_6.setFont(font);
		lblNewLabel_6.setBounds(31, 217, 685, 23);
		Panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Subroso\u2019s passion for quality meant that ingredients were tested, tasted and perfected ");
		lblNewLabel_7.setForeground(textColor);
		lblNewLabel_7.setFont(f);
		lblNewLabel_7.setBounds(31, 260, 685, 14);
		Panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("to fit the operating system. Kroc shared his vision of Subroso\u2019s future, selling his early ");
		lblNewLabel_8.setForeground(textColor);
		lblNewLabel_8.setFont(f);
		lblNewLabel_8.setBounds(31, 285, 685, 14);
		Panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("suppliers on future volumes. They believed in him and the restaurant boomed.");
		lblNewLabel_9.setForeground(textColor);
		lblNewLabel_9.setFont(f);
		lblNewLabel_9.setBounds(31, 310, 685, 14);
		Panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\FoodsAndGirl6.jpg"));
		lblNewLabel_10.setBounds(0, 0, 726, 379);
		getContentPane().add(lblNewLabel_10);
		
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
