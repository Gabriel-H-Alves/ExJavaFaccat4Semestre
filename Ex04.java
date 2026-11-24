/*
 * Exercicio 04 (Faccat 7): Faca um algoritmo que leia a idade de uma pessoa expressa
 * em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
 * Considerar ano com 365 dias e mes com 30 dias.
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os anos: ");
        int anos = sc.nextInt();

        System.out.print("Digite os meses: ");
        int meses = sc.nextInt();

        System.out.print("Digite os dias: ");
        int dias = sc.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade expressa em dias: " + totalDias);

        sc.close();
    }
}
