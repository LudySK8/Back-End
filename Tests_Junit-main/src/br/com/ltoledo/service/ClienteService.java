package br.com.ltoledo.service;

import br.com.ltoledo.dao.ClienteDao;
import br.com.ltoledo.dao.ClienteDaoMock;
import br.com.ltoledo.dao.IClienteDao;

/**
 * @author ludmyla.toledo
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
