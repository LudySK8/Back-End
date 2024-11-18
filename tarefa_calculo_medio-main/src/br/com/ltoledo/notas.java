package br.com.ltoledo;

/**
 * @author ludmyla.toledo
 */

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double media;

        System.out.print("Digite a nota 1: ");
        notas[0] = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        notas[1] = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        notas[2] = scanner.nextDouble();

        System.out.print("Digite a nota 4: ");
        notas[3] = scanner.nextDouble();

        media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("\nMédia Geral: " + media);

        if (media >= 7 && media < 9) {
            System.out.println("Situação: Aprovado!");
        } else if (media >= 9) {
            System.out.println("Situação: Aprovado com louvor!");
        } else if (media > 3 && media < 7) {
            System.out.println("Situação: Reprovado (Recuperação)!");
        } else {
            System.out.println("Situação: Reprovado (Repetir de ano)!");
        }

        scanner.close();
    }
}
