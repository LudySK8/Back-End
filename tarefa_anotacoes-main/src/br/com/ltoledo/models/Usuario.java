package br.com.ltoledo.models;

import br.com.ltoledo.annotations.Tabela;

/**
 * @author ludmyla.toledo
 */
@Tabela("usuario")
public class Usuario {
    private String nome;
    private int idade;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

