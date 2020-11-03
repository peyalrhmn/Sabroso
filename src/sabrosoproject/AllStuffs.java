package sabrosoproject;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AllStuffs extends JFrame{

	private JButton btnNewButton;
	private Container Panel;
	private JTextArea tarea;
	private Font font;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllStuffs window = new AllStuffs();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AllStuffs() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\LOGO.jpg"));
		initialize();
		first();
		second();
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
		Panel.setLayout(null);
		
		font = new Font("Bookman Old Style",Font.BOLD,19);
		
		tarea = new JTextArea();
		tarea.setBackground(SystemColor.control);
		tarea.setForeground(Color.BLACK);
		tarea.setEditable(false);
		tarea.setBounds(10, 41, 716, 338);
		Panel.add(tarea);
		
		btnNewButton = new JButton("<");
		btnNewButton.setBounds(0, 11, 45, 23);
		Panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Our Staffs");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(287, 11, 262, 19);
		Panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Programs\\Eclipse Java\\Sabroso Project\\image\\Outside.jpg"));
		lblNewLabel_1.setBounds(-1, 0, 727, 379);
		getContentPane().add(lblNewLabel_1);
	}
	private void first() {
		File file = new File("Information Stuff.txt");
		try {
			 BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		     tarea.read(input, "READING FILE :-)");
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "File not found!");
		}
	}
	private void second() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Home ho = new Home();
				ho.setVisible(true);
			}
		});
	}
}
