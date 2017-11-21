package firstAndReservedTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Team {
	private List<Person> firstTeam = new ArrayList<Person>();
	private List<Person> reservedTeam = new ArrayList<Person>();
	
	
	public void addPlayer(Person person) {
		if( person.getAge() < 40)
			this.firstTeam.add(person);
		else
			this.reservedTeam.add(person);
	}
	
	List<Person> getFirstTeam(){
		return Collections.unmodifiableList(this.firstTeam);
	}
	
	List<Person> getLastTeam(){
		return Collections.unmodifiableList(this.reservedTeam);
	}
}
