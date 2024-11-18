package br.com.ltoledo.dao;

/**
 * @author ludmyla.toledo
 */
public interface IContratoDao {
    void salvar();

    Contrato buscarPorId(int id);

    void excluir(int id);

    void atualizar(Contrato contrato);
}
