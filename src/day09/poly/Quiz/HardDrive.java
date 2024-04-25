package day09.poly.Quiz;

class HardDrive extends ComputerPart {

    public HardDrive(String partName, double partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Hard Drive: " + partName + ", Price: " + partPrice);
    }
}