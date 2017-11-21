package avatar.main;

import java.util.List;

import avatar.bender.Bender;
import avatar.monuments.Monuments;

public class Nation {
	private List<Bender> benders;
	private List<Monuments> monuments;

	
	Nation(List<Bender> benders, List<Monuments> monuments) {
		this.benders = benders;
		this.monuments = monuments;
	}
	
	public long getNationPower(){
		long bendersPower = this.getBenders()
								.stream()
								.mapToLong(x -> (long) (x.getPower() * x.getProp()))
								.sum();
		
		Long monumentsPower = this.getMonuments()
				.stream()
				.mapToLong(x -> (long) x.getProp())
				.sum();
		
		return  bendersPower + ((bendersPower / 100 ) * monumentsPower);
	}
	
	List<Bender> getBenders() {
		return benders;
	}

	List<Monuments> getMonuments() {
		return monuments;
	}

	void addBender(Bender bender) {
		this.benders.add(bender);
	}

	void setMonuments(Monuments monuments) {
		this.monuments.add(monuments);
	}

	public void removeBenders() {
		this.benders.clear();
	}
	public void removeMonuments() {
		this.monuments.clear();
	}

	public void printMe() {
		System.out.println();
		if(benders.size() <= 0)
			System.out.println("Benders: None");
		else {
			System.out.print("Benders:\n");
			benders.forEach(x -> System.out.print(x.toString()));
		}
		if(monuments.size() <= 0)
			System.out.println("Monuments: None");
		else {
			System.out.print("Monuments:\n");
			monuments.forEach(x -> System.out.print(x.toString()));
		}
	}
}
