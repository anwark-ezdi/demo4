
public class payment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.setFirstname("ram");
		p.setLastname("lakhan");
		p.setHourrate(40);
		System.out.println(p.toString());
		System.out.println(p.getPayment(40));

	}

}
