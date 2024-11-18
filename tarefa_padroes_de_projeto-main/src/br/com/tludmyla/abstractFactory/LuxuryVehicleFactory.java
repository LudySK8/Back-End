package br.com.tludmyla.abstractFactory;

import br.com.tludmyla.abstractFactory.luxury.CarLuxury;
import br.com.tludmyla.abstractFactory.luxury.MotorcycleLuxury;

/**
 * @author ludmyla.toledo
 */
public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Car creteCar() {
        return new CarLuxury();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleLuxury();
    }
}
