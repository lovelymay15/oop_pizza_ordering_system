
package Pizza;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;


public class PizzaJFrame extends javax.swing.JFrame {

    public PizzaJFrame() {
        initComponents();
    }

    DefaultTableModel model;
    String item;
    int price;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        S = new javax.swing.JCheckBox();
        M = new javax.swing.JCheckBox();
        V = new javax.swing.JCheckBox();
        H = new javax.swing.JCheckBox();
        B = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Sper = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Mper = new javax.swing.JRadioButton();
        Vper = new javax.swing.JRadioButton();
        Hper = new javax.swing.JRadioButton();
        Bper = new javax.swing.JRadioButton();
        Sreg = new javax.swing.JRadioButton();
        Mreg = new javax.swing.JRadioButton();
        Vreg = new javax.swing.JRadioButton();
        Hreg = new javax.swing.JRadioButton();
        Breg = new javax.swing.JRadioButton();
        Sfam = new javax.swing.JRadioButton();
        Mfam = new javax.swing.JRadioButton();
        Vfam = new javax.swing.JRadioButton();
        Hfam = new javax.swing.JRadioButton();
        Bfam = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        spag = new javax.swing.JCheckBox();
        bihon = new javax.swing.JCheckBox();
        palabok = new javax.swing.JCheckBox();
        sotanghon = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        glass = new javax.swing.JRadioButton();
        pitcher = new javax.swing.JRadioButton();
        drum = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txttax = new javax.swing.JTextField();
        txtamdue = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cheese = new javax.swing.JCheckBox();
        beef = new javax.swing.JCheckBox();
        bacon = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtqty = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setFocusable(false);

        S.setBackground(new java.awt.Color(153, 153, 153));
        S.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        S.setForeground(new java.awt.Color(255, 255, 255));
        S.setText("Supreme");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        M.setBackground(new java.awt.Color(153, 153, 153));
        M.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        M.setForeground(new java.awt.Color(255, 255, 255));
        M.setText("Meat Lovers");

        V.setBackground(new java.awt.Color(153, 153, 153));
        V.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        V.setForeground(new java.awt.Color(255, 255, 255));
        V.setText("Veggie Lovers");

        H.setBackground(new java.awt.Color(153, 153, 153));
        H.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        H.setForeground(new java.awt.Color(255, 255, 255));
        H.setText("Hawaiian");

        B.setBackground(new java.awt.Color(153, 153, 153));
        B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("Bacon Lovers");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AVAILABLE PIZZA");

        Sper.setBackground(new java.awt.Color(153, 153, 153));
        Sper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SperActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Personal");

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Regular");

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Family");

