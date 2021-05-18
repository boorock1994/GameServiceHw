package Entities;



public class Campaign {

	private int id;
	private String name;
	private double discountRate;
	private String startDate;
	private String endDate;

	public Campaign() {
	}

	public Campaign(int id, String name, double discountRate, String startDate, String endDate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
