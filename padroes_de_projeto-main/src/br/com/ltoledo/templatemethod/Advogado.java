package br.com.ltoledo.templatemethod;

public class Advogado extends Trabalhador {

    @Override
    public void executar() {
        System.out.println("Estou de férias");
    }

    @Override
    protected void trabalhar() {

    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltar para casa de carro");
    }

    @Override
    protected void irAoTrabalho() {
        super.irAoTrabalho();
    }

    @Override
    public void iniciarRotina() {
        super.iniciarRotina();
    }

    @Override
    public void levantar() {
        super.levantar();
    }
}

