/*
 * Exercicio 13 (Faccat 16): As macas custam R$ 1,30 cada se forem compradas menos de uma duzia,
 * e R$ 1,00 se forem compradas pelo menos 12. Ler o numero de macas compradas, calcular
 * e escrever o custo total da compra.
 */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de macas compradas: ");
        int quantidade = sc.nextInt();

        double total;
        if (quantidade < 12) {
            total = quantidade * 1.30;
        } else {
            total = quantidade * 1.00;
        }

        System.out.println("Custo total da compra: R$ " + total);

        sc.close();
    }
}
