public class Car {

    public int speed;

    public Car() {
        this.speed = 0;
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
        this.speed = this.speed +10;
    }
}