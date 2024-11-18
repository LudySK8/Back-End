package br.com.ltoledo.service;

import br.com.ltoledo.dao.Contrato;

/**
 * @author ludmyla.toledo
 */
public interface IContratoService {
    String salvar();

    Contrato buscarPorId(int id);

    void excluir(int id);

    String atualizar(Contrato contrato);
}
