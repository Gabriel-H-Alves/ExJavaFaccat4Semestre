/*
 * Exercicio 09 (Faccat 12): Ler uma temperatura em graus Fahrenheit, calcular
 * e escrever o valor correspondente em graus Celsius (C / 5 = (F - 32) / 9).
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (5.0 * (fahrenheit - 32.0)) / 9.0;

        System.out.println("Temperatura em Celsius: " + celsius);

        sc.close();
    }
}
