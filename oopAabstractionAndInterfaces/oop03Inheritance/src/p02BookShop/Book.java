package p02BookShop;

public class Book {
	private String title;
	private String author;
	private Double price;

	public Book(String author, String title, double price) {
		this.setAuthor(author);
		this.setTitle(title);
		this.setPrice(price);
	}

	public String getAuthor() {
		return this.author;
	}

	private void setAuthor(String author) {
		// TODO: Validate as it is written in Constraints
		this.author = author;
	}

	public String getTitle() {
		return this.title;
	}

	void setTitle(String title) {
		if (title.length() < 3)
			throw new IllegalArgumentException("Title not valid!");
		this.title = title;
	}

	public double getPrice() {
		return this.price;
	}

	private void setPrice(double price) {
		if (price < 1)
			throw new IllegalArgumentException("Price not valid!");
		this.price = price;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator()).append("Title: ").append(this.getTitle())
				.append(System.lineSeparator()).append("Author: ").append(this.getAuthor()).append(System.lineSeparator()).append("Price: ")
				.append(this.getPrice()).append(System.lineSeparator());
		return sb.toString();

	}
}