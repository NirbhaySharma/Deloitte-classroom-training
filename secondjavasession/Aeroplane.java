package secondjavasession;

public class Aeroplane implements Vehicle {

	public static void main(String[] args) {
		Vehicle veh= new Aeroplane();
		veh.wheels();
		veh.engines();
	}

	@Override
	public void wheels() {
		System.out.println("Number of wheels in big aeroplanes are 6");
	}

	@Override
	public void engines() {
		System.out.println("Aeroplane will have only two or three engins");
	}

}
