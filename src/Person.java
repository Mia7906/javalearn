public class Person {

    String name;
    String eyeColor;
    String age;
    String weight;



    public Person(String name, String eyeColor, String age, String weight) {

        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
        this.weight = weight;

    }

    public static void main(String[] args) {

        Person person = new Person("Tom", "he has black eyes", "he is 20", "70kg");
        System.out.println(person.name);
        System.out.println(person.eyeColor);
        System.out.println(person.age);
        System.out.println(person.weight);


    }

}







