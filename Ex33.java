/*
 * Exercicio 33 (Faccat 53 e 54): Ler um valor N (apenas valores > 0) e imprimir
 * todos os inteiros entre 1 e N.
 */

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um valor para N maior que zero: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
