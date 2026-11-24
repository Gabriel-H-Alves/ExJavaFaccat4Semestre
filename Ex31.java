/*
 * Exercicio 31 (Faccat 40): Ler descricao do produto, quantidade adquirida e preco unitario.
 * Desconto: ate 5 un -> 2%, de 6 a 10 un -> 3%, acima de 10 un -> 5%.
 * Calcular e escrever total, desconto e total a pagar.
 */

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Descricao do produto: ");
        String descricao = sc.nextLine();

        System.out.print("Quantidade adquirida: ");
        int quantidade = sc.nextInt();

        System.out.print("Preco unitario: ");
        double precoUnitario = sc.nextDouble();

        double total = quantidade * precoUnitario;
        double percDesconto;

        if (quantidade <= 5) {
            percDesconto = 0.02;
        } else if (quantidade <= 10) {
            percDesconto = 0.03;
        } else {
            percDesconto = 0.05;
        }

        double valorDesconto = total * percDesconto;
        double totalPagar = total - valorDesconto;

        System.out.println("Produto: " + descricao);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Total a pagar: R$ " + totalPagar);

        sc.close();
    }
}
