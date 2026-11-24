/*
 * Exercicio 26 (Faccat 31): Ler 3 valores (ladoA, ladoB e ladoC) representando os lados de um triangulo
 * e escrever se formam ou nao um triangulo (cada lado menor que a soma dos outros dois).
 */

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double ladoA = sc.nextDouble();

        System.out.print("Digite o lado B: ");
        double ladoB = sc.nextDouble();

        System.out.print("Digite o lado C: ");
        double ladoC = sc.nextDouble();

        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) {
            System.out.println("Formam um triangulo.");
        } else {
            System.out.println("Nao formam um triangulo.");
        }

        sc.close();
    }
}
