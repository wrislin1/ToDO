import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EntryDAO {
	public EntryDAO() {
		
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
		tx.commit();
		session.close();
	}
	// delete entry from database
	public void deleteEntry(int i) {
		 Configuration con = new Configuration().configure();
		 SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Entries> e = session.createQuery("From Entries").list();
		Entries entry = (Entries)session.get(Entries.class,e.get(i-1).getId() );
		session.delete(entry);
		tx.commit();
		session.close();
	}
	// list entries
	public void listEntries() {
		 Configuration con = new Configuration().configure();
		 SessionFactory factory = con.buildSessionFactory();
		int n = 1;
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Entries> entry = session.createQuery("From Entries").list();
		for(Entries e:entry)
		{
			System.out.println(n + " " + e);
			n++;
		}

		tx.commit();
		session.close();
		System.out.println();
	}

}

