package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private double radios;

	public Circle() {
		super();
	}

	public Circle(Color color, double radios) {
		super(color);
		this.radios = radios;
	}

	public double getRadios() {
		return radios;
	}

	public void setRadios(double radios) {
		this.radios = radios;
	}

	@Override
	public double area() {
		return Math.PI * radios * radios;
	}

}
