package day10.inter.animal;

// 인터페이스는 여러개 구현 가능
public class BullBog extends Animal implements Pet, Aggressive {
    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void hunt(Pet pet) {

    }

    @Override
    public void violent() {

    }

    // 사냥기능

    // 난폭함

    // 애완동물로 키울 수 있음

}
