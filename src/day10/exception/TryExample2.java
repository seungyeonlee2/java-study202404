package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    /*
                 Object
                    |
                Throwable
                /       \
             Error     Exception (예외 정보를 가지고 있는 객체)


     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1: ");
            int n1 = Integer.parseInt(sc.next()); // NumberFormatException

            System.out.print("정수2: ");
            int n2 = sc.nextInt(); // InputMismatchException

            int result = n1 / n2; // ArithmeticException
            System.out.println("result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하시라니까요~?");
        } catch (NumberFormatException e) {
            System.out.println("문자로 변환할 수 없는 숫자입니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace(); //에러 로그를 띄음 -
        }

        System.out.println("프로그램 정상 종료!");
    }
}
