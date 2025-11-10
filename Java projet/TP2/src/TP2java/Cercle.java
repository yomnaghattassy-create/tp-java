package TP2java;

public class Cercle {
	final double pi = 3.14;
	double r;

	public Cercle(double a) {
		this.r = a;
		}

	public double calculerSurface() {
		return 2 * pi * r;
		}

	public Cercle() {
		
	}

}
