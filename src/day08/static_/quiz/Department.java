package day08.static_.quiz;

public class Department {

    private String departmentName; // 학과이름, 인스턴스 변수
    private int studentCount; //학과별 학생 수, 인스턴스 변수
    private static int totalStudents; // 학교 전체 학생 수, static 변수

    public Department(String departmentName, int initCount) {
        this.departmentName = departmentName;
        this.studentCount = initCount;
        totalStudents += initCount;
    }

    public void addStudent(int number) {
        this.studentCount += number;
        totalStudents += number;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

}
