package p06Animals;

public class Kitten extends Cat{

	Kitten(String name, String age, String gender) {
		super(name, age, gender);
	}
	
	@Override
	public void setGender(String gender) {
		if(!gender.equals("Female"))
			throw new IllegalArgumentException("Invalid input!");
		super.setGender(gender);
	};
	
	@Override
	public String produceSound(){
		return "Miau";
	}
}