        Mper.setBackground(new java.awt.Color(153, 153, 153));
        Mper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MperActionPerformed(evt);
            }
        });

        Vper.setBackground(new java.awt.Color(153, 153, 153));
        Vper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VperActionPerformed(evt);
            }
        });

        Hper.setBackground(new java.awt.Color(153, 153, 153));
        Hper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HperActionPerformed(evt);
            }
        });

        Bper.setBackground(new java.awt.Color(153, 153, 153));
        Bper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BperActionPerformed(evt);
            }
        });

        Sreg.setBackground(new java.awt.Color(153, 153, 153));
        Sreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SregActionPerformed(evt);
            }
        });

        Mreg.setBackground(new java.awt.Color(153, 153, 153));
        Mreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MregActionPerformed(evt);
            }
        });

        Vreg.setBackground(new java.awt.Color(153, 153, 153));
        Vreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VregActionPerformed(evt);
            }
        });

        Hreg.setBackground(new java.awt.Color(153, 153, 153));
        Hreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HregActionPerformed(evt);
            }
        });

        Breg.setBackground(new java.awt.Color(153, 153, 153));
        Breg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregActionPerformed(evt);
            }
        });

        Sfam.setBackground(new java.awt.Color(153, 153, 153));
        Sfam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SfamActionPerformed(evt);
            }
        });

        Mfam.setBackground(new java.awt.Color(153, 153, 153));
        Mfam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MfamActionPerformed(evt);
            }
        });

        Vfam.setBackground(new java.awt.Color(153, 153, 153));
        Vfam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VfamActionPerformed(evt);
            }
        });

        Hfam.setBackground(new java.awt.Color(153, 153, 153));
        Hfam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HfamActionPerformed(evt);
            }
        });

        Bfam.setBackground(new java.awt.Color(153, 153, 153));
        Bfam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H)
                            .addComponent(S)
                            .addComponent(M)
                            .addComponent(V)
                            .addComponent(B))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Vper)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sper)
                                    .addComponent(Mper)
                                    .addComponent(Hper)
                                    .addComponent(Bper))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Sreg)
                                    .addComponent(Mreg)
                                    .addComponent(Hreg)
                                    .addComponent(Breg)
                                    .addComponent(Vreg))))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mfam)
                            .addComponent(Sfam)
                            .addComponent(Vfam)
                            .addComponent(Hfam)
                            .addComponent(Bfam))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sreg)
                            .addComponent(Sper)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S)
                            .addComponent(Sfam))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mreg)
                            .addComponent(Mper)
                            .addComponent(M)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mfam)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vfam)
                    .addComponent(Vreg)
                    .addComponent(Vper)
                    .addComponent(V))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H)
                    .addComponent(Hper)
                    .addComponent(Hfam)
                    .addComponent(Hreg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bfam)
                    .addComponent(Breg)
                    .addComponent(Bper)
                    .addComponent(B))
                .addGap(0, 0, 0))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 260, 440, 210);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OTHERS");

        spag.setBackground(new java.awt.Color(153, 153, 153));
        spag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spag.setText("Spaghetti w/ Meatballs");
        spag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spagActionPerformed(evt);
            }
        });

        bihon.setBackground(new java.awt.Color(153, 153, 153));
        bihon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bihon.setText("Special Pansit Bihon");
        bihon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bihonActionPerformed(evt);
            }
        });

        palabok.setBackground(new java.awt.Color(153, 153, 153));
        palabok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        palabok.setText("Pansit Palabok");
        palabok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabokActionPerformed(evt);
            }
        });

        sotanghon.setBackground(new java.awt.Color(153, 153, 153));
        sotanghon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sotanghon.setText("Sotanghon");
        sotanghon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotanghonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spag)
                            .addComponent(bihon))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sotanghon)
                            .addComponent(palabok))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spag)
                    .addComponent(palabok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bihon)
                    .addComponent(sotanghon))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 480, 440, 110);

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 640, 640, 110);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.setAutoscrolls(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SOFTDRINKS in:");

        glass.setBackground(new java.awt.Color(153, 153, 153));
        glass.setForeground(new java.awt.Color(255, 255, 255));
        glass.setText("Glass/Mug");
        glass.setAutoscrolls(true);
        glass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassActionPerformed(evt);
            }
        });

        pitcher.setBackground(new java.awt.Color(153, 153, 153));
        pitcher.setForeground(new java.awt.Color(255, 255, 255));
        pitcher.setText("Pitcher");
        pitcher.setAutoscrolls(true);
        pitcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pitcherActionPerformed(evt);
            }
        });

        drum.setBackground(new java.awt.Color(153, 153, 153));
        drum.setForeground(new java.awt.Color(255, 255, 255));
        drum.setText("Drum");
        drum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(glass)
                            .addComponent(pitcher)
                            .addComponent(drum)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(glass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pitcher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(500, 260, 180, 110);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 760, 90, 25);

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 910, 79, 25);

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 950, 79, 25);

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setText("Add to Order");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(440, 760, 120, 25);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CUSTOMER NAME: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 102, 120, 20);

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(170, 100, 120, 22);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CONTACT NO:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 150, 130, 40);

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });
        jPanel1.add(contact);
        contact.setBounds(140, 160, 150, 22);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ORDER DATE:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(450, 100, 90, 20);

        date.setEditable(false);
        jPanel1.add(date);
        date.setBounds(540, 100, 130, 22);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ORDER TIME:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(450, 120, 80, 40);

        time.setEditable(false);
        jPanel1.add(time);
        time.setBounds(540, 130, 130, 22);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("ORDER DETAILS");

        txttotal.setEditable(false);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Total Amount");

        txttax.setEditable(false);

        txtamdue.setEditable(false);

        jLabel16.setText("Amount Due (78%)");

        jLabel17.setText("Tax (22%)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttotal)
                    .addComponent(txttax, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtamdue))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtamdue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txttax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(40, 760, 320, 120);

        jLabel18.setBackground(new java.awt.Color(255, 102, 102));
        jLabel18.setFont(new java.awt.Font("Vineta BT", 1, 40)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("PIZZALICIOUS");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(120, 0, 510, 60);

        jLabel19.setFont(new java.awt.Font("Vivaldi", 3, 25)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("\"Don’t Think Twice, Grab a Slice!\"");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(180, 40, 480, 60);

        jLabel20.setFont(new java.awt.Font("Blackadder ITC", 3, 28)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("---------------------------Menu---------------------------");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(50, 200, 620, 30);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("*ACCESS ORDER HERE*");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(280, 610, 170, 30);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ADDITIONAL");

        cheese.setBackground(new java.awt.Color(153, 153, 153));
        cheese.setForeground(new java.awt.Color(255, 255, 255));
        cheese.setText("Cheese");
        cheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheeseActionPerformed(evt);
            }
        });

        beef.setBackground(new java.awt.Color(153, 153, 153));
        beef.setForeground(new java.awt.Color(255, 255, 255));
        beef.setText("Beef");
        beef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefActionPerformed(evt);
            }
        });

        bacon.setBackground(new java.awt.Color(153, 153, 153));
        bacon.setForeground(new java.awt.Color(255, 255, 255));
        bacon.setText("Bacon");
        bacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(beef)
                        .addComponent(cheese)
                        .addComponent(bacon)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beef, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bacon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(500, 380, 180, 110);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("DELIVERY ADDRESS:");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(50, 120, 130, 40);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressKeyPressed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(180, 130, 110, 22);

        jLabel2.setFont(new java.awt.Font("Blackadder ITC", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("--------------------------------------------------------------");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 590, 620, 30);

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QTY");

        txtqty.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(540, 510, 120, 60);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("*NO MULTIPLE SELECTIONS; ONE ORDER SELECTION AT A TIME.*");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(170, 230, 390, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 204, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("→");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(490, 500, 50, 70);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Pictures\\pizza-4952534_1280.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -60, 730, 1400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spagActionPerformed
        if (spag.isSelected()) {
            bihon.setSelected(false);
            palabok.setSelected(false);
            sotanghon.setSelected(false);
        }         
    }//GEN-LAST:event_spagActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
       
    }//GEN-LAST:event_contactActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        name.setText("");
        address.setText("");
        contact.setText("");
        date.setText("");
        time.setText("");
        txttotal.setText("");
        txtamdue.setText("");
        txttax.setText("");
        S.setSelected(false);
        M.setSelected(false);
        V.setSelected(false);
        H.setSelected(false);
        B.setSelected(false);
        Sreg.setSelected(false);
        Sper.setSelected(false);
        Mper.setSelected(false);
        Vper.setSelected(false);
        Hper.setSelected(false);
        Bper.setSelected(false);
        Sreg.setSelected(false);
        Mreg.setSelected(false);
        Vreg.setSelected(false);
        Hreg.setSelected(false);
        Breg.setSelected(false);
        Sfam.setSelected(false);
        Mfam.setSelected(false);
        Vfam.setSelected(false);
        Hfam.setSelected(false);
        Bfam.setSelected(false);
        spag.setSelected(false);
        bihon.setSelected(false);
        palabok.setSelected(false);
        sotanghon.setSelected(false);
        glass.setSelected(false);
        pitcher.setSelected(false);
        drum.setSelected(false);
        cheese.setSelected(false);
        beef.setSelected(false);
        bacon.setSelected(false);
        txtqty.setValue(0);    
        model.setRowCount(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:a");
        time.setText(tTime.format(timer.getTime()));
        SimpleDateFormat Tdate = new SimpleDateFormat("MMM-dd-yyyy");
        date.setText(Tdate.format(timer.getTime()));
        


            if (Sper.isSelected() == true) {                  
                    SupremePizza p = new SupremePizza();
                    p.setperPrice();
                    txttotal.setText(Double.toString(p.getperPrice()));                    
                    item = "Supreme - Personal";
                    price = (p.getperPrice());
                } else if (Sreg.isSelected() == true) {                   
                    SupremePizza p = new SupremePizza();
                    p.setregPrice();
                    txttotal.setText(Double.toString(p.getperPrice()));                    
                    item = "Supreme - Regular";
                    price = (p.getregPrice());
                } else if (Sfam.isSelected() == true) {                   
                    SupremePizza p = new SupremePizza();
                    p.setfamPrice();
                    txttotal.setText(Double.toString(p.getperPrice()));                    
                    item = "Supreme - Family";
                    price = (p.getfamPrice());

                } else if(Mper.isSelected() == true) {
                   MeatLovers p = new MeatLovers();
                   p.setperPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Meat Lovers - Personal";
                   price = (p.getperPrice());
                } else if(Mreg.isSelected() == true) {
                   MeatLovers p = new MeatLovers();
                   p.setregPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Meat Lovers - Regular";
                   price = (p.getregPrice());
                } else if(Mfam.isSelected() == true) {
                   MeatLovers p = new MeatLovers();
                   p.setfamPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Meat Lovers - Family";
                   price = (p.getfamPrice());
                   
                } else if (Vper.isSelected() == true) {
                   VeggieLovers p = new VeggieLovers();
                   p.setperPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Veggie Lovers - Personal";
                   price = (p.getperPrice());
                } else if (Vreg.isSelected() == true) {
                   VeggieLovers p = new VeggieLovers();
                   p.setregPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Veggie Lovers - Regular";
                   price = (p.getregPrice());
                } else if (Vfam.isSelected() == true) {
                   VeggieLovers p = new VeggieLovers();
                   p.setfamPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Veggie Lovers - Family";
                   price = (p.getfamPrice());
                   
                } else if (Hper.isSelected() == true) {
                   Hawaiian p = new Hawaiian();
                   p.setperPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Hawaiian - Personal";
                   price = (p.getperPrice());
                } else if (Hreg.isSelected() == true) {
                   Hawaiian p = new Hawaiian();
                   p.setregPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Hawaiian - Regular";
                   price = (p.getregPrice());
                } else if (Hfam.isSelected() == true) {
                    Hawaiian p = new Hawaiian();
                   p.setfamPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Hawaiian - Family";
                   price = (p.getfamPrice());
                } else if (Bper.isSelected() == true) {
                    BaconLovers p = new BaconLovers();
                   p.setperPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Bacon Lovers - Personal";
                   price = (p.getperPrice());
                } else if (Breg.isSelected() == true) {
                   BaconLovers p = new BaconLovers();
                   p.setregPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Bacon Lovers - Regular";
                   price = (p.getregPrice());
                } else if (Bfam.isSelected() == true) {
                    BaconLovers p = new BaconLovers();
                   p.setfamPrice();
                   txttotal.setText(Double.toString(p.getperPrice()));
                   item = "Bacon Lovers - Family";
                   price = (p.getfamPrice());
                   
            } else if (cheese.isSelected() == true) {
                item = "Additional - Cheese";
                price = 100;

            } else if (beef.isSelected() == true) {
                item = "Additional - Beef";
                price = 250;
 
            } else if (bacon.isSelected() == true) {
                item = "Additional - Bacon";
                price = 200;
                
            } else if (glass.isSelected() == true) {
                item = "Softdrinks - Glass";
                price = 25;

            } else if (pitcher.isSelected() == true) {
                item = "Softdrinks - Pitcher";
                price = 65;
 
            } else if (drum.isSelected() == true) {
                item = "Softdrinks - Drum";
                price = 120;

            } else if (spag.isSelected() == true) {
                item = "Spaghetti w/ Meatballs";
                price = 95;

            } else if (bihon.isSelected() == true) {
                item = "Special Pansit Bihon";
                price = 50;
 
            } else if (palabok.isSelected() == true) {
                item = "Pansit Palabok";
                price = 75;

            } else if (sotanghon.isSelected() == true) {
                item = "Sotanghon";
                price = 60;
            } 
        
        int qty = Integer.parseInt(txtqty.getValue().toString());
        int tot = qty*price; 
        
        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[] {
           item,
           price,
           qty,
           tot });
                
        int sum = 0;
        for(int a = 0; a<jTable1.getRowCount(); a++) {
            sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());         
        }
        
        final double amdue = .78;
        final double tax = .22;
                txttotal.setText(Double.toString(sum));
                txtamdue.setText(Double.toString(sum * amdue));
                txttax.setText(Double.toString(sum * tax)); 
    
        S.setSelected(false);
        M.setSelected(false);
        V.setSelected(false);
        H.setSelected(false);
        B.setSelected(false);
        Sreg.setSelected(false);
        Sper.setSelected(false);
        Mper.setSelected(false);
        Vper.setSelected(false);
        Hper.setSelected(false);
        Bper.setSelected(false);
        Sreg.setSelected(false);
        Mreg.setSelected(false);
        Vreg.setSelected(false);
        Hreg.setSelected(false);
        Breg.setSelected(false);
        Sfam.setSelected(false);
        Mfam.setSelected(false);
        Vfam.setSelected(false);
        Hfam.setSelected(false);
        Bfam.setSelected(false);
        spag.setSelected(false);
        bihon.setSelected(false);
        palabok.setSelected(false);
        sotanghon.setSelected(false);
        glass.setSelected(false);
        pitcher.setSelected(false);
        drum.setSelected(false);
        cheese.setSelected(false);
        beef.setSelected(false);
        bacon.setSelected(false);    
        txtqty.setValue(0); 

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model.removeRow(jTable1.getSelectedRow());
        int sum = 0;
        for(int a = 0; a<jTable1.getRowCount(); a++) {
            sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());         
        }
        
        final double amdue = .78;
        final double tax = .22;
                txttotal.setText(Double.toString(sum));
                txtamdue.setText(Double.toString(sum * amdue));
                txttax.setText(Double.toString(sum * tax));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
     
    }//GEN-LAST:event_txttotalActionPerformed

    private void cheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheeseActionPerformed
        if (cheese.isSelected()) {
            beef.setSelected(false);
            bacon.setSelected(false);
        }     
    }//GEN-LAST:event_cheeseActionPerformed

    private void beefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beefActionPerformed
        if (beef.isSelected()) {
            cheese.setSelected(false);
            bacon.setSelected(false);
        }    
    }//GEN-LAST:event_beefActionPerformed

    private void baconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconActionPerformed
        if (bacon.isSelected()) {
            beef.setSelected(false);
            cheese.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_baconActionPerformed

    private void palabokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabokActionPerformed
        if (palabok.isSelected()) {
            bihon.setSelected(false);
            spag.setSelected(false);
            sotanghon.setSelected(false);
        }   
    }//GEN-LAST:event_palabokActionPerformed

    private void pitcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pitcherActionPerformed
        if (pitcher.isSelected()) {
            glass.setSelected(false);
            drum.setSelected(false);
        }
    }//GEN-LAST:event_pitcherActionPerformed

    private void bihonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bihonActionPerformed
        if (bihon.isSelected()) {
            spag.setSelected(false);
            palabok.setSelected(false);
            sotanghon.setSelected(false);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_bihonActionPerformed

    private void sotanghonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotanghonActionPerformed
        if (sotanghon.isSelected()) {
            bihon.setSelected(false);
            palabok.setSelected(false);
            spag.setSelected(false);
        }  
    }//GEN-LAST:event_sotanghonActionPerformed

    private void drumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drumActionPerformed
        if (drum.isSelected()) {
            pitcher.setSelected(false);
            glass.setSelected(false);
        } 
    }//GEN-LAST:event_drumActionPerformed

    private void glassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassActionPerformed
        if (glass.isSelected()) {
            pitcher.setSelected(false);
            drum.setSelected(false);
        }   
    }//GEN-LAST:event_glassActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed

    }//GEN-LAST:event_addressActionPerformed

    private void BfamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfamActionPerformed
        if (B.isSelected()== true) { 
        if (Bfam.isSelected()) {
            Breg.setSelected(false);
            Bper.setSelected(false);} }
       
       if (B.isSelected()== false) {  
            Bper.setSelected(false);
            Breg.setSelected(false);
            Bfam.setSelected(false);}        
    }//GEN-LAST:event_BfamActionPerformed

    private void HfamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HfamActionPerformed
        if (H.isSelected()== true) { 
        if (Hfam.isSelected()) {
            Hreg.setSelected(false);
            Hper.setSelected(false);} }
       
       if (H.isSelected()== false) {  
            Hper.setSelected(false);
            Hreg.setSelected(false);
            Hfam.setSelected(false);}           
    }//GEN-LAST:event_HfamActionPerformed

    private void VfamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VfamActionPerformed
        if (V.isSelected()== true) { 
        if (Vfam.isSelected()) {
            Vreg.setSelected(false);
            Vper.setSelected(false);} }
       
       if (V.isSelected()== false) {  
            Vper.setSelected(false);
            Vreg.setSelected(false);
            Vfam.setSelected(false);}          
    }//GEN-LAST:event_VfamActionPerformed

    private void MfamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfamActionPerformed
        if (M.isSelected()== true) { 
        if (Mfam.isSelected()) {
            Mreg.setSelected(false);
            Mper.setSelected(false);} }
       
       if (M.isSelected()== false) {  
            Mper.setSelected(false);
            Mreg.setSelected(false);
            Mfam.setSelected(false);}       
    }//GEN-LAST:event_MfamActionPerformed

    private void SfamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SfamActionPerformed
        if (S.isSelected()== true) { 
        if (Sfam.isSelected()) {
            Sreg.setSelected(false);
            Sper.setSelected(false);} }
       
       if (S.isSelected()== false) {  
            Sper.setSelected(false);
            Sreg.setSelected(false);
            Sfam.setSelected(false);}         
    }//GEN-LAST:event_SfamActionPerformed

    private void BregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregActionPerformed
        if (B.isSelected()== true) { 
        if (Breg.isSelected()) {
            Bper.setSelected(false);
            Bfam.setSelected(false);} }
       
       if (B.isSelected()== false) {  
            Bper.setSelected(false);
            Breg.setSelected(false);
            Bfam.setSelected(false);}         
    }//GEN-LAST:event_BregActionPerformed

    private void HregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HregActionPerformed
        if (H.isSelected()== true) { 
        if (Hreg.isSelected()) {
            Hper.setSelected(false);
            Hfam.setSelected(false);} }
       
       if (H.isSelected()== false) {  
            Hper.setSelected(false);
            Hreg.setSelected(false);
            Hfam.setSelected(false);}          
    }//GEN-LAST:event_HregActionPerformed

    private void VregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VregActionPerformed
        if (V.isSelected()== true) { 
        if (Vreg.isSelected()) {
            Vper.setSelected(false);
            Vfam.setSelected(false);} }
       
       if (V.isSelected()== false) {  
            Vper.setSelected(false);
            Vreg.setSelected(false);
            Vfam.setSelected(false);}        
    }//GEN-LAST:event_VregActionPerformed

    private void MregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MregActionPerformed
        if (M.isSelected()== true) { 
        if (Mreg.isSelected()) {
            Mper.setSelected(false);
            Mfam.setSelected(false);} }
       
       if (M.isSelected()== false) {  
            Mper.setSelected(false);
            Mreg.setSelected(false);
            Mfam.setSelected(false);}        
    }//GEN-LAST:event_MregActionPerformed

    private void SregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SregActionPerformed
        if (S.isSelected()== true) { 
        if (Sreg.isSelected()) {
            Sper.setSelected(false);
            Sfam.setSelected(false);} }
       
       if (S.isSelected()== false) {  
            Sper.setSelected(false);
            Sreg.setSelected(false);
            Sfam.setSelected(false);}         
    }//GEN-LAST:event_SregActionPerformed

    private void BperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BperActionPerformed
        if (B.isSelected()== true) { 
        if (Bper.isSelected()) {
            Breg.setSelected(false);
            Bfam.setSelected(false);} }
       
       if (B.isSelected()== false) {  
            Bper.setSelected(false);
            Breg.setSelected(false);
            Bfam.setSelected(false);}          
    }//GEN-LAST:event_BperActionPerformed

    private void HperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HperActionPerformed
        if (H.isSelected()== true) { 
        if (Hper.isSelected()) {
            Hreg.setSelected(false);
            Hfam.setSelected(false);} }
       
       if (H.isSelected()== false) {  
            Hper.setSelected(false);
            Hreg.setSelected(false);
            Hfam.setSelected(false);}           
    }//GEN-LAST:event_HperActionPerformed

    private void VperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VperActionPerformed
        if (V.isSelected()== true) { 
        if (Vper.isSelected()) {
            Vreg.setSelected(false);
            Vfam.setSelected(false);} }
       
       if (V.isSelected()== false) {  
            Vper.setSelected(false);
            Vreg.setSelected(false);
            Vfam.setSelected(false);}         
    }//GEN-LAST:event_VperActionPerformed

    private void MperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MperActionPerformed
        if (M.isSelected()== true) { 
        if (Mper.isSelected()) {
            Mreg.setSelected(false);
            Mfam.setSelected(false);} }
       
       if (M.isSelected()== false) {  
            Mper.setSelected(false);
            Mreg.setSelected(false);
            Mfam.setSelected(false);}         
    }//GEN-LAST:event_MperActionPerformed

    private void SperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SperActionPerformed
       if (S.isSelected()== true) { 
        if (Sper.isSelected()) {
            Sreg.setSelected(false);
            Sfam.setSelected(false);} }
       
       if (S.isSelected()== false) {  
            Sper.setSelected(false);
            Sreg.setSelected(false);
            Sfam.setSelected(false);}
    }//GEN-LAST:event_SperActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed

    }//GEN-LAST:event_SActionPerformed

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
      char c = evt.getKeyChar();
      if (!Character.isDigit(c)) {
         evt.consume();
      }
    }//GEN-LAST:event_contactKeyTyped

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
       char c = evt.getKeyChar();
       if (Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c)) {
          name.setEditable(true);
       } else {
          name.setEditable(false); } 
    }//GEN-LAST:event_nameKeyPressed

    private void addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyPressed
          
    }//GEN-LAST:event_addressKeyPressed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox B;
    private javax.swing.JRadioButton Bfam;
    private javax.swing.JRadioButton Bper;
    private javax.swing.JRadioButton Breg;
    private javax.swing.JCheckBox H;
    private javax.swing.JRadioButton Hfam;
    private javax.swing.JRadioButton Hper;
    private javax.swing.JRadioButton Hreg;
    private javax.swing.JCheckBox M;
    private javax.swing.JRadioButton Mfam;
    private javax.swing.JRadioButton Mper;
    private javax.swing.JRadioButton Mreg;
    private javax.swing.JCheckBox S;
    private javax.swing.JRadioButton Sfam;
    private javax.swing.JRadioButton Sper;
    private javax.swing.JRadioButton Sreg;
    private javax.swing.JCheckBox V;
    private javax.swing.JRadioButton Vfam;
    private javax.swing.JRadioButton Vper;
    private javax.swing.JRadioButton Vreg;
    private javax.swing.JTextField address;
    private javax.swing.JCheckBox bacon;
    private javax.swing.JCheckBox beef;
    private javax.swing.JCheckBox bihon;
    private javax.swing.JCheckBox cheese;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField date;
    private javax.swing.JRadioButton drum;
    private javax.swing.JRadioButton glass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JCheckBox palabok;
    private javax.swing.JRadioButton pitcher;
    private javax.swing.JCheckBox sotanghon;
    private javax.swing.JCheckBox spag;
    private javax.swing.JTextField time;
    private javax.swing.JTextField txtamdue;
    private javax.swing.JSpinner txtqty;
    private javax.swing.JTextField txttax;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
