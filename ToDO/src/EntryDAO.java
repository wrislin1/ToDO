import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EntryDAO {
	List<Entries> entries;
	
	public EntryDAO() {
		Configuration con = new Configuration().configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		entries = session.createQuery("From Entries").list();
		tx.commit();
		session.close();
		
	}
	 
	public void addEntry(String s) {
		Configuration con = new Configuration().configure();
		SessionFactory factory = con.buildSessionFactory();
		Entries entry = new Entries();
		entry.setEntry(s);
		entry.setDate();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(entry);
		entries = session.createQuery("From Entries").list();
		tx.commit();
		session.close();
	}
	// delete entry from database
	public void deleteEntry(List<Integer> del) {
		Entries entry;
		 Configuration con = new Configuration().configure();
		 SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//List<Entries> e = session.createQuery("From Entries").list();
		for(int n: del) {
			entry = (Entries)session.get(Entries.class,n );
			session.delete(entry);			
		}

		entries = session.createQuery("From Entries").list();
		tx.commit();
		session.close();
	}
	// list entries
	/* public List<Entries> listEntries() {
		Configuration con = new Configuration().configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Entries> entries = session.createQuery("From Entries").list();
		tx.commit();
		session.close();
		return entries;
	} */

}

