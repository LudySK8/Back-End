package br.com.ltoledo.adpter;

import java.io.File;

/**
 * @author ludmyla.toledo
 */
public class DropBoxAdapter implements PersistenciaArquivos {

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropbox) {
        this.dropBox = dropbox;
    }


    @Override
    public void gravar(File file) {
        dropBox.download(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        DropBoxFile file = dropBox.download(caminho);
        return new File(file.getLocalPath());
    }
}