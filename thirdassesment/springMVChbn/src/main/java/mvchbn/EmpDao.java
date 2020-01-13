package mvchbn;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	@Autowired
	SessionFactory sessionfactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionfactory = sessionFactory;
	}
	
	public void addEmp(Emp emp){
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
	}
	
	public List<Emp> getEmps(){
		Session session = sessionfactory.openSession();
		@SuppressWarnings("unchecked")
		List<Emp> empList = session.createQuery("from Emp").list();
		return empList;
	}
	
	public Emp getEmp(int empno){
		Session session = sessionfactory.openSession();
		Emp emp = (Emp) session.get(Emp.class, empno);
		return emp;
	}
	
	public void updateEmp(Emp emp){
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(emp);
		tx.commit();
		session.close();
	}
	
	public void deleteEmp(Emp emp){
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(emp);
		tx.commit();
		session.close();
	}
}
