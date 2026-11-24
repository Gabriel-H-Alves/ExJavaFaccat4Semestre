/*
 * Exercicio 18 (Faccat 21): Ler a hora de inicio e a hora de fim de um jogo de Xadrez
 * (apenas horas inteiras). Calcular a duracao do jogo em horas, sabendo que o tempo maximo
 * e de 24 horas e pode iniciar em um dia e terminar no dia seguinte.
 */

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora de inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Digite a hora de fim: ");
        int fim = sc.nextInt();

        int duracao;
        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }

        System.out.println("Duracao do jogo: " + duracao + " hora(s)");

        sc.close();
    }
}
