import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    @DisplayName("getAge возвращает возраст, заданный в конструкторе")
    public void getAgeReturnsAgeFromConstructor() {
        Person person = new Person("Tom", "black", 22, 70);

        assertEquals(22, person.getAge());
    }

    @Test
    public void checkSetAge() {
        Person person = new Person("Tom", "black", 22, 70);
        person.setAge(33);
        assertEquals(33, person.getAge());
    }
 @Test
    public void checkSetAge2() {
        Person person = new Person("Tom", "black", 22, 70);
        person.setAge(199);
        assertEquals(199, person.getAge());
    }

    @Test
    public void SetAgeThrow() {
        Person person = new Person("Tom", "black", 22, 70);
        assertThrows(IllegalArgumentException.class,()->person.setAge(200));

    }
@Test
    public void SetWeight(){
        Person person = new Person("Tom", "black", 22, 70);
        assertThrows(IllegalArgumentException.class,()->person.setWeight(-1));
}
@Test
    public void SetWeight2(){
        Person person = new Person("Tom", "black", 22, 70);
        assertThrows(IllegalArgumentException.class,()->person.setWeight(1000));
}


}