/*
 * Exercicio 08 (Faccat 11): Uma revendedora paga salario fixo mais comissao fixa por carro vendido
 * e mais 5% do valor total das vendas. Ler numero de carros vendidos, valor total das vendas,
 * salario fixo e valor por carro. Calcular e escrever o salario final.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de carros vendidos: ");
        int carrosVendidos = sc.nextInt();

        System.out.print("Valor total das vendas: ");
        double totalVendas = sc.nextDouble();

        System.out.print("Salario fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Valor por carro vendido: ");
        double valorPorCarro = sc.nextDouble();

        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + (totalVendas * 0.05);

        System.out.println("Salario final do vendedor: R$ " + salarioFinal);

        sc.close();
    }
}
