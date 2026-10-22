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

    public void sayName(){
        System.out.println("My name is " + name );
    }
    public void sayEyeColor(){
        System.out.println(eyeColor);
    }
    public void sayAge(){
        System.out.println(age);
    }
    public void sayWeight(){
        System.out.println(weight);
    }




    public static void main(String[] args) {

        Person person = new Person("Tom", "he has black eyes", "he is 20", "70kg");
        System.out.println(person.name);
        System.out.println(person.eyeColor);
        System.out.println(person.age);
        System.out.println(person.weight);


    }

}







