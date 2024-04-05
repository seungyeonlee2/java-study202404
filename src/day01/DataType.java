package day01;

public class DataType {

    public static void main(String[] args)  {
//        정수만 가능
        // 1byte == 8bit
        // 1bit == 숫자 0이나 1을 저장할 수 있음
        // 1111 => 8 + 4 + 2 + 1 == 15
        // 0 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 == 127 (부호자리 비워놔야해서 128은 빠짐)
        // 1 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 == -127
        // 1024byte == 1kb
        // 1024kb == 1mb
        byte a = 127; //1byte

        short b = 32767; //2byte

        int c = 2147483647; //4byte

        long d = 214748364784328747L; //8byte, 출력시 L은 안나옴

        float e = 3.142555352352F; // (4byte) 더블과 구분하기 위해 접미사 F 붙여야함
        double f = 3.142555352352; // (8byte)
        double g = 100; // 가능 정수<실수
        System.out.println("e = " + e); //soutv
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        //정수 int, 실수 double 거의 사용

        boolean flag1 = false;
        boolean flag2 = 10 > 5;

        //ctrl + alt + v : 자동으로 변수타입, 변수명 알려줌
        int i = 100;
        String s = "";
        double random = Math.random();


        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);

//        문자형 char : 2byte 0~65536 (음수 표현 필요없음)
        char text = '하'; //하,가, a, b ... 1글자만 저장 가능
        char textTest = 44043;
        System.out.println("textTest = " + textTest);
        
        // 문자열: 문자 배열(String)
        char[]hello = {'안', '녕', '하', '세', '요'};
        System.out.println("new String(hello) = " + new String(hello));

        String hello2 = "안녕하세요"; //용량이 정해져있지않음, 기본타입x/클래스객체타입



    }
}
