package day09.poly.car;

public class CarShop {

    // 돈을 주면 자동차를 출고하는 기능
    public Car exportCar (int mooney) {
        if (mooney == 6000) {
            return new Mustang();
        } else if (mooney == 4000) {
            return new Tucson();
        } else if (mooney == 3000) {
            return new Sonata();
        } else {
            return null;
        }
    }
}
