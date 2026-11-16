public class Cat {
    private String name;
    private int age;
    private String color;


    public Cat(String name, int age, String color) {
        this.name = name;
        if (age < 0) {
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");
        }
        if (age >= 30) {
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");

        }

        this.age = age;
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public void updateAge(int age) {
        if (age >= 30) {
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");
        }
        if (age < 0) {
            throw new IllegalArgumentException("НЕПРВИЛЬНЫЙ ВОЗРАСТ");
        }
        this.age = age;
    }


    public String getColor() {
        return this.color;
    }
}

