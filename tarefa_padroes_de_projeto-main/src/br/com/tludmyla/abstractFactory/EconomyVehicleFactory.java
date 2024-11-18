package br.com.tludmyla.abstractFactory;

import br.com.tludmyla.abstractFactory.economy.CarEconomy;
import br.com.tludmyla.abstractFactory.economy.MotorcycleEconomy;

/**
 * @author ludmyla.toledo
 */
public class EconomyVehicleFactory implements VehicleFactory {
    @Override
    public Car creteCar() {
        return new CarEconomy();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleEconomy();
    }
}
