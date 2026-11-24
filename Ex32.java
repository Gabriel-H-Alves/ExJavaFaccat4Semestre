/*
 * Exercicio 32 (Faccat 44 e 46): Ler 2 valores e se o segundo valor for ZERO, ler novamente
 * exibindo mensagem 'VALOR INVALIDO'. Imprimir a divisao do primeiro pelo segundo.
 */

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor01 = sc.nextDouble();

        double valor02;
        do {
            System.out.print("Digite o segundo valor (nao pode ser zero): ");
            valor02 = sc.nextDouble();
            if (valor02 == 0) {
                System.out.println("VALOR INVALIDO");
            }
        } while (valor02 == 0);

        double resultado = valor01 / valor02;

        System.out.println("Resultado da divisao: " + resultado);

        sc.close();
    }
}
