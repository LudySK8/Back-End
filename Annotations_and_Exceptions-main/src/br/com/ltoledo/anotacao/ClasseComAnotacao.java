package br.com.ltoledo.anotacao;

/**
 * @author ludmyla.toledo
 */
@PrimeiraAnotacao(value = "Ludmyla", bairros = "Java", numeroCasa = 626)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Toledo", bairros = {"Java", "Java2"}, numeroCasa = 4, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Ludmyla", bairros = "Java", numeroCasa = 626)
    public ClasseComAnotacao() {

    }
}
