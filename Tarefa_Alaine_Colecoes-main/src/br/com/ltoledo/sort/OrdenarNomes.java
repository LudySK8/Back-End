package br.com.ltoledo.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ludmyla.toledo
 */
public class OrdenarNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgulas: ");

        String entrada = scanner.nextLine();
        String[] nomes = entrada.split(",");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes ordenados:");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
