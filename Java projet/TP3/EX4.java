package TP3;


	import java.util.Scanner;

	public class EX4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        System.out.print("Entrez le nombre d'eleves : ");
	        int n = sc.nextInt();

	        double[] notes = new double[n];

	        
	        for (int i = 0; i < n; i++) {
	            double note;
	            do {
	                System.out.print("Entrez la note d'eleves " + (i + 1) + " sur 20 : ");
	                note = sc.nextDouble();

	                if (note < 0 || note > 20) {
	                    System.out.println("Erreur : la note doit  etre entre 0 et 20");
	                }

	            } while (note < 0 || note > 20); 
	            notes[i] = note;
	        }

	       
	        double som = 0;
	        double max = notes[0];
	        double min = notes[0];

	        for (int i = 0; i < n; i++) {
	            som += notes[i];
	            if (notes[i] > max) {
	                max = notes[i];
	            }
	            if (notes[i] < min) {
	                min = notes[i];
	            }
	        }

	        double moyenne = som / n;

	        System.out.println("\nR sultats :");
	        System.out.println("Somme des notes : " + som);
	        System.out.println("Note la plus elevee : " + max);
	        System.out.println("Note la plus basse : " + min);
	        System.out.println("Moyenne de la classe : " + moyenne);

	        sc.close();
	    }
	}