package br.com.ltoledo.service;

import br.com.ltoledo.dao.IContratoDao;

/**
 * @author ludmyla.toledo
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}
