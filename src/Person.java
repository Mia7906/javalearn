import javax.naming.Name;
public class Person {

    String name;
    String eyeColor;
    String age;
    String weight;
    //шаблон класса

    public Person(String name, String eyeColor, String age, String weight) {

        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
        this.weight = weight;
    }
//конструктор

    public void sayName() {
        System.out.println("My name is " + name);
    }

    public void sayEyeColor() {
        System.out.println("i have " + eyeColor);
    }

    public void sayAge() {
        System.out.println("i'm " + age);
    }

    public void sayWeight() {
        System.out.println(weight);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
//методы

    public String getEyeColor() {
        return this.eyeColor;
    }
    public void setEyeColor(String newEyeColor) {
        this.eyeColor = newEyeColor;
    }




    public static void main(String[] args) {

        Person person = new Person("Tom", " black eyes", "20", "70kg");
        person.sayName();
        person.sayEyeColor();
        person.sayAge();
        person.sayWeight();



        System.out.println(person.getName() + ".");
        person.setName("Make");
        System.out.println(person.getName());

        System.out.println(person.getEyeColor() + "изменился на ");
        person.setEyeColor("pink");
        System.out.println(person.getEyeColor());
    }

}






