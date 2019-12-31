package secondjavasession;

public class LambdaMain {

	public static void main(String[] args) {
		LambdaExample lbex=(x,y)->{
// 			lambda expression will work only in case we have one abstract method in interface 
//			else we will have to implement the interface and work with it 
			System.out.println("we are inside add");
		};
		lbex.add(13,15);
		lbex.display();
	}

}
