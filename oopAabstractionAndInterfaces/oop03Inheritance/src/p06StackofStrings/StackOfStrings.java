package p06StackofStrings;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class StackOfStrings extends ArrayList<Object> {
	private ArrayList<String> data;

	public void push(String item) {
		data.add(item);
	}

	public String pop() {
		if (data.size() > 0) {
			String str = data.get(data.size() - 1);
			data.remove(data.get(data.size() - 1));
			return str;
		}
		return null;
	}

	public String peek() {
		return data.get(data.size() - 1);
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}
}
