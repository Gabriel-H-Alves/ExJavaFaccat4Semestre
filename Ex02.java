/*
 * Exercicio 02 (Faccat 5): Escreva um algoritmo para ler um valor (do teclado)
 * e escrever (na tela) o seu antecessor.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        int antecessor = valor - 1;

        System.out.println("O antecessor e: " + antecessor);

        sc.close();
    }
}
