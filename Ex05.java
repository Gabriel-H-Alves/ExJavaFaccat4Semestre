/*
 * Exercicio 05 (Faccat 8): Escreva um algoritmo para ler o numero total de eleitores
 * de um municipio, o numero de votos brancos, nulos e validos. Calcular e escrever
 * o percentual que cada um representa em relacao ao total de eleitores.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de eleitores: ");
        double totalEleitores = sc.nextDouble();

        System.out.print("Digite a quantidade de votos brancos: ");
        double brancos = sc.nextDouble();

        System.out.print("Digite a quantidade de votos nulos: ");
        double nulos = sc.nextDouble();

        System.out.print("Digite a quantidade de votos validos: ");
        double validos = sc.nextDouble();

        double percBrancos = (brancos / totalEleitores) * 100.0;
        double percNulos = (nulos / totalEleitores) * 100.0;
        double percValidos = (validos / totalEleitores) * 100.0;

        System.out.println("Percentual de votos brancos: " + percBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos validos: " + percValidos + "%");

        sc.close();
    }
}
