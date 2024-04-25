package day09.poly.car;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

//        Sonata[] sArr = {sonata1, sonata2, sonata3};
//        for (Sonata sonata : sArr) {
//            sonata.accelerate();
//        }

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

//        Tucson[] tArr = {tucson1, tucson2, new Tucson()};

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tucson1, mustang1, mustang2};
        for (Car car : cArr) {
            car.accelerate();
        }

//        String[] sArr = {"abc", "def", 100, false};
        Object[] sArr = {"abc", "def", 100, false, new Tucson()};

        System.out.println("==================================");

        Driver driver = new Driver();
        driver.drive(new Tucson());

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("===================");
        CarShop shop = new CarShop();

        // 객체타입에서 다운캐스팅의 전제조건: 반드시 상속관계가 있어야 하며
        // 자식 객체가 부모 타입으로 업캐스팅 된 것만 내릴 수 있음
        // 즉, 부모 객체를 자식 타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);
        car.accelerate();
        car.joinSonataClub();

        System.out.println("=================================");

        // 강제 캐스팅을 해도 부모를 자식한테 캐스팅 할 수 없음
//        Sonata ccc = (Sonata) new Car();
        // 형제는 상속x
//        Sonata mmm =(Sonata) new Mustang();

        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;

        System.out.println("==================");

        driver.drive(new Sonata());

        Sonata sonata = new Sonata();
        sonata.accelerate();

        Tucson tucson = new Tucson();
        tucson.accelerate();
    }
}
