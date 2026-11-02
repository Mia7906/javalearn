public class Car {

    public int speed;

    public Car() {
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }
    public void updateSpeed(int newSpeed){
        if (newSpeed <=0){
            throw new IllegalArgumentException("скорость не может быть меньше 0");

        }


        this.speed = newSpeed;

    }













}