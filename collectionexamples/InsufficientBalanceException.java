package collectionexamples;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception{
		public InsufficientBalanceException() {
			super("withdrawal amount more than balance");
		}
}
