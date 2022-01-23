package ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Shipper")

public class Shipper {
	 @Id
	 private String id;
	 private String name;
	 private String phone;	 
	 private String address;
	 private String negative_cert;
	 private String vaccine_cert;
	 private String identify;
	 
	 public String getid() {
		 return id;
	 }
	 public String setid(String id) {
		 return this.id = id;
	 }
	 
	 public String getname() {
		 return name;
	 }
	 public String setname(String name) {
		 return this.name = name;
	 }
	 
	 public String getphone() {
		 return phone;
	 }
	 public String setphone(String phone) {
		 return this.phone = phone;
	 }
	 
	 public String getaddress() {
		 return address;
	 }
	 public String setaddress(String address) {
		 return this.address = address;
	 }
	 
	 public String getnegative_cert() {
		 return negative_cert;
	 }
	 public String setnegative_cert(String negative_cert) {
		 return this.negative_cert = negative_cert;
	 }
	 
	 public String getvaccine_cert() {
		 return vaccine_cert;
	 }
	 public String setvaccine_cert(String vaccine_cert) {
		 return this.vaccine_cert = vaccine_cert;
	 }
	 
	 public String getidentify() {
		 return identify;
	 }
	 public String setidentify(String identify) {
		 return this.identify = identify;
	 }
}
