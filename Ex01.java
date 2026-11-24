/*
 * Exercicio 01 (Faccat 1): Escreva um algoritmo que armazene o valor 10 em uma variavel numeroA
 * e o valor 20 em uma variavel numeroB. A seguir troque os seus conteudos fazendo com que o valor
 * que esta em numeroA passe para numeroB e vice-versa. Ao final, escrever os valores armazenados.
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroA = 10;
        int numeroB = 20;

        int auxiliar = numeroA;
        numeroA = numeroB;
        numeroB = auxiliar;

        System.out.println("Valor de numeroA: " + numeroA);
        System.out.println("Valor de numeroB: " + numeroB);

        sc.close();
    }
}
