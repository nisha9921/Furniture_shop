import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 

public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form home page
     */
    public homepage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Item = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        Manager = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();

        jMenu8.setText("jMenu8");

        jMenu9.setText("jMenu9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MITALI\\Downloads\\modern living room 1 (1).jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 630);

        Item.setText("Item    ");
        Item.setToolTipText("");
        Item.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N

        jMenu12.setText("Product Detail");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        Item.add(jMenu12);

        jMenu13.setText(" Stock Detail");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        Item.add(jMenu13);

        jMenuBar1.add(Item);

        Manager.setText("Manager");
        Manager.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N

        jMenu11.setText(" Manager Form");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        Manager.add(jMenu11);

        jMenuBar1.add(Manager);

        setJMenuBar(jMenuBar1);
                                        Order = new javax.swing.JMenu();
                                        jMenu6 = new javax.swing.JMenu();
                                        jMenu7 = new javax.swing.JMenu();
                                        
                                                Order.setText("Order   ");
                                                Order.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
                                                
                                                        jMenu6.setText("Order Detail");
                                                        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
                                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                jMenu6MouseClicked(evt);
                                                            }
                                                        });
                                                        Order.add(jMenu6);
                                                        
                                                                jMenu7.setText("Purchase Bill");
                                                                jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        jMenu7MouseClicked(evt);
                                                                    }
                                                                });
                                                                Order.add(jMenu7);
                                                                
                                                                        jMenuBar1.add(Order);
                                                                        Supplier = new javax.swing.JMenu();
                                                                        jMenu15 = new javax.swing.JMenu();
                                                                        jMenu1 = new javax.swing.JMenu();
                                                                        
                                                                                Supplier.setText("  Supplier");
                                                                                Supplier.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
                                                                                Supplier.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                        SupplierMouseClicked(evt);
                                                                                    }
                                                                                });
                                                                                
                                                                                        jMenu15.setText("Supplier Detail");
                                                                                        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                                jMenu15MouseClicked(evt);
                                                                                            }
                                                                                        });
                                                                                        Supplier.add(jMenu15);
                                                                                        
                                                                                                jMenu1.setText("Supplier Order Bill");
                                                                                                jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                                        jMenu1MouseClicked(evt);
                                                                                                    }
                                                                                                });
                                                                                                Supplier.add(jMenu1);
                                                                                                
                                                                                                        jMenuBar1.add(Supplier);
                                                                                                        Customer = new javax.swing.JMenu();
                                                                                                        jMenu3 = new javax.swing.JMenu();
                                                                                                        jMenu4 = new javax.swing.JMenu();
                                                                                                        
                                                                                                                Customer.setText("Customer    ");
                                                                                                                Customer.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
                                                                                                                
                                                                                                                        jMenu3.setText("Customer Bill ");
                                                                                                                        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                                                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                                                                jMenu3MouseClicked(evt);
                                                                                                                            }
                                                                                                                        });
                                                                                                                        Customer.add(jMenu3);
                                                                                                                        
                                                                                                                                jMenu4.setText(" Customer Detail");
                                                                                                                                jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                                                                        jMenu4MouseClicked(evt);
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                Customer.add(jMenu4);
                                                                                                                                
                                                                                                                                        jMenuBar1.add(Customer);
                                                                                                                                        
                                                                                                                                        JMenu mnNewMenu = new JMenu("Reports");
                                                                                                                                        mnNewMenu.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
                                                                                                                                        jMenuBar1.add(mnNewMenu);
                                                                                                                                        
                                                                                                                                        JMenuItem mntmNewMenuItem = new JMenuItem("All Report");
                                                                                                                                        mntmNewMenuItem.addActionListener(new ActionListener() {
                                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                                        		Report obj = new Report();
                                                                                                                                                obj.setVisible(true);
                                                                                                                                                
                                                                                                                                        	}
                                                                                                                                        });
                                                                                                                                        mnNewMenu.add(mntmNewMenuItem);
                                                                                                                                        
                                                                                                                                        mntmNewMenuItem_1 = new JMenuItem("Id wise And Date wise");
                                                                                                                                        mntmNewMenuItem_1.addActionListener(new ActionListener() {
                                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                                        	Report_id_wise obj =  new Report_id_wise();
                                                                                                                                                obj.setVisible(true);
                                                                                                                                               
                                                                                                                                        	}
                                                                                                                                        });
                                                                                                                                        mnNewMenu.add(mntmNewMenuItem_1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        CustomerBill1 obj = new CustomerBill1();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        CustomerDetail obj = new CustomerDetail();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        // TODO add your handling code here:
        ProductDetail obj = new ProductDetail();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        // TODO add your handling code here:
        StockDetail obj = new StockDetail();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        OrderDetail obj = new OrderDetail();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        PurchaseBill obj = new PurchaseBill();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        // TODO add your handling code here:
        ManagerForm obj = new ManagerForm();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu11MouseClicked

    private void SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_SupplierMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        SupplyOrderDetailBill obj = new SupplyOrderDetailBill();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        // TODO add your handling code here
        SupplierDetail obj = new SupplierDetail();
        obj.setVisible(true);
        this.hide(); 
    }//GEN-LAST:event_jMenu15MouseClicked

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Customer;
    private javax.swing.JMenu Item;
    private javax.swing.JMenu Manager;
    private javax.swing.JMenu Order;
    private javax.swing.JMenu Supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private JMenuItem mntmNewMenuItem_1;
}