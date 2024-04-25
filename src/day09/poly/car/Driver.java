package day09.poly.car;

public class Driver {
    //상위타입 Car > 모든자동차 운전 가능
    public void drive(Car car) {

        String carName = "";
        if (car instanceof Sonata) {
            carName = "쏘나타";
        } else if (car instanceof Tucson) {
            carName = "투쌈";
        } else if (car instanceof Mustang) {
            carName = "머스탱";
        }

        System.out.println("운전을 시작합니다.");
        car.accelerate();

    }
}
