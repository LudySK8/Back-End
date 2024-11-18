package br.com.tludmyla.lambdas.anonimas;

/**
 * @author ludmyla.toledo
 */
@FunctionalInterface
public interface MyEventConsumerReturn<T> {

    public T consumer(Object value);
}
