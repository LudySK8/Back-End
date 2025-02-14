package br.com.tludmyla.lambdas.anonimas;

import br.com.tludmyla.lambdas.TesteLambdasThreads;

/**
 * @author ludmyla.toledo
 */
public class AnonimasTeste {

    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("Teste anônima");


        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer(10);

        receberInterface("Value", value -> System.out.println(value));

        receberInterface(Boolean.TRUE, value -> System.out.println(value));
    }

    private static void receberInterface(Object o, MyEventConsumer anonimaLambda) {
        anonimaLambda.consumer(o);
    }
}
