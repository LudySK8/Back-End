package org.example.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamsTest {

    @Test
    public void testSomenteMulheres() {
        List<String> grupoMulheres = Arrays.asList("Maria", "Ana", "Juliana");

        assertTrue(NomeValidator.somenteMulheres(grupoMulheres), "A lista deve conter apenas nomes de mulheres.");

        List<String> grupoMisturado = Arrays.asList("Maria", "Ana", "João");

        assertFalse(NomeValidator.somenteMulheres(grupoMisturado), "A lista não deve conter nomes de homens.");
    }

}
