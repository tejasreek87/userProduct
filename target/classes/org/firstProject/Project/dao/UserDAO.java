import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.toplink.ServerSessionFactory;
import org.springframework.orm.toplink.support.TransactionAwareSessionAdapter;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO 
{
	public UserDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created...");
	}
	@Autowired
	private SessionFactory factory;
	 Public void save(UserDTO dto)
	 {
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 session.save(dto);
		 tx.commit();
		 session.close();
		 
	 }

}
