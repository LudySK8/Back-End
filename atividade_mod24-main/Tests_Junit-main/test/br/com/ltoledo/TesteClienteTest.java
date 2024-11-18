package br.com.ltoledo;

import org.junit.Assert;
import org.junit.Test;

import br.com.ltoledo.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Ludmyla");
        cli.adicionarNome1("Ludmyla");

        Assert.assertEquals("Ludmyla", cli.getNome());
    }
}
