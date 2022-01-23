package ecommerce.model;

import java.util.List;

//import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Product")

public class Product {
	
    @Id
    private String id;
    private String Name;
    private int Price;
    private String Category;
    private String ImagePath;
    
    private List<Comments> Comments;
	//private List<Object> Comments;

    
    
    public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	
	public String getname() {
		return Name;
	}
	public void setname(String Name) {
		this.Name = Name;
	}
	
	public int getprice() {
		return Price;
	}
	public void setprice(int Price) {
		this.Price = Price;
	}

	public String getcategory() {
		return Category;
	}
	public void setcategory(String Category) {
		this.Category = Category;
	}
	
	public String getimagepath() {
		return ImagePath;
	}
	public void setimagepath(String ImagePath) {
		this.ImagePath = ImagePath;
	}
	
	public List<Comments> getcomments() {
		return Comments;
	}
	
	
}
