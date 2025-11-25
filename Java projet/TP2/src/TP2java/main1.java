package TP2java;

import java.util.Scanner;
public class main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double maxSalaire =0;
		String test ;
		do {
			System.out.println("nom");
			String nom =sc.nextLine();
			System.out.println("prenom");
			String prenom =sc.nextLine();
			System.out.println("age");
			int age =sc.nextInt();
			System.out.println("salaire");
			float salaire =sc.nextFloat();
            sc.nextLine(); 
            

            employe emp = new employe(nom, prenom, age, salaire);
            
           
            if (emp.salaire > maxSalaire) {
                maxSalaire = emp.salaire;
            }
            
            System.out.print("Voulez-vous ajouter un autre employ  ? (o/n) : ");
            test = sc.nextLine();
            
        } while (test.equalsIgnoreCase("o"));
        
        System.out.println("\nLe salaire le plus grand est : " + maxSalaire + " DT");

		
	

	}

}