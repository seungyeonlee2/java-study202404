package day10.abs;

public class Main {
    public static void main(String[] args) {

//        Pet pet1 = new Pet();
//        new Pet();
        Dog myDog = new Dog();
        Dog myDog1 = new Dog();
        Dog myDog2 = new Dog();
        Cat myCat = new Cat();
        Cat myCat1 = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();

        Pet[] petList = {myDog, myDog1, myDog2, myCat, myCat1, myCat2, myCat3};
//        myDog.eat();
//        myCat.sleep();
//        myDog.takeNap();

        for (Pet pet : petList) {
            pet.eat();
        }
    }
}
