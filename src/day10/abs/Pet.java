package day10.abs;

// abstract와 final클래스 같이 공존 x
public abstract class Pet {
    String name;
    int age;
    String kind;


    public Pet() {

    }

    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    // 산책 기능은 필요한 객체가 필요에 따라 오버라이딩 하는 것이지
    // 모두에게 강요할 필요가 없다면 굳이 추상화하지 않아도 됨
    // abstract 안붙여도 됨
    public final void walk() {
        System.out.println("산책은 무조건 공원에서만 하세요");
    }


    // 밥, 잠 기능은 필수기능이니까 없으면 객체가 불안정해지므로
    // 강요할 필요가 있으므로 추상화
    public abstract void eat();
//    {
//        System.out.println("애완동물이 밥을 먹습니다");
//        자식들이 고쳐쓸거기 때문에 sout 쓸 필요 x
//    }

    // 추상 메서드는 본문이 없는 껍데기 역할 (자식들에게 기능 이름을 통일시키기 위한 장치로만 사용)
    // 추상 메서드는 추상 클래스 안에서만 선언 가느
    // 다만 추상 클래스 내부에는 추상 메서드 이외에 모든 메서드 선언 가능
    public abstract void sleep();
}
