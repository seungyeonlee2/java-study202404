package day04;

import java.util.Scanner;

public class FieldAndLocal {
    // 필드는 값을 초기화 하지 않아도
    // 각 타입으 기본값으로 자동 세팅
    // 정수:0, 실수: 0.0, 논리: false, 문자(char): '', 나머지: null
    String aaa;

    // ccc: 매개변수 (parameter) - 매서드 호출 시 반드시 필요한 인자값
    void foo(int ccc) {
        int bbb = 20;

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
