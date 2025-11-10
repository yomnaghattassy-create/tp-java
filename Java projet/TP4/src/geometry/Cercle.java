package geometry;

public class Cercle {
private point centre;
private double rayon;


public Cercle(point centre, double rayon) {
	this.centre = centre;
	this.rayon = rayon;
	}

public double perimetre() {
	return 2 * Math.PI * rayon;
	}

public double surface() {
	return Math.PI * rayon * rayon;
	}

public void afficher() {
	System.out.println("Centre du cercle : ");
	centre.afficher();
	System.out.println("Rayon : " + rayon);
	System.out.println("Périmètre : " + perimetre());
	System.out.println("Surface : " + surface());
	}
}