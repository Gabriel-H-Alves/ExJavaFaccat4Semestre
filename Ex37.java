/*
 * Exercicio 37 (Faccat 82): Ler um vetorPrincipal de 10 numeros. Apos, ler mais um numero e guardar
 * em uma variavel multiplicadorX. Armazenar em um vetorMultiplicado o resultado de cada elemento
 * multiplicado por multiplicadorX e imprimir o vetorMultiplicado.
 */

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorPrincipal = new int[10];
        int[] vetorMultiplicado = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            vetorPrincipal[i] = sc.nextInt();
        }

        System.out.print("Digite o multiplicador: ");
        int multiplicadorX = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            vetorMultiplicado[i] = vetorPrincipal[i] * multiplicadorX;
        }

        System.out.println("Resultado da multiplicacao:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicao " + i + ": " + vetorMultiplicado[i]);
        }

        sc.close();
    }
}
