package br.com.ltoledo;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author ludmyla.toledo
 */
public class ExemplosLimit {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = lista.stream().limit(2);
    }
}
