import java.io.*;
import java.util.*;

class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() { return empNo; }
    public String getEmpName() { return empName; }
    public int getEmpBasic() { return empBasic; }

    @Override
    public String toString() {
        return empNo + "," + empName + "," + empBasic;
    }
}

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        int empNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Basic Salary: ");
        int empBasic = sc.nextInt();

        Employee emp = new Employee(empNo, empName, empBasic);

        try {
            FileWriter fw = new FileWriter("emp.txt");
            fw.write(emp.toString());
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            String line;
            System.out.println("\nEmployee Details from File:");
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                System.out.println("Emp No: " + details[0]);
                System.out.println("Emp Name: " + details[1]);
                System.out.println("Emp Basic: " + details[2]);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}
