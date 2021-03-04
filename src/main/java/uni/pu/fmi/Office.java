package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Office {

    private String officeId;
    private String officeName;
    private String country;
    private String address;
    private String contact;
    public Set<Car> cars;
    public Set<Reservation> resevations;
    public Set<Customer> customers;
    public Set<Driver> drivers;

    /**
     * Default constructor
     */
    public Office() {
    }


    /**
     * @return
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * @param officeName 
     * @return
     */
    public void setOfficeName(String officeName) {
       this.officeName = officeName;
    }

    /**
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country 
     * @return
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address 
     * @return
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact 
     * @return
     */
    public void setContact(String contact) {
        this.contact = contact;
    }


	/**
	 * @return the officeId
	 */
	public String getOfficeId() {
		return officeId;
	}

}