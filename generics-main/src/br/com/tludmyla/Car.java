package br.com.tludmyla;

public class Car<T> {

    private T type;

    public Car(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}
