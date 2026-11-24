/*
 * Exercicio 19 (Faccat 22): Jornada semanal de 40h (160h/mes). Horas que passarem de 160h
 * sao horas extras com acrescimo de 50%. Ler horas trabalhadas e salario por hora.
 * Calcular e escrever o salario total.
 */

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas no mes: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o salario por hora: ");
        double salarioHora = sc.nextDouble();

        double salarioTotal;
        if (horasTrabalhadas > 160) {
            double horasExtras = horasTrabalhadas - 160;
            salarioTotal = (160 * salarioHora) + (horasExtras * salarioHora * 1.5);
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        System.out.println("Salario total: R$ " + salarioTotal);

        sc.close();
    }
}
