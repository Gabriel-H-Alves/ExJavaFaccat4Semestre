/*
 * Exercicio 34 (Faccat 60): Ler 10 valores e escrever quantos desses valores lidos
 * estao no intervalo [10, 20] e quantos estao fora deste intervalo.
 */

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dentro = 0;
        int fora = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "o valor: ");
            double valor = sc.nextDouble();

            if (valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Valores no intervalo [10, 20]: " + dentro);
        System.out.println("Valores fora do intervalo: " + fora);

        sc.close();
    }
}
