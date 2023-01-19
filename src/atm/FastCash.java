/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AAWEJ CHAUDHARI
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }
    int MyAccNum;
    public FastCash(int AccNum) {
      initComponents();
        MyAccNum=AccNum;
        GetBalance();
    }
   Connection Con=null;
PreparedStatement pst=null;
ResultSet Rs=null;
Statement st=null;
int OldBalance;

    private void GetBalance()
    {
         String Query="select * from account where AccNum='"+MyAccNum+"' ";
     try
     {
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Y1012Jqkhkp");
         st=(Statement) Con.createStatement();
         Rs=st.executeQuery(Query);
         if(Rs.next())
         {
             OldBalance=Rs.getInt(8);
           
             BalTb.setText("Rs"+OldBalance);
             
         }
         else
         {
//             JOptionPane.showMessageDialog(this, "Wrong Account or PIN number");
         }
         
     }
     catch(Exception e)
     {
          JOptionPane.showMessageDialog(this,e);
     }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deposit_btn = new javax.swing.JButton();
        deposit_btn1 = new javax.swing.JButton();
        deposit_btn2 = new javax.swing.JButton();
        deposit_btn3 = new javax.swing.JButton();
        deposit_btn4 = new javax.swing.JButton();
        deposit_btn5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        deposit_btn6 = new javax.swing.JButton();
        deposit_btn7 = new javax.swing.JButton();
        deposit_btn8 = new javax.swing.JButton();
        deposit_btn9 = new javax.swing.JButton();
        deposit_btn10 = new javax.swing.JButton();
        deposit_btn11 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BalTb = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select your transaction please");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MYCODESPACE BANK");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("x");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Account Number:");

        deposit_btn.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn.setText("WITHDRAW");
        deposit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btnActionPerformed(evt);
            }
        });

        deposit_btn1.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn1.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn1.setText("DEPOSIT");
        deposit_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn1ActionPerformed(evt);
            }
        });

        deposit_btn2.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn2.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn2.setText("FASTCASH");
        deposit_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn2ActionPerformed(evt);
            }
        });

        deposit_btn3.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn3.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn3.setText("MINI STATEMENT");
        deposit_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn3ActionPerformed(evt);
            }
        });

        deposit_btn4.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn4.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn4.setText("BALANCE");
        deposit_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn4ActionPerformed(evt);
            }
        });

        deposit_btn5.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn5.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn5.setText("CHANGE");
        deposit_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("LOGOUT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deposit_btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deposit_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(deposit_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deposit_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(deposit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(deposit_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jPanel4.setBackground(new java.awt.Color(0, 204, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select your transaction please");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MYCODESPACE BANK");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("x");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("FAST CASH");

        deposit_btn6.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn6.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn6.setText("Rs 500");
        deposit_btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_btn6MouseClicked(evt);
            }
        });
        deposit_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn6ActionPerformed(evt);
            }
        });

        deposit_btn7.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn7.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn7.setText("Rs 100");
        deposit_btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_btn7MouseClicked(evt);
            }
        });
        deposit_btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn7ActionPerformed(evt);
            }
        });

        deposit_btn8.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn8.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn8.setText("Rs 1000");
        deposit_btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_btn8MouseClicked(evt);
            }
        });
        deposit_btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn8ActionPerformed(evt);
            }
        });

        deposit_btn9.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn9.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn9.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn9.setText("Rs 2000");
        deposit_btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_btn9MouseClicked(evt);
            }
        });
        deposit_btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn9ActionPerformed(evt);
            }
        });

        deposit_btn10.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn10.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn10.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn10.setText("Rs 10000");
        deposit_btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_btn10MouseClicked(evt);
            }
        });
        deposit_btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn10ActionPerformed(evt);
            }
        });

        deposit_btn11.setBackground(new java.awt.Color(255, 255, 255));
        deposit_btn11.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        deposit_btn11.setForeground(new java.awt.Color(0, 153, 51));
        deposit_btn11.setText("Rs 5000");
        deposit_btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_btn11MouseClicked(evt);
            }
        });
        deposit_btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btn11ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("LOGOUT");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        BalTb.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        BalTb.setForeground(new java.awt.Color(0, 153, 0));
        BalTb.setText("Balance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deposit_btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(deposit_btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(deposit_btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BalTb)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deposit_btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(deposit_btn6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deposit_btn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                        .addGap(154, 154, 154))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addGap(198, 198, 198))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deposit_btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deposit_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deposit_btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deposit_btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BalTb))))
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit_btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit_btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(366, 366, 366)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deposit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btnActionPerformed

    private void deposit_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn1ActionPerformed

    private void deposit_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn2ActionPerformed

    private void deposit_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn3ActionPerformed

    private void deposit_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn4ActionPerformed

    private void deposit_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn5ActionPerformed

    private void deposit_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn6ActionPerformed

    private void deposit_btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn7ActionPerformed

    private void deposit_btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn8ActionPerformed

    private void deposit_btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn9ActionPerformed

    private void deposit_btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn10ActionPerformed

    private void deposit_btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn11ActionPerformed

    private void deposit_btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_btn7MouseClicked
      if(OldBalance<100)
        {
            JOptionPane.showMessageDialog(this,"No Enough Balance");
        }
        else
       {
           try{
                String Query="Update account set Balance=? where AccNum=?";
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Y1012Jqkhkp");
            PreparedStatement ps=Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-100);
            ps.setInt(2,MyAccNum);
            BalTb.setText(""+OldBalance);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updates");
                 new MainMenue(MyAccNum).setVisible(true);
       this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this,e);
           }
          
            
           
       }
    }//GEN-LAST:event_deposit_btn7MouseClicked

    private void deposit_btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_btn6MouseClicked
        if(OldBalance<500)
        {
            JOptionPane.showMessageDialog(this,"No Enough Balance");
        }
        else
       {
           try{
                String Query="Update account set Balance=? where AccNum=?";
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Y1012Jqkhkp");
            PreparedStatement ps=Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-500);
            ps.setInt(2,MyAccNum);
             BalTb.setText(""+OldBalance);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updates");
                 new MainMenue(MyAccNum).setVisible(true);
       this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this,e);
           }
          
            
           
       }
    }//GEN-LAST:event_deposit_btn6MouseClicked

    private void deposit_btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_btn8MouseClicked
        if(OldBalance<1000)
        {
            JOptionPane.showMessageDialog(this,"No Enough Balance");
        }
        else
       {
           try{
                String Query="Update account set Balance=? where AccNum=?";
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Y1012Jqkhkp");
            PreparedStatement ps=Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-1000);
            ps.setInt(2,MyAccNum);
             BalTb.setText(""+OldBalance);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updates");
                 new MainMenue(MyAccNum).setVisible(true);
       this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this,e);
           }
          
            
           
       }
    }//GEN-LAST:event_deposit_btn8MouseClicked

    private void deposit_btn11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_btn11MouseClicked
 if(OldBalance<5000)
        {
            JOptionPane.showMessageDialog(this,"No Enough Balance");
        }
        else
       {
           try{
                String Query="Update account set Balance=? where AccNum=?";
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Y1012Jqkhkp");
            PreparedStatement ps=Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-5000);
            ps.setInt(2,MyAccNum);
             BalTb.setText(""+OldBalance);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updates");
                 new MainMenue(MyAccNum).setVisible(true);
       this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this,e);
           }
          
            
           
       }        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_btn11MouseClicked

    private void deposit_btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_btn9MouseClicked
        if(OldBalance<2000)
        {
            JOptionPane.showMessageDialog(this,"No Enough Balance");
        }
        else
       {
           try{
                String Query="Update account set Balance=? where AccNum=?";
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Y1012Jqkhkp");
            PreparedStatement ps=Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-2000);
            ps.setInt(2,MyAccNum);
             BalTb.setText(""+OldBalance);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updates");
                 new MainMenue(MyAccNum).setVisible(true);
       this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this,e);
           }
          
            
           
       }
    }//GEN-LAST:event_deposit_btn9MouseClicked

    private void deposit_btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_btn10MouseClicked
        if(OldBalance<10000)
        {
            JOptionPane.showMessageDialog(this,"No Enough Balance");
        }
        else
       {
           try{
                String Query="Update account set Balance=? where AccNum=?";
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Y1012Jqkhkp");
            PreparedStatement ps=Con.prepareStatement(Query);
           ps.setInt(1, OldBalance-10000);
            ps.setInt(2,MyAccNum);
             BalTb.setText(""+OldBalance);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updates");
                 new MainMenue(MyAccNum).setVisible(true);
       this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this,e);
           }
          
            
           
       }
    }//GEN-LAST:event_deposit_btn10MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new MainMenue(MyAccNum).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      System.exit(1);
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalTb;
    private javax.swing.JButton deposit_btn;
    private javax.swing.JButton deposit_btn1;
    private javax.swing.JButton deposit_btn10;
    private javax.swing.JButton deposit_btn11;
    private javax.swing.JButton deposit_btn2;
    private javax.swing.JButton deposit_btn3;
    private javax.swing.JButton deposit_btn4;
    private javax.swing.JButton deposit_btn5;
    private javax.swing.JButton deposit_btn6;
    private javax.swing.JButton deposit_btn7;
    private javax.swing.JButton deposit_btn8;
    private javax.swing.JButton deposit_btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
