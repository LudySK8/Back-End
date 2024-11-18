package br.com.ltoledo.observer;

/**
 * @author ludmyla.toledo
 */
public class Demo {

    public static void main(String args[]) {
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Teste");
    }
}
