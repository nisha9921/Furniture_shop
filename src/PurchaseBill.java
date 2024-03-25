
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MITALI
 */
public class PurchaseBill extends javax.swing.JFrame {
     Connection cn = null;
     Statement st = null;
     
      Database db = new Database();
        String result = db.Connectdb();
       // System.out.println(result);
    /**
     * Creates new form PurchaseBill
     */
    public PurchaseBill() {
        initComponents();
    }

    

	public void auto_id()
	{
		try
		{
			long count=0;
	
			 Class.forName("com.mysql.jdbc.Driver");
	         cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
	         st=cn.createStatement();
	         String sql="Select * from purchasebill";
	         ResultSet rs=st.executeQuery(sql);
      
	        while(rs.next())
	        {
	        	count = Long.parseLong(rs.getString("purchase_bill_no"));
	        }
	        
	        count++;
	          
	         pbno.setText(String.valueOf(count)) ;
		}
		catch(Exception ex)
		{
			 JOptionPane.showMessageDialog(null, ex.toString());
		}
	}
	
	public void fetch(String purchase_bill_no)
	{
		try
		{
	
		 Class.forName("com.mysql.jdbc.Driver");
         cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture_shop_management","root","root");
         st=cn.createStatement();
         String sql="Select company_name, design, product_id, product_name, product_price, quantity, total from purchasebill_cart where purchase_bill_no='"+purchase_bill_no+"'";
         ResultSet rs=st.executeQuery(sql);
         PreparedStatement pst=null;
         table.setModel(DbUtils.resultSetToTableModel(rs));
         
		}
		catch(Exception ex)
		{
			 JOptionPane.showMessageDialog(null, ex.toString());
		}
	}
	 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(10, 11, 1246, 86);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(10, 136, 192, 32);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(10, 206, 192, 29);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(10, 265, 192, 30);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(10, 326, 171, 29);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(10, 433, 192, 30);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(525, 356, 120, 30);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(522, 405, 149, 30);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(10, 368, 178, 29);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(522, 466, 149, 28);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setBounds(37, 531, 149, 30);
        NEW = new javax.swing.JButton();
        NEW.setBounds(10, 613, 73, 31);
        SAVE = new javax.swing.JButton();
        SAVE.setBounds(196, 613, 71, 31);
        DELETE = new javax.swing.JButton();
        DELETE.setBounds(382, 613, 87, 31);
        UPDATE = new javax.swing.JButton();
        UPDATE.setBounds(542, 613, 99, 31);
        EXIT = new javax.swing.JButton();
        EXIT.setBounds(715, 613, 77, 31);
        pbdate = new com.toedter.calendar.JDateChooser();
        pbdate.setBounds(311, 366, 160, 31);
        pbno = new javax.swing.JTextField();
        pbno.setBounds(309, 136, 87, 32);
        sid = new javax.swing.JTextField();
        sid.setBounds(309, 205, 160, 29);
        sname = new javax.swing.JTextField();
        sname.setBounds(309, 264, 160, 30);
        sadd = new javax.swing.JTextField();
        sadd.setBounds(309, 324, 160, 30);
        gtotal = new javax.swing.JTextField();
        gtotal.setBounds(724, 354, 160, 32);
        tax = new javax.swing.JTextField();
        tax.setBounds(724, 404, 160, 30);
        tamount = new javax.swing.JTextField();
        tamount.setBounds(726, 561, 160, 31);
        dis = new javax.swing.JTextField();
        dis.setBounds(726, 465, 160, 28);
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setBounds(522, 517, 178, 31);
        gst = new javax.swing.JTextField();
        gst.setBounds(726, 515, 160, 32);
        pbill = new javax.swing.JComboBox();
        pbill.setBounds(196, 528, 160, 30);
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(532, 567, 91, 25);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(522, 265, 120, 30);
        quantity = new javax.swing.JTextField();
        quantity.setBounds(721, 264, 160, 30);
        pname = new javax.swing.JTextField();
        pname.setBounds(721, 204, 160, 31);
        jLabel15 = new javax.swing.JLabel();
        jLabel15.setBounds(505, 205, 192, 31);
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204,80));
        jPanel1.setName("SAdd"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel2.setText("        Purchase  Bill");
        
        lblNewLabel = new JLabel("PANHALKAR STEEL FURNITURE ,32 SHIRALA");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(224)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE)
        			.addGap(229)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel3.setLayout(jPanel3Layout);

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel3.setText(" Purchase Bill Number");

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel4.setText("  Supplier  Id");

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel5.setText(" Supplier  Name");

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel6.setText(" Supplier  Address");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel7.setText("Company Name");

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel8.setText("Total");

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel9.setText("   Tax");

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel10.setText("  Purchase Bill Date");

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel12.setText("  Discount");

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel13.setText("  Pay Bill");

        NEW.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        NEW.setText(" NEW");
        NEW.setName("NEW"); // NOI18N
        NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWActionPerformed(evt);
            }
        });

        SAVE.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        SAVE.setText("SAVE");
        SAVE.setName("SAVE"); // NOI18N
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        DELETE.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setName("DELETE"); // NOI18N
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        UPDATE.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        UPDATE.setText(" UPDATE");
        UPDATE.setName("UPDATE"); // NOI18N
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.setName("EXIT"); // NOI18N
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        pbdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pbdate.setName("PBDate"); // NOI18N

        pbno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pbno.setName("PBNo"); // NOI18N
        pbno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pbnoKeyPressed(evt);
            }
        });

        sid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sid.setName("SId"); // NOI18N
        sid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sidKeyPressed(evt);
            }
        });

        sname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sname.setName("SName"); // NOI18N
        sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                snameKeyPressed(evt);
            }
        });

        sadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sadd.setName("SAdd"); // NOI18N
        sadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saddKeyPressed(evt);
            }
        });

        gtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gtotal.setName("GTotal"); // NOI18N
        gtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gtotalKeyPressed(evt);
            }
        	@Override
        	public void keyReleased(KeyEvent e) {
        		
        		int total1=0;
        	       int price1=Integer.parseInt(price.getText());
        	       int quanitity=Integer.parseInt(quantity.getText());
        	       total1 = price1 * quanitity;
        	       gtotal.setText(String.valueOf(total1));
        	}
        });

        tax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tax.setName("Tax"); // NOI18N
        tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxActionPerformed(evt);
            }
        });

        tamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tamount.setName("TAmount"); // NOI18N
        tamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tamountKeyPressed(evt);
            }
        });

        dis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dis.setName("Discount"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel14.setText("    GST");

        gst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pbill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pbill.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "online payment", "cash", "credit card", "debit card" }));
        pbill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbillActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Total Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel11.setText("Quantity");

        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel15.setText("   Product   Name");

        pbdate.getAccessibleContext().setAccessibleName("PBDate");
        pbno.getAccessibleContext().setAccessibleName("PBNo");
        sid.getAccessibleContext().setAccessibleName("SId");
        sname.getAccessibleContext().setAccessibleName("SName");
        sadd.getAccessibleContext().setAccessibleName("");
        gtotal.getAccessibleContext().setAccessibleName("GTotal");
        tax.getAccessibleContext().setAccessibleName("Tax");
        tamount.getAccessibleContext().setAccessibleName("TAmount");
        dis.getAccessibleContext().setAccessibleName("Discount");

        jPanel2.add(jPanel1);
        jPanel1.setBounds(44, 11, 1300, 655);
        jPanel1.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel1.add(NEW);
        jPanel1.add(SAVE);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel7);
        jPanel1.add(jLabel6);
        jPanel1.add(jLabel10);
        jPanel1.add(jLabel15);
        jPanel1.add(sid);
        jPanel1.add(sname);
        jPanel1.add(sadd);
        jPanel1.add(DELETE);
        jPanel1.add(pbdate);
        jPanel1.add(pbno);
        jPanel1.add(pname);
        jPanel1.add(jLabel9);
        jPanel1.add(tax);
        jPanel1.add(jLabel14);
        jPanel1.add(jLabel13);
        jPanel1.add(jButton1);
        jPanel1.add(jLabel8);
        jPanel1.add(gtotal);
        jPanel1.add(jLabel11);
        jPanel1.add(quantity);
        jPanel1.add(jLabel12);
        jPanel1.add(UPDATE);
        jPanel1.add(dis);
        jPanel1.add(EXIT);
        jPanel1.add(gst);
        jPanel1.add(pbill);
        jPanel1.add(tamount);
        
        JLabel lblProductId = new JLabel();
        lblProductId.setText("   Product  Id");
        lblProductId.setFont(new Font("Constantia", Font.BOLD, 18));
        lblProductId.setBounds(505, 144, 160, 31);
        jPanel1.add(lblProductId);
        
        product_id = new JTextField();
        product_id.setBounds(724, 143, 157, 31);
        jPanel1.add(product_id);
        product_id.setColumns(10);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(905, 144, 385, 169);
        jPanel1.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        
        JButton btnAdd = new JButton();
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 
        	       String insert = db.Insert("insert into purchasebill_cart(purchase_bill_no, supplier_id, company_name, design,product_id, product_name, product_price, quantity, total)values('"+pbno.getText().toString()+"','"+sid.getText().toString()+"','"+cno.getText().toString()+"','"+design.getText().toString()+"','"+product_id.getText().toString()+"','"+pname.getText().toString()+"','"+price.getText().toString()+"','"+quantity.getText().toString()+"','"+gtotal.getText().toString()+"')");
        	         JOptionPane.showMessageDialog(null, insert );
        	       fetch(pbno.getText().toString());
        	}
        });
        btnAdd.setText("Add");
        btnAdd.setName("EXIT");
        btnAdd.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
        btnAdd.setBounds(923, 324, 77, 31);
        jPanel1.add(btnAdd);
        
        lblDising = new JLabel();
        lblDising.setText("Design");
        lblDising.setFont(new Font("Constantia", Font.BOLD, 18));
        lblDising.setBounds(17, 487, 171, 30);
        jPanel1.add(lblDising);
        
        design = new JTextField();
        design.setBounds(308, 473, 171, 31);
        jPanel1.add(design);
        design.setColumns(10);
        
        lblPrice = new JLabel();
        lblPrice.setText("Price");
        lblPrice.setFont(new Font("Constantia", Font.BOLD, 18));
        lblPrice.setBounds(522, 306, 120, 30);
        jPanel1.add(lblPrice);
        
        price = new JTextField();
        price.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
        		
        		
        		
        	}
        });
        price.setBounds(721, 305, 160, 31);
        jPanel1.add(price);
        price.setColumns(10);
        
        cno = new JTextField();
        cno.setBounds(309, 421, 160, 31);
        jPanel1.add(cno);
        cno.setColumns(10);
        SEARCH = new javax.swing.JButton();
        SEARCH.setBounds(396, 137, 99, 31);
        jPanel1.add(SEARCH);
        
                SEARCH.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
                SEARCH.setText("SEARCH");
                SEARCH.setName("SEARCH"); // NOI18N
                SEARCH.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        SEARCHActionPerformed(evt);
                    }
                });
        jPanel1.getAccessibleContext().setAccessibleName("");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MITALI\\Downloads\\purchase (1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-82, 11, 1402, 701);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1402, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
        auto_id();
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
          String delete=db.delete("delete from  purchasebill  where  purchase_bill_no ='"+pbno.getText().toString()+"' ");
         JOptionPane.showMessageDialog(null,delete);
    }//GEN-LAST:event_DELETEActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat date= new SimpleDateFormat("yyy-MM-dd");
        String date1=date.format(pbdate.getDate());
         String update =db.update("update  purchasebill set supplier_id ='"+sid.getText().toString()+"',supplier_name ='"+sname.getText().toString()+"', supplier_address  ='"+sadd.getText().toString()+"', customer_number ='"+cno.getText().toString()+"', grand_total ='"+gtotal.getText().toString()+"',quantity ='"+quantity.getText().toString()+"', tax ='"+tax.getText().toString()+"',purchase_bill_date ='"+pbdate+"',total_amount ='"+tamount.getText().toString()+"',discount='"+dis.getText().toString()+"',gst='"+gst.getText().toString()+"',pay_bill='"+pbill.getSelectedItem().toString()+"' where   purchase_bill_no  ='"+pbno.getText().toString()+"'");  
 
          JOptionPane.showMessageDialog(null,update);
    }//GEN-LAST:event_UPDATEActionPerformed

    private void NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWActionPerformed
        try
        {
         pbno.setText("");
          sid.setText(""); 
          sname.setText("");
          sadd.setText("");
          cno.setText("");
          pbdate.setDate(null);
          gtotal.setText("");
          quantity.setText("");
          tax.setText("");
          tamount.setText("");
          dis.setText("");
          gst.setText("");
          pbill.setSelectedItem("");
          //table.setModel();
          price.setText("");
          product_id.setText("");
          pname.setText("");
        }
         catch (Exception ex)
        {
           JOptionPane.showMessageDialog(null, ex.toString()); 
        }
    }//GEN-LAST:event_NEWActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat date= new SimpleDateFormat("yyyy-MM-dd");
        String date1=date.format(pbdate.getDate());
        String insert = db.Insert("insert into purchasebill( purchase_bill_no,supplier_id,supplier_name,supplier_address,customer_number,grand_total,quantity,tax,date,total_amount,discount,gst,pay_bill )values('"+pbno.getText().toString()+"','"+sid.getText().toString()+"','"+sname.getText().toString()+"','"+sadd.getText().toString()+"','"+cno.getText().toString()+"','"+gtotal.getText().toString()+"','"+quantity.getText().toString()+"','"+tax.getText().toString()+"','"+date1+"','"+tamount.getText().toString()+"','"+dis.getText().toString()+"','"+gst.getText().toString()+"','"+pbill.getSelectedItem().toString()+"')");
         JOptionPane.showMessageDialog(null, insert );
         
         auto_id();
         try
        {
        int qty = Integer.parseInt(quantity.getText());
        int qty2 = 0; int qty3 = 0;
         
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture_shop_management","root","root");
        st = cn.createStatement();
        String sql = " select * from stockdetail where furniture_type = '"+pname.getText().toString()+"' ";
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next())
        {
            qty2 = Integer.parseInt(rs.getString("quantity"));
        }
        
        qty3 = qty2+qty;
      
            String update =db.update("update stockdetail set quantity = '"+qty3+"'where furniture_type = '"+pname.getText().toString()+"' ");
            JOptionPane.showMessageDialog(null,update);
        }
        catch(Exception ex)
        {
        
        }

          
    }//GEN-LAST:event_SAVEActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        
         homepage obj = new homepage();
        obj.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_EXITActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
    	
    	String pno = pbno.getText();
           try
        {  
             Class.forName("com.mysql.jdbc.Driver");
             cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
             st=cn.createStatement();
             String sql="Select * from  purchasebill where purchase_bill_no='"+pbno.getText().toString()+"'";
             ResultSet rs=st.executeQuery(sql);
             
             while (rs.next())
             { 
               sid.setText(rs.getString("supplier_id"));
               sname.setText(rs.getString("supplier_name"));
               sadd.setText(rs.getString("supplier_address"));
             
               gtotal.setText(rs.getString("grand_total"));
               
               tax.setText(rs.getString("tax"));
             //  pbdate.setDate(rs.getDate("pbdate"));
               tamount.setText(rs.getString("total_amount"));
               dis.setText(rs.getString("discount"));
               gst.setText(rs.getString("discount"));
               pbill.setSelectedItem(rs.getString("pay_bill"));
               
               
               
             }
             
             
             fetch(pno);
             
             
             }
           catch(Exception ex)
           {
               System.out.println(ex);
           }   
               
             
            
    }//GEN-LAST:event_SEARCHActionPerformed

    private void pbnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pbnoKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyChar() >='0'&& evt.getKeyChar() <='9'|| evt.getKeyCode() == evt.VK_BACK_SPACE)
        {
            pbno.setEditable(true);
        }
        else
        {
           pbno .setEditable(false);
        }  
    }//GEN-LAST:event_pbnoKeyPressed

    private void sidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() >='0'&& evt.getKeyChar() <='9'|| evt.getKeyCode() == evt.VK_BACK_SPACE)
        {
            sid.setEditable(true);
        }
        else
        {
           sid .setEditable(false);
        }   
    }//GEN-LAST:event_sidKeyPressed

    private void snameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snameKeyPressed
        // TODO add your handling code here:
         if(Character.isAlphabetic(evt.getKeyChar()) || evt.getKeyCode()==46 || evt.getKeyCode()==32 || evt.getKeyCode() == evt.VK_BACK_SPACE)
        {
        sname.setEditable(true);
        }
        else
        {
        sname .setEditable(false);
        }
    }//GEN-LAST:event_snameKeyPressed

    private void saddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saddKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_saddKeyPressed

    private void gtotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gtotalKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'||evt.getKeyCode()==evt.VK_BACK_SPACE||evt.getKeyCode()==46)
        {
            gtotal.setEditable(true);
        }
        else
          {
           gtotal.setEditable(false);
          }
    }//GEN-LAST:event_gtotalKeyPressed

    private void tamountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamountKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'||evt.getKeyCode()==evt.VK_BACK_SPACE||evt.getKeyCode()==46)
        {
            tamount.setEditable(true);
        }
        else
          {
           tamount.setEditable(false);
          }
    }//GEN-LAST:event_tamountKeyPressed

    private void pbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pbillActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int total_bill=0;
       int Grand_total=Integer.parseInt(gtotal.getText());
    
       int Taax=Integer.parseInt(tax.getText());
       int Discount=Integer.parseInt(dis.getText());
       int gst_tax=Integer.parseInt(gst.getText());
       
       total_bill= Grand_total+Grand_total*Taax/100-Grand_total*Discount/100+Grand_total*gst_tax/100;
       tamount.setText(String.valueOf(total_bill));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         // Database db = new Database();
       // String result = db.Connectdb();
       // System.out.println(result);
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
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseBill().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton NEW;
    private javax.swing.JButton SAVE;
    private javax.swing.JButton SEARCH;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField gst;
    private javax.swing.JTextField gtotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private com.toedter.calendar.JDateChooser pbdate;
    private javax.swing.JComboBox pbill;
    private javax.swing.JTextField pbno;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField sadd;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField tamount;
    private javax.swing.JTextField tax;
    private JTextField product_id;
    private JTable table;
    private JLabel lblDising;
    private JTextField design;
    private JLabel lblPrice;
    private JTextField price;
    private JTextField cno;
    private JLabel lblNewLabel;
    
    
}