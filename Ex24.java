/*
 * Exercicio 24 (Faccat 28): Ler 3 valores (nao serao iguais) e escrever o maior deles.
 */

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor01 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor02 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor03 = sc.nextDouble();

        double maior;
        if (valor01 > valor02 && valor01 > valor03) {
            maior = valor01;
        } else if (valor02 > valor03) {
            maior = valor02;
        } else {
            maior = valor03;
        }

        System.out.println("O maior valor e: " + maior);

        sc.close();
    }
}
