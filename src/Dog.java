public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        if (!name.equals("Джек")){
            throw new IllegalArgumentException("НЕПРАВИЛЬНОЕ ИМЯ");
        }

        if (age < 0){
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");
        }
        if (age >= 30){
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");
        }
        this.age = age;
    }

    public void updateAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");
        }
        if (age >= 30){
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }

}
