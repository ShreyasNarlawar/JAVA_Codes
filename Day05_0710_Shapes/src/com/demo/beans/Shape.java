package com.demo.beans;

public abstract class Shape {
	
	private String color;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	abstract public float calc_Area();
	abstract public float calc_Perimeter();
}
