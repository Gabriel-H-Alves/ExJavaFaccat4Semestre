/*
 * Exercicio 20 (Faccat 24): Ler salario fixo e valor das vendas. Comissao de 3% ate R$ 1.500,00
 * e 5% sobre o que ultrapassar este valor. Calcular e escrever o salario total.
 */

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor total das vendas: ");
        double vendas = sc.nextDouble();

        double comissao;
        if (vendas <= 1500.0) {
            comissao = vendas * 0.03;
        } else {
            comissao = (1500.0 * 0.03) + ((vendas - 1500.0) * 0.05);
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("Salario total com comissao: R$ " + salarioTotal);

        sc.close();
    }
}
