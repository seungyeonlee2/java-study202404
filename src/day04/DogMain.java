package day04;

public class DogMain {

    // int x = 20; 필드, main 안에서 참조 못함
    public static void main(String[] args) {

        // int a = 10; -->지역변수 (함수 안에서 만들어짐)
        Dog choco = new Dog("초코"); //지역변수(choco)
        Dog poppy = new Dog("뽀삐");

        System.out.println("choco = " + choco);
        System.out.println("poppy = " + poppy);

        choco.petInfo();
        System.out.println("==========================");
        poppy.inject();
        poppy.petInfo();
    }
}
