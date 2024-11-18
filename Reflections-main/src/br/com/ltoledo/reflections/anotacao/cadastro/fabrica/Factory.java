package br.com.ltoledo.reflections.anotacao.cadastro.fabrica;

/**
 * @author ludmyla.toledo
 */
public class Factory implements IFactory {

    @Override
    public FabricaPersistente criarFabrica(String opcaoMenuGeral) {
        if ("1".equals(opcaoMenuGeral)) {
            return new ClienteFabrica();
        } else {
            return new ProdutoFabrica();
        }
    }
}
