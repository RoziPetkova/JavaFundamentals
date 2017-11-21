package p03ManKind;

public class Student extends Human {
	private String facNumber;

	Student(String fName, String lName, String facNumber) {
		super(fName, lName);
		this.setFacNumber(facNumber);
	}

	private void setFacNumber(String facNumber) {
		if (facNumber.length() < 5 || facNumber.length() > 10)
			throw new IllegalArgumentException("Invalid faculty number!");
		this.facNumber = facNumber;
	}

	public String getFacNumber() {
		return facNumber;
	}
	
}
