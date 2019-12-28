package firstJavaProject;

public class CustomerApplication {

	public static void main(String[] args) {
		Customer customer= new Customer();
		customer.setCustomerId(100337);
		customer.setCustomerName("Rajan Kumar");
		customer.setCity("Jammu");
		System.out.println("Customer id is : "+customer.getCustomerId());
		System.out.println("Customer name : "+customer.getCustomerName());
		System.out.println("Customer city : "+customer.getCity());
	}

}
