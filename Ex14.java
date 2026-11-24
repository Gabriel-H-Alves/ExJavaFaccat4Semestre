/*
 * Exercicio 14 (Faccat 17): Ler as notas da 1a. e 2a. avaliacoes de um aluno.
 * Calcular a media aritmetica simples e escrever se foi ou nao aprovado (nota >= 6).
 * Escrever tambem a media calculada.
 */

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da 1a avaliacao: ");
        double nota01 = sc.nextDouble();

        System.out.print("Digite a nota da 2a avaliacao: ");
        double nota02 = sc.nextDouble();

        double media = (nota01 + nota02) / 2.0;

        if (media >= 6.0) {
            System.out.println("Aluno aprovado! Media: " + media);
        } else {
            System.out.println("Aluno reprovado! Media: " + media);
        }

        sc.close();
    }
}
