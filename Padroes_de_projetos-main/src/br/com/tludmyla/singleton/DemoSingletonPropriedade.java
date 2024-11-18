package br.com.tludmyla.singleton;

/**
 * @author ludmyla.toledo
 */
public class DemoSingletonPropriedade {

    public static void main(String args[]) {
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Teste1");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
