public class Car {

    private final String brand;
    private final int maxSpeed;
    public int speed;
    String color;

    private static final int MIN_SPEED = 0;

    public Car(String color, String brand, int maxSpeed) {
        this.speed = MIN_SPEED;
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;

        if (maxSpeed <= MIN_SPEED ) {
            throw new IllegalArgumentException("Недопустимо");
        }
    }

    public int getSpeed() {
        return this.speed;
    }


    public void updateSpeed(int newSpeed) {

        if (newSpeed < MIN_SPEED) {
            throw new IllegalArgumentException("скорость не может быть меньше 0");

        }
        if (newSpeed > this.maxSpeed) {
            throw new IllegalArgumentException("Достигнута MAX скорость ");
        }

        this.speed = newSpeed;

    }

    public void updateSpeed10() {
        int newSpeed = this.speed + 10;
        this.updateSpeed(newSpeed);
    }


    public String getColor() {
        return this.color;
    }

    public void updateColor(String color) {
        this.color = color;
    }

    public String getFirm() {
        return this.brand;
    }


}