package com.demo.beans;

public class Circle extends Shape {
	private float radius;
	final float pi = 3.142f;
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String c,float radius) {
		super(c);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}

	@Override
	public float calc_Area() {
		// TODO Auto-generated method stub
		return pi *radius *radius;
	}

	@Override
	public float calc_Perimeter() {
		// TODO Auto-generated method stub
		return 2 *pi *radius;
	}
	
	

}
