package br.com.ltoledo.interfaces;

/**
 * @author ludmyla.toledo
 */
public interface ICarro {

    public default void parar() {
        System.out.println("Carro está em parando");
    }

    public void andar();
}
