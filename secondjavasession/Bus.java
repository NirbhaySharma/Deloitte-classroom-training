package secondjavasession;

public class Bus implements Vehicle {

	public static void main(String[] args) {
		Vehicle veh= new Bus();
		veh.wheels();
		veh.engines();
	}

	@Override
	public void wheels() {
		System.out.println("Number of wheels in bus are 6");
	}

	@Override
	public void engines() {
		System.out.println("Bus will have only one engin");
	}

}
