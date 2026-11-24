/*
 * Exercicio 29 (Faccat 36): Ler idades de 2 homens e 2 mulheres (todas diferentes).
 * Calcular e escrever: soma da idade do homem mais velho com a mulher mais nova,
 * e produto da idade do homem mais novo com a mulher mais velha.
 */

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade do primeiro homem: ");
        int idadeHomem01 = sc.nextInt();

        System.out.print("Idade do segundo homem: ");
        int idadeHomem02 = sc.nextInt();

        System.out.print("Idade da primeira mulher: ");
        int idadeMulher01 = sc.nextInt();

        System.out.print("Idade da segunda mulher: ");
        int idadeMulher02 = sc.nextInt();

        int homemMaisVelho;
        int homemMaisNovo;
        if (idadeHomem01 > idadeHomem02) {
            homemMaisVelho = idadeHomem01;
            homemMaisNovo = idadeHomem02;
        } else {
            homemMaisVelho = idadeHomem02;
            homemMaisNovo = idadeHomem01;
        }

        int mulherMaisVelha;
        int mulherMaisNova;
        if (idadeMulher01 > idadeMulher02) {
            mulherMaisVelha = idadeMulher01;
            mulherMaisNova = idadeMulher02;
        } else {
            mulherMaisVelha = idadeMulher02;
            mulherMaisNova = idadeMulher01;
        }

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma (homem mais velho + mulher mais nova): " + soma);
        System.out.println("Produto (homem mais novo * mulher mais velha): " + produto);

        sc.close();
    }
}
