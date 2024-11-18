package br.com.ltoledo;

public abstract class Pessoa {

    private String nome;
    private String documento;

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public abstract void exibirInformacoes();
}