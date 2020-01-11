package mvchbn;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	SessionFactory sessionfactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionfactory = sessionFactory;
	}
	public void addCustomer(Customer cust){
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(cust);
		tx.commit();
		session.close();
	}
	public List<Customer> getCustomers(){
		Session session = sessionfactory.openSession();
		@SuppressWarnings("unchecked")
		List<Customer> customerlist = session.createQuery("from Customer").list();
		return customerlist;
	}
	public Customer getCustomer(int code){
		Session session = sessionfactory.openSession();
		Customer cust = (Customer) session.get(Customer.class, code);
		return cust;
	}
	public void updateCustomer(Customer cust){
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(cust);
		tx.commit();
		session.close();
	}
	public void deleteCustomer(Customer cust){
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(cust);
		tx.commit();
		session.close();
	}
}
