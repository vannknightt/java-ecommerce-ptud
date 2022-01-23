package ecommerce.model;

import org.springframework.data.annotation.Id;

public class Comments {
	@Id
	private String id;
	private String customername;
	private String customeravatar;
	private String customercmt;
	private int customerrating;
	private String date;
	
	
	public Comments(String id, String customername, String customeravatar, 
			String customercmt, int customerrating, String date) {
        super();
        this.id = id;
        this.customername = customername;
        this.customeravatar = customeravatar;
        this.customercmt = customercmt;
        this.customerrating = customerrating;
        this.date = date;
    }
	
	
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	
	public String getcustomername() {
		return customername;
	}
	public void setcustomername(String Name) {
		this.customername = Name;
	}
	
	public String getcustomeravatar() {
		return customeravatar;
	}
	public void setcustomeravatar(String customeravatar) {
		this.customeravatar = customeravatar;
	}

	public String getcustomercmt() {
		return customercmt;
	}
	public void setcustomercmt(String customercmt) {
		this.customercmt = customercmt;
	}
	
	public int getcustomerrating() {
		return customerrating;
	}
	public void setcustomerrating(int customerrating) {
		this.customerrating = customerrating;
	}
	
	public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
}