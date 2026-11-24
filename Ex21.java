/*
 * Exercicio 21 (Faccat 25): Ler numero da conta, saldo, debito e credito.
 * Calcular saldo atual = saldo - debito + credito.
 * Se saldo atual >= 0, escrever 'Saldo Positivo', senao 'Saldo Negativo'.
 */

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero da conta: ");
        int conta = sc.nextInt();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Debito: ");
        double debito = sc.nextDouble();

        System.out.print("Credito: ");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("Conta: " + conta + " | Saldo Atual: R$ " + saldoAtual);
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        sc.close();
    }
}
