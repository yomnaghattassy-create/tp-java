package TP3;
import java.util.Scanner;

public class EX2 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] tab = new int[5];

    for (int i = 0; i <5; i++) {
        System.out.print("Entrez la valeur de la case " + (i + 1) + " : ");
        tab[i] = sc.nextInt();
    }

   
    System.out.print("\nEntrez le nombre   rechercher : ");
    int n = sc.nextInt();

  
    int in = -1; 
    for (int i = 0; i < 5; i++) {
        if (tab[i] == n) {
            in = i; 
        }
    }


    if (in != -1) {
        System.out.println("\nL'entier " + n + " se trouve dans le tableau   l'indice : " + in);
    } else {
        System.out.println("\nL'entier " + n + " n'existe pas dans le tableau.");
    }

}



}
