import org.jspecify.annotations.Nullable;

public class Car {

    private final String brand;
    public int speed;
    String color;



    public Car(String color, String brand) {
        this.speed = 0;
        this.color = color;
        this.brand = brand;
    }

    public int getSpeed() {
        return this.speed;
    }
    public void updateSpeed(int newSpeed){
        if (newSpeed < 0){
            throw new IllegalArgumentException("скорость не может быть меньше 0");

        }
        else if (newSpeed >=1000){
            throw new IllegalArgumentException("Достигнута MAX скорость ");
        }

        this.speed = newSpeed;

    }


    public void updateSpeed10() {
       int newSpeed = this.speed +10;
        this.updateSpeed(newSpeed);
    }


    public String getColor() {
        return this.color;
    }

    public void updateColor(String color) {
        this.color = color;
    }

    public  String getFirm() {
        return this.brand;
    }
}