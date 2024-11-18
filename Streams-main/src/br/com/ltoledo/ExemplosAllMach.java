package br.com.ltoledo;

import  java.util.List;

/**
 * @author ludmyla.toledo
 */
public class ExemplosAllMach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(result);

        //Método convencional
        Boolean re = true;
        for (Pessoa p : lista) {
            if (!p.getNacionalidade().equals("Mexico")) {
                re=false;
                break;
            }
        }
    }
}
