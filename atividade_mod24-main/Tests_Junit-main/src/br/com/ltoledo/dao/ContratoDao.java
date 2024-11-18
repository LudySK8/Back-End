package br.com.ltoledo.dao;

/**
 * @author ludmyla.toledo
 */
public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public Contrato buscarPorId(int id) {
        return null;
    }

    @Override
    public void excluir(int id) {

    }

    @Override
    public void atualizar(Contrato contrato) {

    }
}
