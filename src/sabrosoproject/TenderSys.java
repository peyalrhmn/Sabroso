package sabrosoproject;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;

public class TenderSys extends javax.swing.JFrame {

    int total, bur1, piz1, bir1, fc1, cok1, wat1, tea1, cof1, fr1, kab1, shi1, sam1, cho1, pas1, san1, ic1;
    
    public TenderSys() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sabroso");
    }
    
    public TenderSys(int bur, int piz, int bir, int fc, int cok, int wat, int tea, int cof, int fr, int kab, int shi, int sam,  int cho, int pas, int san, int ic) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sabroso");
        
    	bur1 = bur;
    	piz1 = piz;
    	bir1 = bir;
    	fc1 = fc;
    	cok1 = cok;
    	wat1 = wat;
    	tea1 = tea;
    	cof1 = cof;
    	fr1 = fr;
    	kab1 = kab;
    	shi1 = shi;
    	sam1 = sam;
    	cho1 = cho;
    	pas1 = pas;
    	san1 = san;
    	ic1 = ic;
    	
    	total = (bur1+piz1+bir1+fc1+cok1+wat1+tea1+cof1+fr1+kab1+shi1+sam1+cho1+pas1+san1+ic1);
        
        tfTotal.setText(""+total);
        
    }
                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        tfTotal = new javax.swing.JTextField();
        tfTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfCash = new javax.swing.JTextField();
        tfCash.setFont(new Font("Tahoma", Font.PLAIN, 15));
        tfChange = new javax.swing.JTextField();
        tfChange.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(Color.BLACK);
        jButton1.setBackground(Color.GREEN);
        jButton2 = new javax.swing.JButton();
        jButton2.setBackground(Color.RED);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Total");

        jLabel2.setText("Cash");

        jLabel3.setText("Change");

        tfTotal.setEditable(false);
        tfTotal.setBackground(new java.awt.Color(153, 255, 255));
        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        tfCash.setBackground(new java.awt.Color(153, 255, 255));
        tfCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCashKeyPressed(evt);
            }
        });

        tfChange.setEditable(false);
        tfChange.setBackground(new java.awt.Color(153, 255, 255));
        tfChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfChangeActionPerformed(evt);
            }
        });

        jButton1.setText("Order");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(jLabel2)
        				.addComponent(jLabel1))
        			.addGap(18, 18, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
        				.addComponent(tfTotal, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        				.addComponent(tfCash)
        				.addComponent(tfChange))
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(23)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(tfTotal, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(tfCash, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(tfChange, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(35)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        			.addGap(146))
        );
        getContentPane().setLayout(layout);

        pack();
    }                        

    private void tfChangeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

    private void tfCashKeyPressed(java.awt.event.KeyEvent evt) {                                  
        
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            int cash = Integer.parseInt(tfCash.getText());
            
            if(total <= cash) {
                
                int finalTotal = cash - total;
                tfChange.setText(""+finalTotal);
                jButton1.setEnabled(true);
            }
            
            else {
                
                JOptionPane.showMessageDialog(null, "Insufficient Ammount!");
                
            }
            
        }
        
    }                                 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
        JOptionPane.showMessageDialog(null, "Order Successful!");
        this.dispose();
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
        this.dispose();
        
    }                                        

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TenderSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenderSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenderSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenderSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenderSys().setVisible(true);
            }
        });
    }

                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfCash;
    private javax.swing.JTextField tfChange;
    private javax.swing.JTextField tfTotal;
                  
}
