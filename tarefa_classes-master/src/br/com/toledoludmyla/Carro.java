package br.com.toledoludmyla;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int quilometragem;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, String cor, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void dirigir(int distancia) {
        if (ligado) {
            quilometragem += distancia;
            System.out.println("Você dirigiu " + distancia + " km. Quilometragem total: " + quilometragem + " km.");
        } else {
            System.out.println("O carro está desligado. Ligue o carro antes de dirigir.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Status do carro: " + (ligado ? "Ligado" : "Desligado"));
    }
}