package TP3;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre n : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = i * (i + 1) / 2;
        }

        System.out.println("Contenu du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }

        sc.close();
    }
}


