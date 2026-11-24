/*
 * Exercicio 28 (Faccat 35): Posto de combustivel com tabela de descontos:
 * Alcool (R$ 2,90/litro): ate 20 litros -> 3% desconto, acima de 20 -> 5% desconto.
 * Gasolina (R$ 3,30/litro): ate 20 litros -> 4% desconto, acima de 20 -> 6% desconto.
 * Ler litros e tipo (A ou G). Calcular e escrever valor final.
 */

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de litros: ");
        double litros = sc.nextDouble();

        System.out.print("Tipo de combustivel (A-alcool / G-gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double precoLitro;
        double percentualDesconto;

        if (tipo == 'A') {
            precoLitro = 2.90;
            if (litros <= 20) {
                percentualDesconto = 0.03;
            } else {
                percentualDesconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 3.30;
            if (litros <= 20) {
                percentualDesconto = 0.04;
            } else {
                percentualDesconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustivel invalido.");
            sc.close();
            return;
        }

        double totalSemDesconto = litros * precoLitro;
        double valorFinal = totalSemDesconto - (totalSemDesconto * percentualDesconto);

        System.out.println("Valor a ser pago: R$ " + valorFinal);

        sc.close();
    }
}
