package br.com.ltoledo.exceptions;

/**
 * @author ludmyla.toledo
 */
public class ClienteDAO {

    public static void consutlarCliente(String codigo) throws ClienteNaoEncontradoException {
        //Bucar no banco
        boolean isCadastrado = false;

        if (!isCadastrado) {
            throw new ClienteNaoEncontradoException("Cliente não foi encontrado");
        }
    }
}
