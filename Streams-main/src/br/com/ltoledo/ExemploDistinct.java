package br.com.ltoledo;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Ludmyla.toledo
 */
public class ExemploDistinct {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}
