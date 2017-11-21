package p03ManKind;

public class Worker extends Human {
	private double weekSalary;

	Worker(String fName, String lName, String weekSalary, String workingHours) {
		super(fName, lName);
		this.setWeekSalary(Double.valueOf(weekSalary));
		this.setWorkingHours(Double.valueOf(workingHours));
	}

	private double workingHours;

	public double getWeekSalary() {
		return this.weekSalary;
	}

	public double getworkingHours() {
		return this.workingHours;
	}

	private void setWeekSalary(double weekSalary) {
		if (weekSalary < 10)
			throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
		this.weekSalary = weekSalary;
	}

	private void setWorkingHours(double hours) {
		if (hours < 1 || hours > 12)
			throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
		this.workingHours = hours;
	}

	public double getSalaryPerHour() {
		return this.weekSalary / (this.workingHours * 7);
	}
}
