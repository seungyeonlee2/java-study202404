package day07.inherit.Practice;

public class Smartphone extends ElectronicProduct {


    int storageCapacity;

    // 생성자이름=클래스이름
    public Smartphone (String productName, double price,  String manufacturer, int storageCapacity) {
        // 초기화
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("저장 용량: %d GB\n", this.storageCapacity);
    }
}
