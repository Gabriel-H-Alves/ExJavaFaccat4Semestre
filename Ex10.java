/*
 * Exercicio 10 (Faccat 13): Faca um algoritmo que leia tres notas de um aluno, calcule
 * e escreva a media final ponderada (pesos 2, 3 e 5).
 */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota02 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota03 = sc.nextDouble();

        double mediaFinal = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)) / 10.0;

        System.out.println("Media final: " + mediaFinal);

        sc.close();
    }
}
