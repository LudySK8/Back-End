package br.com.ltoledo;

import br.com.ltoledo.dao.ClienteDao;
import br.com.ltoledo.dao.ClienteDaoMock;
import br.com.ltoledo.dao.IClienteDao;
import br.com.ltoledo.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author ludmyla.toledo
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
