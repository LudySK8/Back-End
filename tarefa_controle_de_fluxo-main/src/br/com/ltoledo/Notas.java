package br.com.ltoledo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas {

    private static final int QUANTIDADE_NOTAS = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[QUANTIDADE_NOTAS];
        double media;

        for (int i = 0; i < QUANTIDADE_NOTAS; i++) {
            notas[i] = lerNota(scanner, i + 1);
        }

        media = calcularMedia(notas);

        exibirResultado(media);

        scanner.close();
    }

    private static double lerNota(Scanner scanner, int numeroNota) {
        double nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.printf("Digite a nota %d (entre 0 e 10): ", numeroNota);
            try {
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Deve estar entre 0 e 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        return nota;
    }

    private static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    private static void exibirResultado(double media) {
        System.out.printf("\nMédia Geral: %.2f%n", media);

        if (media >= 9) {
            System.out.println("Situação: Aprovado com louvor!");
        } else if (media >= 7) {
            System.out.println("Situação: Aprovado!");
        } else if (media > 3) {
            System.out.println("Situação: Reprovado (Recuperação)!");
        } else {
            System.out.println("Situação: Reprovado (Repetir de ano)!");
        }
    }
}

