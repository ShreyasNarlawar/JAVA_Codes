package com.demo.enums;

public enum Coffee {
	
	less(150,150),more(200,200),extra(300,300);
	
	private int size;
	private float price;
	
	private Coffee(int size, float price) {
		this.size = size;
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
