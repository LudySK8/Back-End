package br.com.toledoludmyla;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata", 0);
        meuCarro.exibirInfo();
        meuCarro.ligar();
        meuCarro.dirigir(50);
        meuCarro.desligar();
        meuCarro.exibirInfo();
    }
}
