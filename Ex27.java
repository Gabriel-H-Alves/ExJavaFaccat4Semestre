/*
 * Exercicio 27 (Faccat 32): Ler o nome de 2 times e o numero de gols marcados por cada time.
 * Escrever o nome do vencedor ou EMPATE.
 */

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do time 1: ");
        String time1 = sc.nextLine();

        System.out.print("Gols do time 1: ");
        int gols1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do time 2: ");
        String time2 = sc.nextLine();

        System.out.print("Gols do time 2: ");
        int gols2 = sc.nextInt();

        if (gols1 > gols2) {
            System.out.println("Vencedor: " + time1);
        } else if (gols2 > gols1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        sc.close();
    }
}
