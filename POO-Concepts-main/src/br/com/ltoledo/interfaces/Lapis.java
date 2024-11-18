package br.com.ltoledo.interfaces;

/**
 * @author ludmyla.toledo
 */
public class Lapis implements ICaneta {

    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Preto claro";
    }
}
