package br.com.ltoledo.adpter;

import java.io.File;

/**
 * @author ludmyla.toledo
 */
public class Demo {

    public static void main(String args[]) {
        String file = "teste.txt";
        DropBox drop = new DropBox();
        PersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}