
import java.sql.Connection;
import java.sql.DriverManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MITALI
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CB = new javax.swing.JButton();
        SD = new javax.swing.JButton();
        SUD = new javax.swing.JButton();
        VR = new javax.swing.JLabel();
        OD = new javax.swing.JButton();
        PD = new javax.swing.JButton();
        Search = new javax.swing.JLabel();
        Search.setFont(new Font("Tw Cen MT", Font.BOLD, 14));

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        CB.setBackground(new java.awt.Color(255, 255, 255));
        CB.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        CB.setText("Customer  Detail");
        CB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });

        SD.setBackground(new java.awt.Color(255, 255, 255));
        SD.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        SD.setText("  Stock Details");
        SD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDActionPerformed(evt);
            }
        });

        SUD.setBackground(new java.awt.Color(255, 255, 255));
        SUD.setFont(new Font("Constantia", Font.BOLD, 36)); // NOI18N
        SUD.setText("Supplier Detail");
        SUD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUDActionPerformed(evt);
            }
        });

        VR.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        VR.setForeground(new java.awt.Color(0, 0, 204));
        VR.setText(" View  REPORT");

        OD.setBackground(new java.awt.Color(255, 255, 255));
        OD.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        OD.setText(" Order Detail");
        OD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODActionPerformed(evt);
            }
        });

        PD.setBackground(new java.awt.Color(255, 255, 255));
        PD.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        PD.setText(" Product Details");
        PD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDActionPerformed(evt);
            }
        });
        
        MD = new JButton("Manager Details");
        MD.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 Connection cn=null;
        	     
                 try
                 {
                 Class.forName("com.mysql.jdbc.Driver");
                 System.out.println("Driver Registered");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
                 System.out.println("Connection Success");
                 String path="C:\\Furniture_Shop_Management\\Report\\manager details.jrxml";
                 JasperDesign design = JRXmlLoader.load(path);
          //JasperReport report = JasperCompileManager.compileReport(design);
                 JasperReport jr=JasperCompileManager.compileReport(design);
                 
                 JasperPrint jp=JasperFillManager.fillReport(jr, null, cn);
                 JasperViewer jv=new JasperViewer(jp);
                 jv.setVisible(true);
                // jv.setVisible(true);
                 }catch(Exception ex)
                 {
                 System.out.println(ex);
                 }  
        	}
        });
        MD.setFont(new Font("Constantia", Font.BOLD, 36));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(251, Short.MAX_VALUE)
        			.addComponent(VR, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
        			.addGap(176))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(PD, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(CB, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(64)
        					.addComponent(OD)))
        			.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(SUD, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(SD, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addComponent(MD, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(VR, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        			.addGap(104)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(SD, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(CB, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(59)
        					.addComponent(SUD, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(46)
        					.addComponent(OD, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(PD, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(MD, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
        			.addGap(58))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(70, 80, 820, 500);

        Search.setIcon(new javax.swing.ImageIcon("C:\\Users\\MITALI\\Downloads\\cupboard2.jpg"));
        jPanel1.add(Search);
        Search.setBounds(0, 0, 1400, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        // TODO add your handling code here:
        
         Connection cn=null;
     
           try
           {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
          cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
           System.out.println("Connection Success");
           String path="C:\\Furniture_Shop_Management\\Report\\customer details.jrxml";
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, null, cn);
           JasperViewer jv=new JasperViewer(jp);
           JasperViewer.viewReport(jp,false);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }
    }//GEN-LAST:event_CBActionPerformed

    private void SDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDActionPerformed
        // TODO add your handling code here:
    	  Connection cn=null;
    	     
          try
          {
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver Registered");
         cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
          System.out.println("Connection Success");
          String path="C:\\Furniture_Shop_Management\\Report\\StockDetails.jrxml";
          JasperDesign design = JRXmlLoader.load(path);
   //JasperReport report = JasperCompileManager.compileReport(design);
          JasperReport jr=JasperCompileManager.compileReport(design);
          
          JasperPrint jp=JasperFillManager.fillReport(jr, null, cn);
          JasperViewer jv=new JasperViewer(jp);
          jv.setVisible(true);
         // jv.setVisible(true);
          }catch(Exception ex)
          {
          System.out.println(ex);
          }
    }//GEN-LAST:event_SDActionPerformed

    private void SUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUDActionPerformed
        // TODO add your handling code here:
    	 Connection cn=null;
	     
         try
         {
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver Registered");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
         System.out.println("Connection Success");
         String path="C:\\Furniture_Shop_Management\\Report\\SupplierDetail.jrxml";
         JasperDesign design = JRXmlLoader.load(path);
  //JasperReport report = JasperCompileManager.compileReport(design);
         JasperReport jr=JasperCompileManager.compileReport(design);
         
         JasperPrint jp=JasperFillManager.fillReport(jr, null, cn);
         JasperViewer jv=new JasperViewer(jp);
         jv.setVisible(true);
        // jv.setVisible(true);
         }catch(Exception ex)
         {
         System.out.println(ex);
         }    }//GEN-LAST:event_SUDActionPerformed

    private void ODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODActionPerformed
        // TODO add your handling code here:
        Connection cn=null;
     
           try
           {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
          cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
           System.out.println("Connection Success");
           String path="C:\\Furniture_Shop_Management\\Report\\OrderDetails.jrxml";
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, null, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }
    }//GEN-LAST:event_ODActionPerformed

    private void PDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDActionPerformed
        // TODO add your handling code here:
         Connection cn=null;
     
           try
           {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Registered");
          cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
           System.out.println("Connection Success");
           String path="C:\\Furniture_Shop_Management\\Report\\ProductDetails.jrxml";
           JasperDesign design = JRXmlLoader.load(path);
    //JasperReport report = JasperCompileManager.compileReport(design);
           JasperReport jr=JasperCompileManager.compileReport(design);
           
           JasperPrint jp=JasperFillManager.fillReport(jr, null, cn);
           JasperViewer jv=new JasperViewer(jp);
           jv.setVisible(true);
          // jv.setVisible(true);
           }catch(Exception ex)
           {
           System.out.println(ex);
           }
    }//GEN-LAST:event_PDActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CB;
    private javax.swing.JButton OD;
    private javax.swing.JButton PD;
    private javax.swing.JButton SD;
    private javax.swing.JButton SUD;
    private javax.swing.JLabel VR;
    private javax.swing.JLabel Search;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private JButton MD;
}
