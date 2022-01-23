package ecommerce.model;


public class OrderDetail {
    private String product_id;
    private String product_name;
    private int product_price;
    private int product_quantity;
    private String image_path;
    
    
    public String getproduct_id() {
		return product_id;
	}
	public void setproduct_id(String product_id) {
		this.product_id = product_id;
	}
	
	public String getproduct_name() {
		return product_name;
	}
	public void setproduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	public int getproduct_price() {
		return product_price;
	}
	public void setproduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getproduct_quantity() {
		return product_quantity;
	}
	public void setproduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	
	public String getimage_path() {
		return image_path;
	}
	public void setimage_path(String image_path) {
		this.image_path = image_path;
	}
}
