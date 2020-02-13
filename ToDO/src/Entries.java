import java.sql.Date;

//Entries POJO class

public class Entries {
	private int id;
	private String entry;
	private Date date_entered;
	
	public Entries() {}
	public Entries(String entry) {
		this.entry = entry;
		this.date_entered = new Date(System.currentTimeMillis());
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getEntry() {
		return entry;
	}
	
	public void setEntry(String entry) {
		this.entry=entry;
		
	}
	
	public Date getDate() {
		return date_entered;
	}
	
	public void setDate() {
		this.date_entered = new Date(System.currentTimeMillis());
	}
	
	@Override
	public String toString() {
		return (entry + ", Date: " + date_entered);
	}
	

}
