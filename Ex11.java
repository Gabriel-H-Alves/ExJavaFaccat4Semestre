/*
 * Exercicio 11 (Faccat 14): Ler um valor e escrever a mensagem E MAIOR QUE 10!
 * se o valor lido for maior que 10, caso contrario escrever NAO E MAIOR QUE 10!
 */

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();

        if (valor > 10) {
            System.out.println("E MAIOR QUE 10!");
        } else {
            System.out.println("NAO E MAIOR QUE 10!");
        }

        sc.close();
    }
}
