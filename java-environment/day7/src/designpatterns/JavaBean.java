package designpatterns;

/*
 * JavaBean is a more formal POJO. Specifically we provide
 * a few more restrictions to the creation of this class
 * in particular:
 * 		Java beans should provide a no-args constructor
 * 		Java beans should declare all fields (variables) private
 * 		Java beans should declare a getter/setter for each field
 * 		Java beans should override the toString, hashcode and equals methods (object class)
 * 		Java beans typically have a parameterized constructor
 * 		Java beans typically will implement the 'Serializable' interface...
 * 			The serializable interface is used when writing data to a file
 */
public class JavaBean {
	private String name;
	private int id;
	private double amount;
	
	public JavaBean() {	}
	
	public JavaBean(String name, int id, double amount) {
		this.name = name;
		this.id = id;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "JavaBean [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBean other = (JavaBean) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setName(String name) {
		this.name = name;
	}
}
