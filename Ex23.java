/*
 * Exercicio 23 (Faccat 27): Ler um valor e escrever se e positivo, negativo ou zero.
 */

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();

        if (valor > 0) {
            System.out.println("Positivo");
        } else if (valor < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
