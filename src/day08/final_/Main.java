package day08.final_;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("991111-2222222");
        Student s2 = new Student("881111-2222222");

        s.name = "홍길동";
        s.nation = "대한민국";
        s.name = "피터 홍";
        s.nation = "캐나다";

        //s.ssn = "zz"; //변경 안됨 (final 사용)
    }
}
