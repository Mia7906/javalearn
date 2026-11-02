import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

   @Test
   public void SetMax_speed(){
       Car car = new Car("Toyota", "Black", 300);
       assertThrows(IllegalArgumentException.class, () -> car.setMax_speed(0));
   }





























}