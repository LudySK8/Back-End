package main.br.com.ltoledo.dao;

import main.br.com.ltoledo.domain.Cliente;

public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente) throws Exception;

    public Cliente consultar(String codigo) throws Exception;

    public Integer excluir(Cliente clienteBD) throws Exception;
}
