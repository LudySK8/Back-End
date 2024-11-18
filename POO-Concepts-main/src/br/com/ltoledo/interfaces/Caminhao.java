package br.com.ltoledo.interfaces;

/**
 * @author ludmyla.toledo
 */
public class Caminhao implements ICarro {
    @Override
    public void andar() {
        System.out.println("Carro está andando de vagar");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão parando");
    }
}
