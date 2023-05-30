package ch14;

class CarThread extends Thread {
    private String who;
    private SharedCar car;
    private String where;

    public CarThread(String who, SharedCar car, String where) {
        this.who = who;
        this.car = car;
        this.where = where;
    }

    public void run() {
        car.drive(who, where);
    }
}
public class SynchroDemo {
    public static void main(String[] args) {
        SharedCar car = new SharedCar();
        new CarThread("김혜수", car, "서울").start();
        new CarThread("전지현", car, "서울").start();
        new CarThread("한소희", car, "서울").start();
    }
}
