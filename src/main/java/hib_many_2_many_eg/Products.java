package hib_many_2_many_eg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Products {

	@Id
	private int pr_id;
	private String pr_name;
	private String pr_type;
	
	@ManyToMany(mappedBy="products")
	private List<Customer>customer=new ArrayList<>();
	
	
	public Products() {}

	public Products(int pr_id, String pr_name, String pr_type, List<Customer> customer) {
		super();
		this.pr_id = pr_id;
		this.pr_name = pr_name;
		this.pr_type = pr_type;
		this.customer = customer;
	}

	public int getPr_id() {
		return pr_id;
	}

	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}

	public String getPr_name() {
		return pr_name;
	}

	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}

	public String getPr_type() {
		return pr_type;
	}

	public void setPr_type(String pr_type) {
		this.pr_type = pr_type;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Products [pr_id=" + pr_id + ", pr_name=" + pr_name + ", pr_type=" + pr_type + ", customer=" + customer
				+ "]";
	}
	
	
	
}
