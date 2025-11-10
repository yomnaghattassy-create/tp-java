package Compte;

import java.util.Scanner;

public class TestCompte {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Entrez le solde initial du premier compte : ");
		double solde1 = input.nextDouble();
		Compte c1 = new Compte(solde1);

		System.out.print("Entrez le solde initial du deuxième compte : ");
		double solde2 = input.nextDouble();
		Compte c2 = new Compte(solde2);

		c1.afficher();
		c2.afficher();

		System.out.print("Entrez le montant à déposer dans le premier compte : ");
		double montantDepot = input.nextDouble();
		c1.deposer(montantDepot);
		c1.afficher();

		System.out.print("Entrez le montant à retirer du premier compte : ");
		double montantRetrait = input.nextDouble();
		c1.retirer(montantRetrait);
		c1.afficher();

		System.out.print("Entrez le montant à verser du premier compte vers le deuxième : ");
		double montantVirement = input.nextDouble();
		c1.verserVers(c2, montantVirement);

		System.out.println("\n Après versement: ");
		c1.afficher();
		c2.afficher();
		input.close();
		}
	}