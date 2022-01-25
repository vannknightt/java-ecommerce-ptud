package ecommerce.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Order")

public class Order {
	@Id
    private String id;
    private String shop_id;
    private String customer_id;
    private String shipper_id;
    private String ship_info;
    private int status;
    private int total;
    private int shipper_fee;
    
    private boolean cert_shop;
    private boolean cert_cus;

    private Date created_at;
    private Date updated_at;
    
    private List<OrderDetail> order_detail;
    
    
    
    public String getid() {
		return id;
	}
	public void setorder_id(String id) {
		this.id = id;
	}
	
	public String getshop_id() {
		return shop_id;
	}
	public void setshop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	
	public String getcustomer_id() {
		return customer_id;
	}
	public void setcustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	
	public String getshipper_id() {
		return shipper_id;
	}
	public void setshipper_id(String shipper_id) {
		this.shipper_id = shipper_id;
	}
	
	public String getship_info() {
		return ship_info;
	}
	public void setship_info(String ship_info) {
		this.ship_info = ship_info;
	}
	
	public int gettotal() {
		return total;
	}
	public void settotal(int total) {
		this.total = total;
	}

	
	public int getstatus() {
		return status;
	}
	public void setstatus(int status) {
		this.status = status;
	}

	public int getshipper_fee() {
		return shipper_fee;
	}
	public void setshipper_fee(int shipper_fee) {
		this.shipper_fee = shipper_fee;
	}
	
	public boolean getcert_shop() {
		return cert_shop;
	}
	public void setcert_shop(boolean cert_shop) {
		this.cert_shop = cert_shop;
	}
	
	public boolean getcert_cus() {
		return cert_cus;
	}
	public void setcert_cus(boolean cert_cus) {
		this.cert_cus = cert_cus;
	}
	
	public Date getcreated_at() {
		return created_at;
	}
	public void setcreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	
	public Date getupdated_at() {
		return updated_at;
	}
	public void setupdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	public List<OrderDetail> getorder_detail() {
		return order_detail;
	}
}
