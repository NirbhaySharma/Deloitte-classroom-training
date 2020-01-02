package thirdjavaupload;

import java.io.Serializable;

public class Customer  implements Serializable{

	private static final long serialVersionUID = 1L;
	private int custId;
	private String name;
	private double comm;
	
	public Customer() {
		}

	public Customer(int custId, String name, double comm) {
		this.custId = custId;
		this.name = name;
		this.comm = comm;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
	
	
	
}
