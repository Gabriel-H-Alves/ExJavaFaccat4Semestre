/*
 * Exercicio 06 (Faccat 9): Escreva um algoritmo para ler o salario mensal atual
 * de um funcionario e o percentual de reajuste. Calcular e escrever o valor do novo salario.
 */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario mensal atual: ");
        double salarioAtual = sc.nextDouble();

        System.out.print("Digite o percentual de reajuste (%): ");
        double percentual = sc.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * (percentual / 100.0));

        System.out.println("Novo salario: R$ " + novoSalario);

        sc.close();
    }
}
