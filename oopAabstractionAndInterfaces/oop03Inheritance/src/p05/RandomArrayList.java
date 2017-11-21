package p05;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Random rnd = new Random();
	
	public Object getRandomElement() {
		int index = rnd.nextInt(super.size() - 1);
		Object element = super.get(index);
		super.set(index, super.remove(super.size()-1));
		return element;
		
	}
}
