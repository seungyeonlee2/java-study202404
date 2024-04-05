//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//                     이름은반드시main
    public static void main(String[] args) {

        System.out.println(10+5);
//                     문자는 반드시 "" 안에
        System.out.println("하이");


        int month = 5;
        int day = 5;
        String anni = "어린이날";

//        sout(단축키)
        System.out.println(month + "월은 " + day + "일은 " + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.", month, day, anni);

//        ctrl+d : 복사, ctrl+x : 줄삭제
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.printf("%d월 %d일은 %s입니다.", month, day, anni);



    }

}