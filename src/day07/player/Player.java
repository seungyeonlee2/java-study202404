package day07.player;

import java.util.Scanner;

// 상위 클래스 (super class)
// : 공통 속성(field)과 기능(method)을 가진 부모 클래스
// 자동으로 Object 상속받음
public class Player  {

    //공통필드, 공통기능
    String nickname;
    int level;
    int hp;
    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n========= Character's Info =========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}
