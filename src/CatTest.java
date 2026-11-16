import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CatTest {

    @Test
    public void getAge() {
        Cat cat = new Cat("Пушок", 5, "black");
        assertEquals(5, cat.getAge());
    }

    @Test
    public void updateAge() {
        Cat cat = new Cat("Пушок", 5, "black");
        cat.updateAge(7);
        assertEquals(7, cat.getAge());

    }

    @Test
    public void updateAgeMinError() {
        Cat cat = new Cat("Пушок", 6, "black");
        assertThrows(IllegalArgumentException.class, () -> cat.updateAge(10000));
    }

    @Test
    public void catColor(){
        Cat cat = new Cat("Пушок", 4, "black");
        assertEquals("black", cat.getColor());
    }
























}