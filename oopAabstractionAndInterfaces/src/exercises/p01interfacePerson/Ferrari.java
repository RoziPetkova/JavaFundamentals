package exercises.p01interfacePerson;

public class Ferrari implements Car{
	
	
	private String ID ="488-Spider";
	private String driver;
//	private Integer age;

	public Ferrari(String name) {
		this.driver = name;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s/%s/%s/%s", ID, Car.BREAKS, Car.PUSH_THE_GAS_PEDAL, driver) ;
	}
}
