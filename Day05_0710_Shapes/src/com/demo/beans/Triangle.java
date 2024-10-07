package com.demo.beans;

public class Triangle extends Shape{
	private float base,height,side1,side2;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(String c,float base, float height, float side1, float side2) {
		super(c);
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getSide1() {
		return side1;
	}

	public void setSide1(float side1) {
		this.side1 = side1;
	}

	public float getSide2() {
		return side2;
	}

	public void setSide2(float side2) {
		this.side2 = side2;
	}

	@Override
	public String toString() {
		return super.toString()+"Triangle [base=" + base + ", height=" + height + ", side1=" + side1 + ", side2=" + side2 + "]";
	}

	@Override
	public float calc_Area() {
		// TODO Auto-generated method stub
		return (float) (0.5*(base*height));
	}

	@Override
	public float calc_Perimeter() {
		// TODO Auto-generated method stub
		return base+side1+side2;
	}
	
	

}
