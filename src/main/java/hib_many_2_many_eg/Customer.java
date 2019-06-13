package hib_many_2_many_eg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	
	
	@Id
	private int cu_id;
	private String cu_name;
	private String cu_add;

	@ManyToMany
	private List<Products> products=new ArrayList<>();


	
	public Customer() {}
	


	public Customer(int cu_id, String cu_name, String cu_add, List<Products> products) {
		super();
		this.cu_id = cu_id;
		this.cu_name = cu_name;
		this.cu_add = cu_add;
		this.products = products;
	}



	public int getCu_id() {
		return cu_id;
	}


	public void setCu_id(int cu_id) {
		this.cu_id = cu_id;
	}


	public String getCu_name() {
		return cu_name;
	}


	public void setCu_name(String cu_name) {
		this.cu_name = cu_name;
	}


	


	public String getCu_add() {
		return cu_add;
	}



	public void setCu_add(String cu_add) {
		this.cu_add = cu_add;
	}



	public List<Products> getProducts() {
		return products;
	}


	public void setProducts(List<Products> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Customer [cu_id=" + cu_id + ", cu_name=" + cu_name + ", cu_add=" + cu_add + ", products=" + products
				+ "]";
	}
	
	
		
		
	
}
