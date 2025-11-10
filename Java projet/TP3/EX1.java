
package TP3;
import java.util.Scanner;

public class EX1 {
	public static void main(String[] args) {
		int[] tab = new int[5];
		Scanner sc = new Scanner(System.in);


		for (int i = 0; i < 5; i++) {
			System.out.print("Entrez la valeur de la case " + (i + 1) + " : ");
			tab[i] = sc.nextInt();
			}
		for (int i = 0; i < 5; i++) {
			System.out.print(tab[i] + " ");
			}


		for (int i = 0; i < 51; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (tab[i] > tab[j]) {
					int aux = tab[i];
					tab[i] = tab[j];
					tab[j] = aux;
					}
				}
			}

		System.out.println("\nTableau apr s tri croissant :");
		for (int i = 0; i < 5; i++) {
			System.out.print(tab[i] + " ");
			}


	}
	}