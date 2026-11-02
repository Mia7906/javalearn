import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {
    //машина должна ехать 999 включительно. от 0 до 999
    @Test
    public void getSpeed() {
        Car car = new Car("black", "Ferrari", 160);
        assertEquals(0, car.getSpeed());

    }

    @Test
    public void updateSpeed() {
        Car car = new Car("black", "Ferrari", 160);
        car.updateSpeed(0);
        assertEquals(0, car.getSpeed());

    }

    @Test
    public void updateSpeedMinError() {
        Car car = new Car("black", "Ferrari", 160);
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed(-1));

    }

    @Test
    public void updateSpeedMaxError() {
        Car car = new Car("black", "Ferrari", 160); //создали новый объект со скоросью 0
        car.updateSpeed(160);// установить скорость объекту
        assertEquals(160, car.getSpeed());

    }

    @Test
    public void updateSpeedMaxError3() {
        Car car = new Car("black", "Ferrari", 180);
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed(181));

    }

    @Test
    public void updateSpeedMaxError4() {
        Car car = new Car("black", "Ferrari", 80);
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed(81));

    }

    @Test
    public void updateSmallSpeed() {
        Car car = new Car("black", "Ferrari", 160);
        car.updateSpeed10();
        assertEquals(10, car.getSpeed());
    }

    @Test
    public void updateLimitSpeed() {
        Car car = new Car("black", "Ferrari", 160);
        car.updateSpeed(157);
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed10());
    }

    @Test
    public void carsColor() {
        Car car = new Car("black", "Ferrari", 160);
        assertEquals("black", car.getColor());
    }

    @Test
    public void updateColor() {
        Car car = new Car("black", "Ferrari", 160);
        car.updateColor("pink");
        assertEquals("pink", car.getColor());
    }

    @Test
    public void carsFirm() {
        Car car = new Car("black", "Ferrari", 160);
        assertEquals("Ferrari", car.getFirm());
    }

    @Test
    public void limitMaxSpeed() {
        assertThrows(IllegalArgumentException.class, () -> new Car("black", "Ferrari", 0));
    }




















}