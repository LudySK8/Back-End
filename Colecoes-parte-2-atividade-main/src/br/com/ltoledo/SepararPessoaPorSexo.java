package br.com.ltoledo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ludmyla.toledo
 */
public class SepararPessoaPorSexo {

    public static void main(String[] args) {
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.toUpperCase().equals("M")) {
                masculino.add(nome);
            } else if (sexo.toUpperCase().equals("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite M ou F.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.toUpperCase().equals("S")) {
                break;
            }
        }

        System.out.println("Pessoas do sexo masculino:");
        for (String nomeMasculino : masculino) {
            System.out.println(nomeMasculino);
        }

        System.out.println("Pessoas do sexo feminino:");
        for (String nomeFeminino : feminino) {
            System.out.println(nomeFeminino);
        }
    }
}
