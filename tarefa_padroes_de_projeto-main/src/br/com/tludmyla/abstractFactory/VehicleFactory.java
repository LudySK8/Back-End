package br.com.tludmyla.abstractFactory;

/**
 * @author ludmyla.toledo
 */
public interface VehicleFactory {

    Car creteCar();

    Motorcycle createMotorcycle();
}
