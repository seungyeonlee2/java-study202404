package day07.player;

public class HighMage extends Mage {
    public HighMage(String nickName) {
        // 부모의 생성자중에 빈괄호가없어서 super만 쓰면 오류
        super(nickName);
    }
}
