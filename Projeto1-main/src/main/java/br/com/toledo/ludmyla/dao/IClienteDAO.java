/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.toledo.ludmyla.dao;

import br.com.toledo.ludmyla.domain.Cliente;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author toledo.ludmyla
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
