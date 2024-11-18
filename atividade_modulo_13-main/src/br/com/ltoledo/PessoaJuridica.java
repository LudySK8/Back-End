package br.com.ltoledo;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + cnpj);
    }
}
