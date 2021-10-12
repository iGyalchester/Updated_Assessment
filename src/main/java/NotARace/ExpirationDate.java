package NotARace;

public class ExpirationDate{
	private String month;
	private String day;
	private String year;

	public String getMonth() {
		return month;
	}

	public ExpirationDate(String month, String day, String year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}


	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return 	this.getMonth() + " " +
				this.getDay()+ " " +
				this.getYear();
	}
}
