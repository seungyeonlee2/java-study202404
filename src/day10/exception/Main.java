package day10.exception;

public class Main {
    public static void main(String[] args) {
        ThrowsExample te = new ThrowsExample();
//        int n = te.inputNumber();
//        System.out.println("n = " + n);


//        try {
//            int n = te.convert("100");
//            System.out.println("n = " + n * 20);
//        } catch (NumberFormatException e) {
//            System.out.println("");
//        }

        LoginUser user = new LoginUser("abc1234", "1234");

//        user.loginValidate("abc1234","1234");
    }
}
