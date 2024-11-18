package br.com.ltoledo;

public class Main {
        public static void main(String[] args) {
            PessoaFisica pf = new PessoaFisica("João Silva", "123.456.789-09");
            PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-90");

            pf.exibirInformacoes();
            System.out.println();
            pj.exibirInformacoes();
        }

}
