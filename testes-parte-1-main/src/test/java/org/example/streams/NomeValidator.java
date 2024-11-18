package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class NomeValidator {

    public static boolean somenteMulheres(List<String> nomes) {
        List<String> mulheres = Arrays.asList("Maria", "Ana", "Juliana", "Fernanda", "Patrícia", "Amanda", "Larissa", "Gabriela");
        for (String nome : nomes) {
            if (!mulheres.contains(nome)) {
                return false;
            }
        }
        return true;
    }
}
