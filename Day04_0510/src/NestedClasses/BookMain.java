package NestedClasses;

public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book.Topic bt = b1.new Topic();
	}
}
