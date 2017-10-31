package Lab;

public class Pair<T> {
	private T first, second;

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public static <T> Pair<T> of(T first, T second) {
		return new Pair<T>(first, second);
	}
}
