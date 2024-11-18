package br.com.ltoledo;

import br.com.ltoledo.dao.ContratoDao;
import br.com.ltoledo.dao.IContratoDao;
import br.com.ltoledo.dao.mocks.ContratoDaoMock;
import br.com.ltoledo.service.ContratoService;
import br.com.ltoledo.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author ludmyla.toledo
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
