/*
 * Exercicio 07 (Faccat 10): O custo de um carro novo ao consumidor e a soma do custo de fabrica
 * com a porcentagem do distribuidor (28%) e dos impostos (45%). Ler o custo de fabrica
 * e escrever o custo final ao consumidor.
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fabrica do carro: ");
        double custoFabrica = sc.nextDouble();

        double custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);

        System.out.println("Custo final ao consumidor: R$ " + custoFinal);

        sc.close();
    }
}
