package day07.inherit.Practice;

public class ElectronicProduct {
    //공통필드, 공통기능
    String productName;
    double price;
    String manufacturer;

//    %.(숫자)f원 > 소수점 (숫자)번째짜리 까지 출력
    public void displayInfo() {
        System.out.printf("%s, 가격: %.0f원, 제조사: %s\n",
                this.productName, this.price, this.manufacturer);
    }
}
