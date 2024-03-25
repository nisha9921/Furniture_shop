

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CustomerBill1 extends JFrame {
	
	
	 Connection cn = null;
	    Statement st = null;

	       Database db = new Database();
	        String result =db.Connectdb();
	        PreparedStatement pst=null;

	private JPanel contentPane;
	private JTextField bill_id;
	private JTextField cust_id;
	private JTextField cust_name;
	private JTextField cust_add;
	private JTextField cno;
	private JTextField pid;
	private JTextField pname;
	private JTextField pprice;
	private JTextField quantity;
	private JTextField dcharges;
	private JTextField discount;
	private JTextField tbill;
	private JButton SEARCH;
	private JButton NEW;
	private JButton SAVE;
	private JButton DELETE;
	private JButton UPDATE;
	private JButton EXIT;
	private JDateChooser date;
	private JComboBox pm;
	private JTable table;
	private JTextField total_amount;
	private JLabel lblNewLabel_15;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerBill1 frame = new CustomerBill1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void auto_id()
	{
		try
		{
			long count=0;
	
			 Class.forName("com.mysql.jdbc.Driver");
	         cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
	         st=cn.createStatement();
	         String sql="Select * from customerbill";
	         ResultSet rs=st.executeQuery(sql);
      
	        while(rs.next())
	        {
	        	count = Long.parseLong(rs.getString("bill_id"));
	        }
	        
	        count++;
	        
	        bill_id.setText(String.valueOf(count));
	          
	          
		}
		catch(Exception ex)
		{
			 JOptionPane.showMessageDialog(null, ex.toString());
		}
	}
	public void fetch(String cust_id)
	{
		try
		{
	        double totalamt=0.0;
	        
		 Class.forName("com.mysql.jdbc.Driver");
         cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
         st=cn.createStatement();
         String sql="Select * from customerbill_cart where bill_id='"+cust_id+"'";
         ResultSet rs=st.executeQuery(sql);
        PreparedStatement pst=null;
        table.setModel(DbUtils.resultSetToTableModel(rs));
        
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
        st=cn.createStatement();
        String sql1="Select * from customerbill_cart where bill_id='"+cust_id+"'";
        ResultSet rs1 =st.executeQuery(sql1);
         while(rs1.next())
        	 {
        	 	totalamt = totalamt + Double.parseDouble(rs1.getString("total")) ;
        	 }
         
         total_amount.setText(String.valueOf(totalamt));
		}
		catch(Exception ex)
		{
			 JOptionPane.showMessageDialog(null, ex.toString());
		}
	}
	 

	/**
	 * Create the frame.
	 */
	public CustomerBill1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(104, 176, 1228, 516);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 28, 81, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bill Id");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 82, 95, 27);
		panel.add(lblNewLabel_2);
		
		bill_id = new JTextField();
		bill_id.setBounds(196, 82, 137, 25);
		panel.add(bill_id);
		bill_id.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Customer Id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 145, 119, 20);
		panel.add(lblNewLabel_3);
		
		cust_id = new JTextField();
		cust_id.setBounds(196, 138, 137, 27);
		panel.add(cust_id);
		cust_id.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Customer Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 203, 135, 27);
		panel.add(lblNewLabel_4);
		
		cust_name = new JTextField();
		cust_name.setBounds(196, 204, 137, 27);
		panel.add(cust_name);
		cust_name.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Customer Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(10, 262, 156, 27);
		panel.add(lblNewLabel_5);
		
		cust_add = new JTextField();
		cust_add.setBounds(196, 262, 137, 27);
		panel.add(cust_add);
		cust_add.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Contact Number");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(10, 320, 156, 26);
		panel.add(lblNewLabel_6);
		
		cno = new JTextField();
		cno.setBounds(203, 319, 130, 27);
		panel.add(cno);
		cno.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Product Id");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(434, 28, 125, 27);
		panel.add(lblNewLabel_7);
		
		pid = new JTextField();
		pid.setBounds(642, 33, 130, 27);
		panel.add(pid);
		pid.setColumns(10);
		
		NEW = new JButton("New");
		NEW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try
			        {  
			        date.setDate(null);
			        bill_id.setText("");
			        cust_id.setText("");
			        cust_name.setText("");
			        cust_add.setText("");
			        cno.setText("");
			        pid.setText("");
			        pname.setText("");
			        pprice.setText("");
			        quantity.setText("");
			        dcharges.setText("");
			        discount.setText("");
			        pm.setSelectedItem("");
			        tbill.setText("");
			        fetch("");
			        auto_id();
			        }
			        catch (Exception ex)
			        {
			            JOptionPane.showMessageDialog(null, ex.toString());
			        }
			}
		});
		NEW.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		NEW.setBounds(28, 478, 81, 27);
		panel.add(NEW);
		
		JLabel lblNewLabel_8 = new JLabel("Product Name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(434, 82, 135, 27);
		panel.add(lblNewLabel_8);
		
		pname = new JTextField();
		pname.setBounds(637, 82, 142, 27);
		panel.add(pname);
		pname.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Product Price");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_9.setBounds(434, 139, 119, 33);
		panel.add(lblNewLabel_9);
		
		pprice = new JTextField();
		pprice.setBounds(637, 135, 142, 25);
		panel.add(pprice);
		pprice.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Quantity");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setBounds(434, 204, 119, 25);
		panel.add(lblNewLabel_10);
		
		quantity = new JTextField();
		quantity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				double qty = Double.parseDouble(quantity.getText());
				double price = Double.parseDouble(pprice.getText());
				
				dcharges.setText(String.valueOf(qty*price));
				
			}
		});
		quantity.setBounds(637, 200, 142, 30);
		panel.add(quantity);
		quantity.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("total");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11.setBounds(434, 262, 142, 27);
		panel.add(lblNewLabel_11);
		
		dcharges = new JTextField();
		dcharges.setBounds(637, 262, 142, 27);
		panel.add(dcharges);
		dcharges.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Discount");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_12.setBounds(434, 373, 135, 27);
		panel.add(lblNewLabel_12);
		
		discount = new JTextField();
		discount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				 Double total_bill=0.0;
			      
			       Double toal1=Double.parseDouble(total_amount.getText());
			       Double Discount=Double.parseDouble(discount.getText());
			       
			       total_bill= (toal1 * Discount)/100;
			       tbill.setText(String.valueOf(toal1-total_bill));
			}
		});
		discount.setBounds(630, 375, 142, 27);
		panel.add(discount);
		discount.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Payment Mode");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_13.setBounds(59, 424, 156, 27);
		panel.add(lblNewLabel_13);
		
		tbill = new JTextField();
		tbill.setBounds(630, 427, 142, 25);
		panel.add(tbill);
		tbill.setColumns(10);
		
		pm = new JComboBox();
		pm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pm.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Online"}));
		pm.setBounds(265, 427, 142, 23);
		panel.add(pm);
		
		SAVE = new JButton("Save");
		SAVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SimpleDateFormat dates= new SimpleDateFormat("yyy-MM-dd");
			        String date1=dates.format(date.getDate());
			        String insert = db.Insert("insert into CustomerBill(bill_id,customer_id,customer_name,customer_address,contact,date,product_id,product_name,product_price,quantity,discount,payment_mode,bill,total)values('"+bill_id.getText().toString()+"','"+cust_id.getText().toString()+"','"+cust_name.getText().toString()+"','"+cust_add.getText().toString()+"','"+cno.getText().toString()+"','"+date1+"','"+pid.getText().toString()+"','"+pname.getText().toString()+"','"+pprice.getText().toString()+"','"+quantity.getText().toString()+"','"+discount.getText().toString()+"','"+pm.getSelectedItem().toString()+"','"+tbill.getText().toString()+"','"+total_amount.getText().toString()+"')");
			        JOptionPane.showMessageDialog(null, insert);
			        auto_id();
			}
		});
		SAVE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		SAVE.setBounds(217, 478, 89, 27);
		panel.add(SAVE);
		
		DELETE = new JButton("Delete");
		DELETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String delete=db.delete("delete from CustomerBill where bill_id ='"+bill_id.getText().toString()+"' ");
			        JOptionPane.showMessageDialog(null,delete);
			}
		});
		DELETE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		DELETE.setBounds(373, 478, 89, 27);
		panel.add(DELETE);
		
		UPDATE = new JButton("Update");
		UPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SimpleDateFormat dates= new SimpleDateFormat("yyy-MM-dd");
			        String date1=dates.format(date.getDate());
			        String update =db.update("update CustomerBill set customer_id ='"+cust_id.getText().toString()+"',customer_name ='"+cust_name.getText().toString()+"', customer_address ='"+cust_add.getText().toString()+"',contact ='"+cno.getText().toString()+"',date ='"+date1+"', product_id ='"+pid.getText().toString()+"',product_name ='"+pname.getText().toString()+"',product_price ='"+pprice.getText().toString()+"', quantity ='"+quantity.getText().toString()+"',delivery_charges ='"+dcharges.getText().toString()+"',discount ='"+discount.getText().toString()+"', payment_mode ='"+pm.getSelectedItem().toString()+"', bill ='"+tbill.getText().toString()+"' where  bill_id ='"+bill_id.getText().toString()+"'");
			         JOptionPane.showMessageDialog(null,update);  
			}
		});
		UPDATE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		UPDATE.setBounds(526, 478, 89, 27);
		panel.add(UPDATE);
		
		EXIT = new JButton("Exit");
		EXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 homepage obj = new homepage();
			        obj.setVisible(true);
			      //  this.hide();
			}
		});
		EXIT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		EXIT.setBounds(683, 478, 89, 25);
		panel.add(EXIT);
		
		JLabel lblNewLabel_14 = new JLabel("Total Bill");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_14.setBounds(487, 424, 130, 27);
		panel.add(lblNewLabel_14);
		
		date = new JDateChooser();
		date.setBounds(199, 28, 134, 27);
		panel.add(date);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(789, 32, 429, 206);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			        String insert = db.Insert("insert into customerbill_cart(bill_id,customer_id,customer_name,product_id,product_name,product_price,quantity,total)values('"+bill_id.getText().toString()+"','"+cust_id.getText().toString()+"','"+cust_name.getText().toString()+"','"+pid.getText().toString()+"','"+pname.getText().toString()+"','"+pprice.getText().toString()+"','"+quantity.getText().toString()+"','"+dcharges.getText().toString()+"')");
			        JOptionPane.showMessageDialog(null, insert);
			        fetch(bill_id.getText().toString());
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAdd.setBounds(802, 262, 89, 27);
		panel.add(btnAdd);
		
		total_amount = new JTextField();
		total_amount.setColumns(10);
		total_amount.setBounds(637, 319, 142, 27);
		panel.add(total_amount);
		
		JLabel lblNewLabel_11_1 = new JLabel("total Amount");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11_1.setBounds(434, 320, 142, 27);
		panel.add(lblNewLabel_11_1);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Connection cn=null;

			        
			        try
			        {

			            String Id = bill_id.getText();

			            Class.forName("com.mysql.jdbc.Driver");
			            System.out.println("Driver Registered");
			            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
			            System.out.println("Connection Success");
			            String path="C:\\Furniture_Shop_Management\\Report\\report1.jrxml";
			            Map parameters = new HashMap();

			            parameters.put("id",Id);

			            JasperDesign design = JRXmlLoader.load(path);
			            //JasperReport report = JasperCompileManager.compileReport(design);
			            JasperReport jr=JasperCompileManager.compileReport(design);

			            JasperPrint jp=JasperFillManager.fillReport(jr, parameters, cn);
			            JasperViewer jv=new JasperViewer(jp);
			           JasperViewer.viewReport(jp,false);
			        }catch(Exception ex)
			        {
			            System.out.println(ex);
			        }
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnPrint.setBounds(812, 478, 89, 25);
		panel.add(btnPrint);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(355, 101, 572, 64);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(151, 11, 257, 51);
		panel_1.add(lblNewLabel);
		
		SEARCH = new JButton("Search");
		SEARCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try
			        {
			            Class.forName("com.mysql.jdbc.Driver");
			            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
			            st=cn.createStatement();
			            String sql="Select * from customerbill where  bill_id='"+bill_id.getText().toString()+"'";
			            ResultSet rs=st.executeQuery(sql);
			            while (rs.next())
			            {    
			         //  jDateChooser1.setDate(rs.getDate("bill_id"));   
			                
			             cust_id.setText(rs.getString("customer_id"));    
			             cust_name.setText(rs.getString("customer_name"));   
			             cust_add.setText(rs.getString("customer_address"));
			             cno.setText(rs.getString("contact"));
			             //date.setDate(rs.getDate("date"));
			             pid.setText(rs.getString("product_id"));
			             pname.setText(rs.getString("product_name"));
			             pprice.setText(rs.getString("product_price"));
			             quantity.setText(rs.getString("quantity")); 
			             discount.setText(rs.getString("discount"));
			             pm.setSelectedItem(rs.getString("payment_mode"));
			             tbill.setText(rs.getString("bill"));
			            } 
			            
			            fetch(bill_id.getText().toString());
			        }
			            catch(Exception ex)
			            {
			            	
			            	JOptionPane.showMessageDialog(null, ex.toString());
			            }
			            
			            
			}
		});
		SEARCH.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		SEARCH.setBounds(955, 130, 106, 25);
		contentPane.add(SEARCH);
		
		lblNewLabel_15 = new JLabel("                                      BALAJI FURNITURE ");
		lblNewLabel_15.setBackground(new Color(255, 0, 128));
		lblNewLabel_15.setForeground(new Color(255, 0, 128));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_15.setBounds(247, 29, 661, 48);
		contentPane.add(lblNewLabel_15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(382, 29, 500, 48);
		contentPane.add(panel_2);
		
		auto_id();
		
	}
}
