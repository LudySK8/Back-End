package br.com.tludmyla;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garage<String> garage = new Garage<>();

        garage.addCar(new Lamborghini());
        garage.addCar(new AstonMartin());
        garage.addCar(new Bugatti());

        List<Car<String>> cars = garage.getCars();

        for (Car<String> car : cars) {
            System.out.println(car.getType());
        }
    }
}
