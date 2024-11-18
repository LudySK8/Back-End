package br.com.ltoledo.split;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ludmyla.toledo
 */
public class SepararPorSexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos no formato Nome-Sexo, separados por vírgulas (por exemplo, Rodrigo-M, Luana-F): ");
        String entrada = scanner.nextLine();

        String[] pares = entrada.split(",");

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (String par : pares) {
            String[] partes = par.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();

                if (sexo.equalsIgnoreCase("M")) {
                    homens.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    mulheres.add(nome);
                } else {
                    System.out.println("Sexo inválido para o nome: " + nome);
                }
            } else {
                System.out.println("Formato inválido para a entrada: " + par);
            }
        }

        System.out.println("Pessoas do sexo masculino:");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("Pessoas do sexo feminino:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }

        scanner.close();
    }
}
