import javax.naming.Name;
public class Person {

    String name;
    String eyeColor;
    int age;
    int weight;
    //шаблон класса

    public Person(String name, String eyeColor, int age, int weight) {

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
    public void setAge(int newAge){
        if(this.age>newAge){
            throw new IllegalArgumentException("возраст не может быть меньше текущего ");
        }
        this.age = newAge;

    }
    public int getAge(){
        return this.age;

    }


    // 1.  создать метод получения веса
//2. создать метод изменения веса
//3. добавить условие
    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        if (this.weight<0){
            throw new IllegalArgumentException("вес не может быть меньше 0");
        }
    }

    public static void main(String[] args) {


        Person person = new Person("Tom", " black eyes", 22, 70);
        person.sayName();
        person.sayEyeColor();
        person.sayAge();
        person.sayWeight();



        System.out.println(person.getName() + ".");
        person.setName("Make");
        System.out.println(person.getName());

        System.out.println(person.getEyeColor() + " изменился на ");
        person.setEyeColor("pink");
        System.out.println(person.getEyeColor());

        System.out.println(person.getAge());
        person.setAge(22);
        System.out.println(person.getAge());

        System.out.println(person.getWeight());
        person.setWeight(0);
        System.out.println(person.getWeight());


}

}






