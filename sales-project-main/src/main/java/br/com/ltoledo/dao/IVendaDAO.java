package br.com.ltoledo.dao;

import br.com.ltoledo.dao.generic.IGenericDAO;
import br.com.ltoledo.domain.Venda;
import br.com.ltoledo.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author ludmyla.toledo
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
