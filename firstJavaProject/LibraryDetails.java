package firstJavaProject;

public class LibraryDetails extends Student {
	 protected int booksDue;
	
	
	
	public LibraryDetails(int regno, String name, String group, int booksDue) {
		super(regno, name, group);
		this.booksDue = booksDue;
	}
	

}
