package day12.io.obj;

import java.io.Serializable;

// Serializable: 객체를 입출력하기 위해 직렬화해주는 인터페이스
public class Snack implements Serializable {

    public enum Taste {
        GOOD, BAD, SOSO
    }


    private String snackName;
    private int year; //출시 연도
    private int price; //가격
    private Taste taste; //맛

}
