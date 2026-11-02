public class Car {

    public int speed;
    String color;



    public Car(String color) {
        this.speed = 0;
        this.color = color;
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
}