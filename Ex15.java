/*
 * Exercicio 15 (Faccat 18): Ler o ano atual e o ano de nascimento de uma pessoa.
 * Escrever uma mensagem que diga se ela podera ou nao votar este ano (idade >= 16).
 */

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Pode votar este ano.");
        } else {
            System.out.println("Nao pode votar este ano.");
        }

        sc.close();
    }
}
