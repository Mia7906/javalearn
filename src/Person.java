import javax.naming.Name;

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

    public String getName() {
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }




    public static void main(String[] args) {

        Person person = new Person("Tom", "he has black eyes", "he is 20", "70kg");
        person.sayName();

        System.out.println(person.getName() + ".");
        person.setName("Make");
        System.out.println(person.getName());

        System.out.println(person.eyeColor);
        System.out.println(person.age);
        System.out.println(person.weight);


    }

}







