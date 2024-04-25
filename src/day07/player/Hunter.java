package day07.player;

public class Hunter extends Player {

//    String nickname;
//    int level;
//    int hp;
    int concentration; // 집중력

    public Hunter(String nickname) {
        super(nickname);
//        this.level = 1;
//        this.hp = 50;
        this.concentration = 10;
    }

    // 현재 캐릭터 정보를 출력
//    public void showStatus() {
//        System.out.println("\n======= Character's Info ========");
//        System.out.println("# name: " + this.nickname);
//        System.out.println("# level: " + this.level);
//        System.out.println("# hp: " + this.hp);
//    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration " + this.concentration);
    }
}
