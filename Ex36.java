/*
 * Exercicio 36 (Faccat 78): Permitir a leitura dos nomes de 10 pessoas e guardar em um vetor.
 * Apos isto, ler mais 1 nome qualquer e escrever a mensagem ACHEI (se estiver no vetor)
 * ou NAO ACHEI caso contrario.
 */

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "o nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite um nome para pesquisar: ");
        String busca = sc.nextLine();

        boolean achei = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                achei = true;
                break;
            }
        }

        if (achei) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }

        sc.close();
    }
}
