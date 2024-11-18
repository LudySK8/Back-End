package br.com.ltoledo.reflections.anotacao.cadastro.exception;

/**
 * @author ludmyla.toledo
 */
public class DadosInvalidosException extends Exception {

    public DadosInvalidosException(String msg) {
        this(msg, null);
    }

    public DadosInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }
}
