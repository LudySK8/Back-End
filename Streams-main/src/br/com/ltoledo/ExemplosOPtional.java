package br.com.ltoledo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author ludmyla.toledo
 */
public class ExemplosOPtional {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Optional<Pessoa> opcional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        if (opcional.isPresent()) {
            System.out.println(opcional.get());
        }

        opcional.ifPresent(System.out::println);
    }
}
