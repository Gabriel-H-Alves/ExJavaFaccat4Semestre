/*
 * Exercicio 35 (Faccat 69): Levantamento do valor em estoque. Ler o valor de cada mercadoria
 * e perguntar 'MAIS MERCADORIAS (S/N)?'. Ao final, imprimir o valor total e a media.
 */

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int quantidade = 0;
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite o valor da mercadoria: ");
            double valor = sc.nextDouble();

            total = total + valor;
            quantidade++;

            System.out.print("MAIS MERCADORIAS (S/N)? ");
            resposta = sc.next();
        }

        if (quantidade > 0) {
            double media = total / quantidade;
            System.out.println("Valor total em estoque: R$ " + total);
            System.out.println("Media do valor das mercadorias: R$ " + media);
        } else {
            System.out.println("Nenhuma mercadoria cadastrada.");
        }

        sc.close();
    }
}
