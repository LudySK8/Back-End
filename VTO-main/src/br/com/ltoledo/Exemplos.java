package br.com.ltoledo;

/**
 * @author ludmyla.toledo
 */
public class Exemplos {

    private int codigo;

    private long codigoMaior = 1204050;

    private double valorDecimal1 = 10.1;

    private boolean status = false;

    private String texto = "adsdfsd4524154";

    public Exemplos() {

    }

    public Exemplos(int val) {
        this.codigo = val;
    }

    private float valorDecimal = 10.0f;

    private short shor;

    private byte bi;


    public String retornarTexto() {
        this.codigo = 0;
        return "Qualquer coisa";
    }

    public int retornarInteiro() {
        int val = 10;
        String texto = "Texto";
        this.texto = null;
        return val;
    }

    public long retornarLong(long num) {
        this.texto = "adsd";
        return num;
    }
}
