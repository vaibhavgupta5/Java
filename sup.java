class Student{
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

 class section extends Student {
    String sec;
    section(String name, int rollNo, String sec) {
    super(name, rollNo);
    this.sec = sec;
    }

    void displayInfo() {
    super.displayInfo();
    System.out.println("Section: " + sec);
    }
}


public class sup {
    public static void main(String[] args) {
        section student = new section("Alice", 101, "A");
        student.displayInfo();
    }
}
