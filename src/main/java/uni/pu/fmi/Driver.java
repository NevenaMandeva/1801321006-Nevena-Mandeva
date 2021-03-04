package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Driver {
	
    private String driverId;
    private String firstName;
    private String lastName;
    private int age;
    private String contact;
    public Set<Reservation> reservations;
    public Office office;

    /**
     * Default constructor
     */
    public Driver() {
    }
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    /**
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age 
     * @return
     */
    public void setAge(int age) {
        this.age = age;
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
     * @return
     */
    public Office getOffice() {
        return office;
    }

    /**
     * @param office 
     * @return
     */
    public void setOffice(Office office) {
        this.office = office;
    }
	/**
	 * @return the driverId
	 */
	public String getDriverId() {
		return driverId;
	}

    /**
     * @return
     */
   

}