public class Person {

    String name;
    String eyeColor;
    String age;




    public Person(String name, String eyeColor, String age) {

        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;


    }

    public static void main(String[] args) {

        Person person = new Person("Tom", "black", "20");
        System.out.println(person.name);
        System.out.println(person.eyeColor);
        System.out.println(person.age);



    }

}







