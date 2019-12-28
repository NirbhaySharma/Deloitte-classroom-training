package firstJavaProject;

public class StudentResult {
	private int regno;
	private int sub1;
	private int sub2;
	private int sub3;
	
	StudentResult(int regno,int sub1,int sub2,int sub3){
		this.regno=regno;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public int getTotal() {
		return (sub1+sub2+sub3);
	}
	public int getAvrage() {
		if(sub1<40||sub2<40||sub3<40)
			return 0;
		return ((sub1+sub2+sub3)/3);
		
	}
	public int getRegno() {
		return regno;
	}

}
