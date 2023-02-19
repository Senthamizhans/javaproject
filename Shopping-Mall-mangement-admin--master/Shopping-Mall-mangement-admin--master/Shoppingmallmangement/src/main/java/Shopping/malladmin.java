package Shopping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class malladmin {
	private Integer Storeid;
	private String Storename;
	private String Storeowner;
	private String Storeadress;
	private String Storemail;
	public malladmin() {
		super();
	}
	public malladmin(Integer storeid, String storename, String storeowner, String storeadress, String storemail) {
		super();
		Storeid = storeid;
		Storename = storename;
		Storeowner = storeowner;
		Storeadress = storeadress;
		Storemail = storemail;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getStoreid() {
		return Storeid;
	}
	public void setStoreid(Integer storeid) {
		Storeid = storeid;
	}
	public String getStorename() {
		return Storename;
	}
	public void setStorename(String storename) {
		Storename = storename;
	}
	public String getStoreowner() {
		return Storeowner;
	}
	public void setStoreowner(String storeowner) {
		Storeowner = storeowner;
	}
	public String getStoreadress() {
		return Storeadress;
	}
	public void setStoreadress(String storeadress) {
		Storeadress = storeadress;
	}
	public String getStoremail() {
		return Storemail;
	}
	public void setStoremail(String storemail) {
		Storemail = storemail;
	}
	@Override
	public String toString() {
		return "malladmin [Storeid=" + Storeid + ", Storename=" + Storename + ", Storeowner=" + Storeowner
				+ ", Storeadress=" + Storeadress + ", Storemail=" + Storemail + "]";
	}




}
