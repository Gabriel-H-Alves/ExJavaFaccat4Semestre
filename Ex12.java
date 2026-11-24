/*
 * Exercicio 12 (Faccat 15): Ler um valor e escrever se e positivo ou negativo
 * (considere o valor zero como positivo).
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();

        if (valor >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
