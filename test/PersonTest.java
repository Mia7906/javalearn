import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    @DisplayName("getAge возвращает возраст, заданный в конструкторе")
    public void getAgeReturnsAgeFromConstructor() {
        Person person = new Person("Tom", "black", 22, 70);

        assertEquals(22, person.getAge());
    }
}
