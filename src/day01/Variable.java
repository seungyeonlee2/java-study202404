
//      폴더명이랑 같게 (지우면 안됨)
package day01;
//             파일명이랑  같게!!,대문자,띄어쓰기필요하면카멜케이스사용
public class Variable {

    public static void main(String[] args) {

        int score = 78; //숫자저장(정수만)
        String userName = "홍길동"; //문자열 (String)

//        변수명 중복(첫글자는 소문자), 명사로 짓기 x
//        대소문자 구분
//        변수 형식 정확하게 쓰기
//        숫자로 시작 xx (123name)
//        공백허용 xx(대체하기:카멜케이스쓰기-userName 같은)
//        키워드는 식별자로 x
//        변수명 의미있게
//        함수(매서드)- 소문자시작, 동사형식으로 네이밍

//        변수의 스코프 - 블록레벨 스코프
//        자바의 변수는 생성된 블록이 종료되면 메모리에서 사라짐
        int i = 100;
        for (int j = 0; i < 5; i++) {
            System.out.println(i);
        }  //end for - int j는 for문 나가면 사라짐

        int n1 = 10;

        if (true) {
            System.out.println(n1);
            int n2 = 20;

            while(true) {
                System.out.println(n2);
                int n3 = 30;
                break;
            } System.out.println(n2); //n2 쓸수있음
        } // System.out.println(n2); - n2생성 블록 밖이라 n2사용 못함, 상위 블록으로 이동 시 사용가능
    } //end main - main을 나가면 i는 사라짐


} //end class
