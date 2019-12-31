package secondjavasession;

public interface LambdaExample {
	default void display(){
		System.out.println("this is a default method");
	}
	void add(int x, int y);
}
