package br.com.ltoledo.abstratas;

/**
 * @author ludmyla.toledo
 */
public class Programa {

    public static void main(String args[]) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Ludmyla");
        empregado.setSobrenome("Toledo");
        empregado.setSalario(100d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Ludmyla2");
        comissionado.setSobrenome("Toledo");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("23");
        horista.setNome("Ludmyla23");
        horista.setSobrenome("Toledo");
        horista.setPrecoHora(100d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof Horista) {
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vencimento());
    }
}
