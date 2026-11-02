public class Car {

    String name;
    String color;
    int max_speed;

    public Car(String name, String color, int max_speed) {
        this.name = name;
        this.color = color;
        this.max_speed = max_speed;
    }

    public void sayName() {
        System.out.println("Название машины: " + name);
    }

    public void sayColor() {
        System.out.println("Цвет машины: " + color);
    }

    public void sayMax_speed() {
        System.out.println("Максимальная скорость машины: " + max_speed);
    }

    public int getMax_speed() {
        return this.max_speed;
    }

    public void setMax_speed(int newMax_speed) {
        if (newMax_speed <= 0) {
            throw new IllegalArgumentException("Максимальная скорость не может быть 0 ");
        } else if (newMax_speed >= 1200) {
            throw new IllegalArgumentException("Максимальный рекорд 1228км.ч. ");
        }
        this.max_speed = newMax_speed;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Black", 300);
        car.sayName();
        car.sayColor();
        car.sayMax_speed();
    }

}

