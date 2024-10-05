package NestedClasses;

public class Book {
	private int bkid;
	
	class Topic{
		public void t() {
			System.out.println("In Book's Topic's t Method..");
			t1();
		}
	}
	Topic topic1;
	public void t1(){
		System.out.println("In Book's Topic's t1 Method..");
	}
}
