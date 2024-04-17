package day07.player;

//player에 있는 모든 기능 상속
// 하위클래스 (sub class)
// : 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스

//워리어는 플레이어로부터 확장한다 (플레이어 + 워리어기능)
// x is a y 했을때 의미가 맞으면...?(확장개념)
// 상속을 하면 부모 클래스의 필드와 매서드만 자식클래스에 상속됨
public class Warrior extends Player{

    /**
     * 공통 필드 생략
     * String nickname;
     * int level;
     * int hp;
     */
    int rage; //분노게이지

    // 닉네임만 외부에서 결정
    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }

    // 현재 캐릭터 정보를 출력 (부모에서 상속받음)
//    public void showStatus() {
//        System.out.println("\n========= Character's Info =========");
//        System.out.println("# name: " + this.nickname);
//        System.out.println("# level: " + this.level);
//        System.out.println("# hp: " + this.hp);
//    }

    public void dash(Warrior target) {
        System.out.printf("DASH 스킬을 사용합니다.");
    }

    // 오버라이딩: 부모가 물려준 메서드를 고쳐 쓰는 것.
    // 규칙: 부모가 물려준 형태를 유지할 것 (파라미터, 리턴타입, 이름)
    //       접근제한자는 부모보다 more public할 것!
    @Override // 오버라이딩 룰을 지켰는지 검증
    //부모가 퍼블릭 - 오버라이딩 시 자식도 퍼블릭
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage " + this.rage);
    }
}

