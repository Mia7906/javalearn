import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DogTest {

    @Test
    public  void nameTest(){
        Dog dog = new Dog("Джек", 4);
        assertEquals("Джек", dog.getName());
    }

    @Test
    public void ageTest(){
        Dog dog = new Dog("Джек", 4);
        assertEquals(4, dog.getAge());
    }


    @Test
    public void updateAge() {
        Dog dog  = new Dog("Джек", 2 );
        assertThrows(IllegalArgumentException.class, () -> dog.updateAge(-1));
    }

    @Test
    public void nameError() {
        assertThrows(IllegalArgumentException.class, () -> new Dog("Рекс", 2));
    }

    @Test
    public void updateAgeMaxError() {
        Dog dog = new Dog("Джек", 2);
        assertThrows(IllegalArgumentException.class, () -> dog.updateAge(30));
    }

















































}
