/*
 * Exercicio 25 (Faccat 29): Ler 3 valores (nao serao iguais) e escrever a soma dos 2 maiores.
 */

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor01 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor02 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor03 = sc.nextDouble();

        double soma;
        if (valor01 < valor02 && valor01 < valor03) {
            soma = valor02 + valor03;
        } else if (valor02 < valor03) {
            soma = valor01 + valor03;
        } else {
            soma = valor01 + valor02;
        }

        System.out.println("Soma dos dois maiores valores: " + soma);

        sc.close();
    }
}
