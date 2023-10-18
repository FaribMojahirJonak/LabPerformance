import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<3; i++) {
            System.out.println("Enter your details");
            System.out.println("Enter employee id: ");
            int employeeID = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name: ");
            String employeeName = sc.nextLine();
            System.out.println("Enter date of birth: (yyyy/MM/dd");
            String dateOfBirth = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            System.out.println("Enter joining date: (yyyy/MM/dd");
            String joiningDate = sc.nextLine();

            System.out.println("Enter current year: ");
            int year = sc.nextInt();
            sc.nextLine();
            boolean isLeapYear = year % 4 == 0;

            System.out.println("Employee type: (Officer, Staff)");
            String employeeType = sc.nextLine();

            System.out.println("Employee type: "+employeeType);
            System.out.println("Employee name: "+employeeName);
            System.out.println("Employee id: "+employeeID);
            System.out.println("Employee Email: "+email);
            System.out.println("Employee Date of birth: "+dateOfBirth);
            System.out.println("Employee Joining Date: "+joiningDate);

            CalculateLeave employee = new CalculateLeave(employeeType, joiningDate, isLeapYear, year);
            employee.calculateLeave();

        }
    }
}
