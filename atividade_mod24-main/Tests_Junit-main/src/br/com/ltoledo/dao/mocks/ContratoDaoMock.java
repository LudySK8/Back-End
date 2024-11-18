package br.com.ltoledo.dao.mocks;

import br.com.ltoledo.dao.Contrato;
import br.com.ltoledo.dao.IContratoDao;

/**
 * @author ludmyla.toledo
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {

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
