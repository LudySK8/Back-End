/**
 * @author toledo.ludmyla
 */
public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá Ludmyla");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        //cliente.imprimiriEndereco();
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal());
    }
}
