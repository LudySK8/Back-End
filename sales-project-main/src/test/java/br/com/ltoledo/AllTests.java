package br.com.ltoledo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author ludmyla.toledo
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}