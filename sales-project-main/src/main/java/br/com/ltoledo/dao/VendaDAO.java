package br.com.ltoledo.dao;

import br.com.ltoledo.dao.generic.GenericDAO;
import br.com.ltoledo.domain.Venda;
import br.com.ltoledo.domain.Venda.Status;
import br.com.ltoledo.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author ludmyla.toledo
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Status.CONCLUIDA);
        super.alterar(venda);
    }
}
