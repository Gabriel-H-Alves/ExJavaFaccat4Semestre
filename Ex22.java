/*
 * Exercicio 22 (Faccat 26): Ler quantidade atual em estoque, quantidade maxima e minima.
 * Calcular quantidade media = (quantidade maxima + quantidade minima) / 2.
 * Se atual >= media, escrever 'Nao efetuar compra', senao 'Efetuar compra'.
 */

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade atual em estoque: ");
        int atual = sc.nextInt();

        System.out.print("Quantidade maxima: ");
        int maxima = sc.nextInt();

        System.out.print("Quantidade minima: ");
        int minima = sc.nextInt();

        double media = (maxima + minima) / 2.0;

        System.out.println("Quantidade media: " + media);
        if (atual >= media) {
            System.out.println("Nao efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        sc.close();
    }
}
