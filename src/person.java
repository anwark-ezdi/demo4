
public class person {
	private String firstname;
	private String lastname;
	double hourrate;
	
	public person()
	{
		this.firstname="ayush";
		this.lastname="verma";
		this.hourrate=10;
	}
	
	public person(String firstname,String lastname,double hourrate)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.hourrate=hourrate;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the hourrate
	 */
	public double getHourrate() {
		return hourrate;
	}

	/**
	 * @param hourrate the hourrate to set
	 */
	public void setHourrate(double hourrate) {
		this.hourrate = hourrate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "person [firstname=" + firstname + ", lastname=" + lastname
				+ ", hourrate=" + hourrate + "]";
	}
	public double getPayment(int hours)
	{
		return hours;
	}
	
	
	
}