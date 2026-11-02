import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {
    //машина должна ехать 999 включительно. от 0 до 999
    @Test
    public void getSpeed() {
        Car car = new Car("black");
        assertEquals(0, car.getSpeed());

    }

    @Test
    public void updateSpeed() {
        Car car = new Car("black");
        car.updateSpeed(0);
        assertEquals(0, car.getSpeed());

    }

    @Test
    public void updateSpeedMinError() {
        Car car = new Car("black");
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed(-1));

    }

    @Test
    public void updateSpeedMaxError() {
        Car car = new Car("black"); //создали новый объект со скоросью 0
        car.updateSpeed(999);// установить скорость объекту
        assertEquals(999, car.getSpeed());

    }

    @Test
    public void updateSpeedMaxError3() {
        Car car = new Car("black");
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed(1000));

    }

    @Test
    public void updateSmallSpeed() {
        Car car = new Car("black");
        car.updateSpeed10();
        assertEquals(10, car.getSpeed());
    }

    @Test
    public void updateLimitSpeed() {
        Car car = new Car("black");
        car.updateSpeed(997);
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed10());
    }

    @Test
    public void carsColor(){
        Car car = new Car("black");
        assertEquals("black", car.getColor());
    }

















}