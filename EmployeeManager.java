import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter employee age: ");
        int age = input.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        String position;
        if (salary >= 20000) {
            position = "manager";
        } else {
            position = "employee";
        }

        System.out.println("EMPLOYEE");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Position: " + position);

        input.close();
    }
}
