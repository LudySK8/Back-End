package br.com.tludmyla;

import java.util.ArrayList;
import java.util.List;

public class Garage<T> {
    private List<Car<T>> cars;

    public Garage() {
        cars = new ArrayList<>();
    }

    public void addCar(Car<T> car) {
        cars.add(car);
    }

    public List<Car<T>> getCars() {
        return cars;
    }
}