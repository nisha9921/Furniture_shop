create schema Furniture_Shop_Management;
use Furniture_Shop_Management;

create table CustomerBill
(
 bill_id nvarchar(50),
 customer_id nvarchar(50),
 customer_name nvarchar(50),
 customer_address nvarchar(50),
 contact nvarchar(50),
 date date,
 product_id nvarchar(50),
 product_name nvarchar(50),
 product_price nvarchar(50),
 quantity nvarchar(50),
 delivery_charges nvarchar(50),
 discount nvarchar(50),
 payment_mode nvarchar(50),
 bill nvarchar(50)
 );
 
 create table CustomerDetails
 (
 cust_id nvarchar(50),
 cust_name nvarchar(50),
 cust_address nvarchar(50),
 contact nvarchar(50),
 email_id nvarchar(50),
 date date
 );
 
 create table OrderDetail
 (
 order_id nvarchar(50),
 cust_name nvarchar(50),
 product_id nvarchar(50),
 product_name nvarchar(50),
 quantity  nvarchar(50),
 date date,
 grand_total nvarchar(50),
 total_price  nvarchar(50)
 );
 
 create table ProductDetail
 (
 product_id nvarchar(50),
 product_name nvarchar(50),
 category nvarchar(50),
 price nvarchar(50),
 quantity nvarchar(50),
 totalprice nvarchar(50)
 );
 
 create table SupplierDetails
 (
  supplier_id nvarchar(50),
  supplier_name nvarchar(50),
  supplier_address nvarchar(50),
  contact_no nvarchar(50),
  email_id nvarchar(50),
  supplier_type nvarchar(50),
  delivery_charges nvarchar(50)
 );
 
 create table StockDetail
 (
 item_id nvarchar(50),
 Date date,
 furniture_type nvarchar(50),
 available_stock nvarchar(50),
 company_name nvarchar(50),
 design_name nvarchar(50),
 quantity nvarchar(50),
 size nvarchar(50),
 unit nvarchar(50)
 );
 
 create table ManagerDetail
 (
   manager_name nvarchar(50),
   manager_contact nvarchar(50),
   manager_address nvarchar(50),
   manager_email_id nvarchar(50),
   qualification nvarchar(50)
 );
 
 create table login
 (
   user_name nvarchar(50),
   password nvarchar(50)
 );
 
create table forgotpassword
(
   user_name nvarchar(50),
   password nvarchar(50),
	confirm_password  nvarchar(50)
); 

 create table purchasebill
 (
    purchase_bill_no nvarchar(50),
    supplier_id nvarchar(50),
    supplier_name nvarchar(50),
    supplier_address nvarchar(50),
    customer_number nvarchar(50),
    grand_total nvarchar(50),
    quantity nvarchar(50),
    tax nvarchar(50),
    date date,
    total_amount nvarchar(50),
    discount nvarchar(50),
    gst nvarchar(50),
    pay_bill nvarchar(50)
 );
    
 create table supplierorderbill
 (
    order_id nvarchar(50),
    product_id nvarchar(50),
    product_name nvarchar(50),
    quantity nvarchar(50),
    product_price nvarchar(50),
    total_price nvarchar(50),
    date date
 );
 
 create table customerservice
 (
   date date,
   time nvarchar(50),
   delivery_charges  nvarchar(50),
   delivery_type  nvarchar(50),
   delivery_contact_number   nvarchar(50),
   customer_contact_number  nvarchar(50),
   customer_address   nvarchar(50),
   quantity   nvarchar(50)
);

