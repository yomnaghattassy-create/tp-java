package TP2java;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("donner le rayon");

	double x = input.nextDouble();
	cercle c1 = new cercle();
	cercle c2 = new cercle(x);
	cercle c3 = new cercle(c2);
	System.out.println(c1.r);
	System.out.println(c1.calculerSurface());
	System.out.println(c2.r);
	System.out.println(c2.calculerSurface());
	System.out.println("donner le rectangle");

	double a = input.nextDouble();
	double b = input.nextDouble();

	rectangle r1 = new rectangle(a, b);
	rectangle r2 = new rectangle(a,b);
	System.out.println(r2.longueur);
	System.out.println(r1.largeur);
	System.out.println(r2.calculerSurface());
	System.out.println(r1.calculerSurface());
	}
}

