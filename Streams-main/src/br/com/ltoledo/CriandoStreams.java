package br.com.ltoledo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author ludmyla.toledo
 */
public class CriandoStreams {

    public static void main(String[] args) {
        Stream<String> stream = List.of("Ludmyla", "Toledo", "Teste").stream();

        Stream<String> set = Set.of("Ludmyla", "Toledo", "Teste").stream();

        Map<String, String> map = Map.of("Ludmyla", "Toledo");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "asds");
    }
}
