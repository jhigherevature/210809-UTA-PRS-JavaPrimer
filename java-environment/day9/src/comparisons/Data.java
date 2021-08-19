package comparisons;

public class Data implements Comparable<Data> {
	private int id;
	private double amount;
	
	@Override
	public int compareTo(Data o) {
		if (this.id < o.getId()) {
			return 1;
		} else if (this.id > o.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Data(int id, double amount) {
		this.id = id;
		this.amount = amount;
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
		return "Data [id=" + id + ", amount=" + amount + "]";
	}
}
