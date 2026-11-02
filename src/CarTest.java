import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {
//машина должна ехать 999 включительно. от 0 до 999
   @Test
   public void getSpeed(){
       Car car = new Car();
       assertEquals(0,car.getSpeed());

   }

    @Test
    public void updateSpeed(){
        Car car = new Car();
        car.updateSpeed(60);
        assertEquals(60,car.getSpeed());

    }

    @Test
    public void updateSpeedMinError(){
        Car car = new Car();
        assertThrows(IllegalArgumentException.class, () -> car.updateSpeed(-1));

    }

























}