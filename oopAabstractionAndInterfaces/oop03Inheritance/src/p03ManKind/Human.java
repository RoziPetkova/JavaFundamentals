package p03ManKind;

public class Human {
	private String fName;
	private String lName;
	
	
	Human(String fName, String lName) {
		checkNames(fName, "firstName");
		checkNames(lName, "lastName");
		this.fName = fName;
		this.lName = lName;
	}
	
	private static void checkNames(String name, String firstOrLast) {
		if(name.startsWith("[a-z]"))
			throw new IllegalArgumentException(String.format("Expected upper case letter!Argument: %s", firstOrLast));
		if(name.length() < (firstOrLast.equals("firstName")? 4 : 3))
			throw new IllegalArgumentException(String.format("Expected length at least %s symbols!Argument: %s",
								(firstOrLast.equals("firstName")? 4 : 3) , firstOrLast));
				
	}
	
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
}
