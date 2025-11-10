package geometry;

public class point {
private double abscisse;
private double ordonnee;


public point(double abscisse, double ordonnee) {
	this.abscisse = abscisse;

this.ordonnee = ordonnee;
}


public double getAbscisse() {
return abscisse;
}

public double getOrdonnee() {
return ordonnee;
}


public void setAbscisse(double abscisse) {
this.abscisse = abscisse;
}

public void setOrdonnee(double ordonnee) {
this.ordonnee = ordonnee;
}

public void afficher() {
	System.out.println("Point (" + abscisse + ", " + ordonnee + ")");
}
}