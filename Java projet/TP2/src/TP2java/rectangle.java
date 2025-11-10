package TP2java;

public class rectangle {
	public double longueur;
    public double largeur;
    public rectangle(double l, double la) {
    	this.longueur = l;
        this.largeur = la;
        }

    public double calculerSurface() {
    	return longueur * largeur;
    	}
    public rectangle() {
    }
}


