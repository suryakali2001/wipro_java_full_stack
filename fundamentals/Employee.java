package Empolyee;
import java.util.Scanner;
public class Employee {

    private int Empno;
    private String Empname;
    private String JoinDate;

    // Setter methods
    public void setEmpno(int empno) {
        this.Empno = empno;
    }

    public void setEmpname(String empname) {
        this.Empname = empname;
    }

    public void setJoinDate(String joinDate) {
        this.JoinDate = joinDate;
    }

    // Getter methods
    public int getEmpno() {
        return Empno;
    }

    public String getEmpname() {
        return Empname;
    }

    public String getJoinDate() {
        return JoinDate;
    }

    // Method to set all details
    public void setDetails(int empno, String empname, String joinDate) {
        setEmpno(empno);
        setEmpname(empname);
        setJoinDate(joinDate);
    }

    // Method to get/print details
    public void getDetails() {
        System.out.println("Employee Number: " + Empno);
        System.out.println("Employee Name: " + Empname);
        System.out.println("Join Date: " + JoinDate);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Employee Number: ");
        int empno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String empname = sc.nextLine();

        System.out.print("Enter Join Date (YYYY-MM-DD): ");
        String joinDate = sc.nextLine();

        e.setDetails(empno, empname, joinDate);
        System.out.println("\nEmployee Details:");
        e.getDetails();

        sc.close();
    }
}
