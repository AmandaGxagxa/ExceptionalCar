package the_car;
import CarExceptions.CarNotStartedException;
import CarExceptions.CarOutOfFuelException;

public class Car {

    private boolean started =  false;
    private int fuelLevel = 0;

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

    public void enterFuel() {
        fuelLevel += 20;
    }

    public boolean drive() throws CarNotStartedException, CarOutOfFuelException {

    if (!started) {
//            return false;
        throw new CarNotStartedException("The are is not started!");
    }

    if (fuelLevel <= 0) {
        started = false;
        fuelLevel = 0;
        throw new CarOutOfFuelException("There is no fuel please refill...");
//            return false;
    }

    fuelLevel -= 5;

    return true;


    }


}
