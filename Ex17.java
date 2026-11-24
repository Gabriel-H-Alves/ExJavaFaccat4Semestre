/*
 * Exercicio 17 (Faccat 20): Ler dois valores (considere que nao serao lidos valores iguais)
 * e escreve-los em ordem crescente.
 */

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor01 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor02 = sc.nextDouble();

        if (valor01 < valor02) {
            System.out.println("Valores em ordem crescente: " + valor01 + ", " + valor02);
        } else {
            System.out.println("Valores em ordem crescente: " + valor02 + ", " + valor01);
        }

        sc.close();
    }
}
