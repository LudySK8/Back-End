package br.com.ltoledo.adpter;

import java.io.File;

/**
 * @author toledo.ludmyla
 */
public interface PersistenciaArquivos {

    //byte[] bytes = Files.readAllBytes(file.toPath());
    public void gravar(File file);

    public File ler(String caminho);
}