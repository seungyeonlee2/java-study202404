package day07.player;

public class Mage extends Player {

//    String nickname;
//    int level;
//    int hp;
    int mana;

    public Mage(String nickName) {
        this.nickname = nickName;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
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
        System.out.println("# mana " + this.mana);
    }

    public void thunderbolt(Mage targets)  {

    }
}
