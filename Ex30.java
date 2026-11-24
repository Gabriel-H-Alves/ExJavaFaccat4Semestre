/*
 * Exercicio 30 (Faccat 37): Fruteira vende Morango e Maca.
 * Morango: ate 5 Kg -> R$ 2,50/Kg | acima de 5 Kg -> R$ 2,20/Kg
 * Maca: ate 5 Kg -> R$ 1,80/Kg | acima de 5 Kg -> R$ 1,50/Kg
 * Se peso total > 8 Kg ou valor total > R$ 25,00, ganha 10% de desconto.
 * Ler quantidade de morangos e macas em Kg e escrever valor a pagar.
 */

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de morangos (Kg): ");
        double kgMorango = sc.nextDouble();

        System.out.print("Quantidade de macas (Kg): ");
        double kgMaca = sc.nextDouble();

        double precoMorango;
        if (kgMorango <= 5.0) {
            precoMorango = kgMorango * 2.50;
        } else {
            precoMorango = kgMorango * 2.20;
        }

        double precoMaca;
        if (kgMaca <= 5.0) {
            precoMaca = kgMaca * 1.80;
        } else {
            precoMaca = kgMaca * 1.50;
        }

        double pesoTotal = kgMorango + kgMaca;
        double valorTotal = precoMorango + precoMaca;

        if (pesoTotal > 8.0 || valorTotal > 25.0) {
            valorTotal = valorTotal * 0.90;
        }

        System.out.println("Valor a ser pago: R$ " + valorTotal);

        sc.close();
    }
}
