package collectionexamples;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception{
	public AccountNotFoundException() {
		super("Account not valid");
	}
}
