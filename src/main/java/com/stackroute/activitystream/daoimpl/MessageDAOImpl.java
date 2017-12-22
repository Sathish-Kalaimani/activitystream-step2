package com.stackroute.activitystream.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.activitystream.dao.MessageDAO;
import com.stackroute.activitystream.model.Message;

/*
 * This class is implementing the MessageDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus 
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */

@Repository("messageDao")
@Transactional
public class MessageDAOImpl implements MessageDAO {
	
	private static int pageSize = 8;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public MessageDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	

	
	

	/*
	 * retrieve all existing messages sorted by posted Date in descending order(showing latest
	 * message first)
	 */
	
	public List<Message> getMessages() {
		Query query = getCurrentSession().createQuery("from Message order by postedDate desc");
		return query.list();
	}


	/*
	 * Save the message in the database in message table 
	 */
	
	/*public boolean sendMessage(Message message) {
		message.setPostedDate();
		getCurrentSession().save(message);
		return true;
	}*/
	
	public boolean sendMessage(Message message) {
        try {
            message.setPostedDate();
            getCurrentSession().save(message);
            return true;
        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

    }
	
	/*
	 * Remove the message from the database in message table. Please note that this
	 * method is not required for implementing the functionality but is required for passing
	 * the test cases
	 */

	@Override
	public boolean removeMessage(Message message) {
		getCurrentSession().delete(message);
		getCurrentSession().flush();
		return true;
	}

	

}
