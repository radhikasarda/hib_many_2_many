package hib_many_2_many_eg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main_Hib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Products pr=new Products();
		pr.setPr_id(101);
		pr.setPr_name("Mango");
		pr.setPr_type("Fruit");
		

		Customer cu=new Customer();
		cu.setCu_id(1);
		cu.setCu_name("Radhika");
		cu.setCu_add("Surat");
		cu.getProducts().add(pr);
		pr.getCustomer().add(cu);
		
		
    	Configuration con=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Products.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	session.save(cu);
    	session.save(pr);
  
    	session.getTransaction().commit();
	}

}
