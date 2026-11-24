/*
 * Exercicio 16 (Faccat 19): Ler dois valores (considere que nao serao lidos valores iguais)
 * e escrever o maior deles.
 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor01 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor02 = sc.nextDouble();

        if (valor01 > valor02) {
            System.out.println("Maior valor: " + valor01);
        } else {
            System.out.println("Maior valor: " + valor02);
        }

        sc.close();
    }
}
