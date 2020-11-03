package sabrosoproject;

import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Order extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order window = new Order();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Order() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
	}


	private void initialize() {
		
		this.setTitle("Sabroso");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(820,515);
		this.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JCheckBox checkBox = new JCheckBox("Burger @ 100");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox.setBackground(Color.CYAN);
		checkBox.setBounds(43, 66, 161, 25);
		frame.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Pizza @ 100");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_1.setBackground(Color.CYAN);
		checkBox_1.setBounds(43, 108, 161, 25);
		frame.getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Biryani @ 150");
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_2.setBackground(Color.CYAN);
		checkBox_2.setBounds(43, 157, 161, 25);
		frame.getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Fried Chicken @ 100");
		checkBox_3.setForeground(Color.RED);
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_3.setBackground(Color.CYAN);
		checkBox_3.setBounds(43, 205, 161, 25);
		frame.getContentPane().add(checkBox_3);
		
		JLabel label = new JLabel("Menu");
		label.setForeground(Color.CYAN);
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(390, 13, 67, 31);
		frame.getContentPane().add(label);
		
		JCheckBox checkBox_4 = new JCheckBox("Fried Rice @ 100");
		checkBox_4.setForeground(Color.RED);
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_4.setBackground(Color.CYAN);
		checkBox_4.setBounds(264, 66, 147, 25);
		frame.getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Kabab @ 100");
		checkBox_5.setForeground(Color.RED);
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_5.setBackground(Color.CYAN);
		checkBox_5.setBounds(264, 108, 147, 25);
		frame.getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Shingara @ 10");
		checkBox_6.setForeground(Color.RED);
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_6.setBackground(Color.CYAN);
		checkBox_6.setBounds(264, 157, 147, 25);
		frame.getContentPane().add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Samosa @ 10");
		checkBox_7.setForeground(Color.RED);
		checkBox_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_7.setBackground(Color.CYAN);
		checkBox_7.setBounds(264, 205, 147, 25);
		frame.getContentPane().add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("Coke @ 20");
		checkBox_8.setForeground(Color.RED);
		checkBox_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_8.setBackground(Color.CYAN);
		checkBox_8.setBounds(43, 253, 161, 25);
		frame.getContentPane().add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Chowmein @ 100");
		checkBox_9.setForeground(Color.RED);
		checkBox_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_9.setBackground(Color.CYAN);
		checkBox_9.setBounds(264, 253, 147, 25);
		frame.getContentPane().add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("Water @ 10");
		checkBox_10.setForeground(Color.RED);
		checkBox_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_10.setBackground(Color.CYAN);
		checkBox_10.setBounds(43, 306, 161, 25);
		frame.getContentPane().add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("Pastry @ 150");
		checkBox_11.setForeground(Color.RED);
		checkBox_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_11.setBackground(Color.CYAN);
		checkBox_11.setBounds(264, 306, 147, 25);
		frame.getContentPane().add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("Tea @ 10");
		checkBox_12.setForeground(Color.RED);
		checkBox_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_12.setBackground(Color.CYAN);
		checkBox_12.setBounds(43, 360, 158, 25);
		frame.getContentPane().add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("Sandwich @ 70");
		checkBox_13.setForeground(Color.RED);
		checkBox_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_13.setBackground(Color.CYAN);
		checkBox_13.setBounds(264, 360, 147, 25);
		frame.getContentPane().add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("Coffee @20");
		checkBox_14.setForeground(Color.RED);
		checkBox_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_14.setBackground(Color.CYAN);
		checkBox_14.setBounds(43, 415, 161, 25);
		frame.getContentPane().add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("Ice Cream @ 120");
		checkBox_15.setForeground(Color.RED);
		checkBox_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_15.setBackground(Color.CYAN);
		checkBox_15.setBounds(264, 415, 147, 25);
		frame.getContentPane().add(checkBox_15);
		
		JButton button = new JButton("Proceed");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int bur = 0, piz = 0, bir = 0, fc = 0, cok = 0, wat = 0, tea = 0, cof = 0, fr = 0, kab = 0, shi = 0, sam = 0,  cho = 0, pas = 0, san = 0, ic = 0;
				int a,b,c,d,z,f,g,h,i,j,k,l,m,n,o,p;
				
				
				if (checkBox.isSelected()) {
					
					a = Integer.parseInt(textField.getText());
					bur = a*100;
					textField_16.setText(a + " Burger ");
					
				}
				
				if (checkBox_1.isSelected()) {
					
					b = Integer.parseInt(textField_1.getText());
					piz = b*100;
					textField_16.setText(textField_16.getText() + b + " Pizza ");
				}
				
				if (checkBox_2.isSelected()) {
					
					c = Integer.parseInt(textField_2.getText());
					bir = c*150;
					textField_16.setText(textField_16.getText() + c + " Biryani ");
				}
				
				if (checkBox_3.isSelected()) {
					
					d = Integer.parseInt(textField_3.getText());
					fc = d*100;
					textField_16.setText(textField_16.getText() + d + " Fried Chicken ");
				}
				
				if (checkBox_8.isSelected()) {
					
					z = Integer.parseInt(textField_4.getText());
					cok = z*20;
					textField_16.setText(textField_16.getText() + z + " Coke ");
				}
				
				if (checkBox_10.isSelected()) {
					
					f = Integer.parseInt(textField_5.getText());
					wat = f*10;
					textField_16.setText(textField_16.getText() + f + " Water ");
				}
				
				if (checkBox_12.isSelected()) {
					
					g = Integer.parseInt(textField_6.getText());
					tea = g*10;
					textField_16.setText(textField_16.getText() + g + " Tea\n");
				}
				
				if (checkBox_14.isSelected()) {
					
					h = Integer.parseInt(textField_7.getText());
					cof = h*20;
					textField_16.setText(textField_16.getText() + h + " Coffee ");
				}
				
				if (checkBox_4.isSelected()) {
					
					i = Integer.parseInt(textField_8.getText());
					fr = i*100;
					textField_16.setText(textField_16.getText() + i + " Fried Rice ");
				}
				
				if (checkBox_5.isSelected()) {
					
					j = Integer.parseInt(textField_9.getText());
					kab = j*100;
					textField_16.setText(textField_16.getText() + j + " Kabab ");
				}
				
				if (checkBox_6.isSelected()) {
					
					k = Integer.parseInt(textField_10.getText());
					shi = k*10;
					textField_16.setText(textField_16.getText() + k + " Shingara ");
				}
				
				if (checkBox_7.isSelected()) {
					
					l = Integer.parseInt(textField_11.getText());
					sam = l*10;
					textField_16.setText(textField_16.getText() + l + " Samosa ");
				}
				
				if (checkBox_9.isSelected()) {
					
					m = Integer.parseInt(textField_12.getText());
					cho = m*100;
					textField_16.setText(textField_16.getText() + m + " Chowmein ");
				}
				
				if (checkBox_11.isSelected()) {
					
					n = Integer.parseInt(textField_13.getText());
					pas = n*150;
					textField_16.setText(textField_16.getText() + n + " Pastry ");
				}
				
				if (checkBox_13.isSelected()) {
					
					o = Integer.parseInt(textField_14.getText());
					san = o*70;
					textField_16.setText(textField_16.getText() + o + " Sandwich ");
				}
				
				if (checkBox_15.isSelected()) {
					
					p = Integer.parseInt(textField_15.getText());
					ic = p*120;
					textField_16.setText(textField_16.getText() + p + " Ice Cream ");
				}
				
				new TenderSys(bur, piz, bir, fc, cok, wat, tea, cof, fr, kab, shi, sam, cho, pas, san, ic).setVisible(true);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.ORANGE);
		button.setBounds(551, 334, 161, 51);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnNewButton.setBounds(693, 430, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(209, 68, 29, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(209, 110, 29, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(209, 159, 29, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setColumns(10);
		textField_3.setBounds(209, 207, 29, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setColumns(10);
		textField_4.setBounds(209, 255, 29, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setColumns(10);
		textField_5.setBounds(209, 306, 29, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setColumns(10);
		textField_6.setBounds(209, 360, 29, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setColumns(10);
		textField_7.setBounds(209, 415, 29, 22);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setColumns(10);
		textField_8.setBounds(419, 68, 29, 22);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setColumns(10);
		textField_9.setBounds(419, 110, 29, 22);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBackground(Color.LIGHT_GRAY);
		textField_10.setColumns(10);
		textField_10.setBounds(419, 159, 29, 22);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBackground(Color.LIGHT_GRAY);
		textField_11.setColumns(10);
		textField_11.setBounds(419, 207, 29, 22);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBackground(Color.LIGHT_GRAY);
		textField_12.setColumns(10);
		textField_12.setBounds(419, 255, 29, 22);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBackground(Color.LIGHT_GRAY);
		textField_13.setColumns(10);
		textField_13.setBounds(419, 308, 29, 22);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBackground(Color.LIGHT_GRAY);
		textField_14.setColumns(10);
		textField_14.setBounds(419, 362, 29, 22);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBackground(Color.LIGHT_GRAY);
		textField_15.setColumns(10);
		textField_15.setBounds(419, 415, 29, 22);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_16.setEditable(false);
		textField_16.setForeground(Color.YELLOW);
		textField_16.setBackground(Color.BLACK);
		textField_16.setBounds(551, 68, 239, 263);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\cover.jpg"));
		lblNewLabel.setBounds(0, 0, 802, 468);
		frame.getContentPane().add(lblNewLabel);


	}
}
