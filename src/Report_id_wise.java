import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Report_id_wise extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField date1;
	private JTextField date2;
	private JTextField id_1;
	private JButton btnNewButton_2;
	private JTextField id_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report_id_wise frame = new Report_id_wise();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Report_id_wise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1370,900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		id = new JTextField();
		id.setBounds(34, 74, 125, 30);
		contentPane.add(id);
		id.setColumns(10);
		
		date1 = new JTextField();
		date1.setBounds(51, 296, 109, 30);
		contentPane.add(date1);
		date1.setColumns(10);
		
		date2 = new JTextField();
		date2.setBounds(212, 296, 109, 30);
		contentPane.add(date2);
		date2.setColumns(10);
		
		JButton btnNewButton = new JButton("Customer Bill");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				


		        
		        Connection cn=null;

				        
				        try
				        {

				            String Id = id.getText();

				            Class.forName("com.mysql.jdbc.Driver");
				            System.out.println("Driver Registered");
				            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
				            System.out.println("Connection Success");
				            String path="C:\\Furniture_Shop_Management\\Id wise Report\\cus_bill.jrxml";
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
		btnNewButton.setBounds(189, 74, 133, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Order Detail");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


		        
		        Connection cn=null;

				        
				        try
				        {

				            String Date1 = date1.getText();
				            String Date2 = date2.getText();

				            Class.forName("com.mysql.jdbc.Driver");
				            System.out.println("Driver Registered");
				            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
				            System.out.println("Connection Success");
				            String path="C:\\Furniture_Shop_Management\\Id wise Report\\datewise_order_detail.jrxml";
				            Map parameters = new HashMap();

				            parameters.put("date1",Date1);
				            parameters.put("date2",Date2);

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
		btnNewButton_1.setBounds(372, 294, 127, 30);
		contentPane.add(btnNewButton_1);
		
		id_1 = new JTextField();
		id_1.setBounds(34, 128, 125, 30);
		contentPane.add(id_1);
		id_1.setColumns(10);
		
		btnNewButton_2 = new JButton("Purchase Bill");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Connection cn=null;

			        
			        try
			        {

			            String Id_1 = id_1.getText();

			            Class.forName("com.mysql.jdbc.Driver");
			            System.out.println("Driver Registered");
			            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
			            System.out.println("Connection Success");
			            String path="C:\\Furniture_Shop_Management\\Id wise Report\\Purchase Bill.jrxml";
			            Map parameters = new HashMap();

			            parameters.put("id",Id_1);

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
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(191, 125, 131, 30);
		contentPane.add(btnNewButton_2);
		
		id_2 = new JTextField();
		id_2.setBounds(31, 175, 128, 30);
		contentPane.add(id_2);
		id_2.setColumns(10);
		
		btnNewButton_3 = new JButton("Supplier Bill");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 Connection cn=null;

			        
			        try
			        {

			            String Id_2 = id_2.getText();

			            Class.forName("com.mysql.jdbc.Driver");
			            System.out.println("Driver Registered");
			            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture_Shop_Management","root","root");
			            System.out.println("Connection Success");
			            String path="C:\\Furniture_Shop_Management\\Id wise Report\\Supplier_Bill.jrxml";
			            Map parameters = new HashMap();

			            parameters.put("id",Id_2);

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
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(189, 175, 131, 26);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("ID wise Report ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(34, 25, 163, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date wise Report ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(51, 248, 180, 20);
		contentPane.add(lblNewLabel_1);
	}
}
