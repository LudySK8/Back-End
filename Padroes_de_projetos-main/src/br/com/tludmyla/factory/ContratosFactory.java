package br.com.tludmyla.factory;

/**
 * @author ludmyla.toledo
 */
public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
