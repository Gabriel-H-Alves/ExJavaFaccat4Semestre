/*
 * Exercicio 03 (Faccat 6): Escreva um algoritmo para ler as dimensoes de um retangulo
 * (base e altura), calcular e escrever a area do retangulo.
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("A area do retangulo e: " + area);

        sc.close();
    }
}
