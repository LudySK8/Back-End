package br.com.ltoledo.services;

import br.com.ltoledo.domain.Cliente;
import br.com.ltoledo.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author ludmyla.toledo
 *
 */
public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}

