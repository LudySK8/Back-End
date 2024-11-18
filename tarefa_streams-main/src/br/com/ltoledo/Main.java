package br.com.ltoledo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author ludmyla.toledo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Insira os nomes e gêneros (nome-genero). Digite 'sair' para terminar:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            String[] partes = input.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim().toLowerCase();
                pessoas.add(new Pessoa(nome, genero));
            } else {
                System.out.println("Entrada inválida, tente novamente.");
            }
        }

        Predicate<Pessoa> apenasMulheres = pessoa -> pessoa.getGenero().equalsIgnoreCase("feminino");

        List<Pessoa> mulheres = pessoas.stream()
                .filter(apenasMulheres)
                .collect(Collectors.toList());

        System.out.println("\nLista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}
