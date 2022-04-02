import java.util.ArrayList;
import java.util.Scanner;

public class ListStaff {
    static ArrayList<Staff> lstStaff = new ArrayList<>();
    public void inputs() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {
            Staff staff  = new Staff();
            staff.input();
            lstStaff.add(staff);
            System.out.print("Continue? (y/n):");
            choice = scanner.next();
        } while(choice.equalsIgnoreCase("y"));
    }
    public void outputs() {
        int index = 1;
        System.out.println("=== !!! ===");
        for (Staff staff : lstStaff) {
            System.out.println("=== Staff " + index + ": ===");
            staff.show();
            index++;
        }
    }
    // Salary Calculation
    public void salaryCalculation() {
        Scanner scanner = new Scanner(System.in);
        String id;
        int type;
        System.out.print("Enter an id of staff you want to calculate: ");
        id = scanner.nextLine();
        for(Staff staff : lstStaff) {
            if(staff.getId().equalsIgnoreCase(id)) {
                System.out.println("Type of staff?");
                System.out.println("1. Developer");
                System.out.println("2. Designer");
                System.out.println("3. Tester");
                System.out.println("4. Other");
                System.out.println("Choose?: ");
                type = scanner.nextInt();
                switch (type) {
                    case 1 -> {
                        int basicS, coefficientsS, otS, other, sumofS;
                        System.out.print("Enter basic salary: ");
                        basicS = scanner.nextInt();
                        System.out.print("Enter coefficients salary: ");
                        coefficientsS = scanner.nextInt();
                        System.out.print("Enter OT salary: ");
                        otS = scanner.nextInt();
                        System.out.print("Enter other salary: ");
                        other = scanner.nextInt();
                        sumofS = basicS * coefficientsS + otS + other;
                        System.out.printf("Sum of salary of %s is %d$ \n", staff.getId(), sumofS);
                        staff.setSalary(sumofS);
                        staff.setTypeOfStaff("Developer");
                    }
                    case 2 -> {
                        int basicS, coefficientsS, bonusS, other, sumofS;
                        System.out.print("Enter basic salary: ");
                        basicS = scanner.nextInt();
                        System.out.print("Enter coefficients salary: ");
                        coefficientsS = scanner.nextInt();
                        System.out.print("Enter bonus salary: ");
                        bonusS = scanner.nextInt();
                        System.out.print("Enter other salary: ");
                        other = scanner.nextInt();
                        sumofS = basicS * coefficientsS + bonusS + other;
                        System.out.printf("Sum of salary of %s is %d$ \n", staff.getId(), sumofS);
                        staff.setSalary(sumofS);
                        staff.setTypeOfStaff("Designer");
                    }
                    case 3 -> {
                        int basicS, coefficientsS, error, other, sumofS;
                        System.out.print("Enter basic salary: ");
                        basicS = scanner.nextInt();
                        System.out.print("Enter coefficients salary: ");
                        coefficientsS = scanner.nextInt();
                        System.out.print("Enter error fix salary: ");
                        error = scanner.nextInt();
                        System.out.print("Enter other salary: ");
                        other = scanner.nextInt();
                        sumofS = basicS * coefficientsS + (error * 200000) + other;
                        System.out.printf("Sum of salary of %s is %d$ \n", staff.getId(), sumofS);
                        staff.setSalary(sumofS);
                        staff.setTypeOfStaff("Tester");
                    }
                    case 4 -> {
                        int basicS, coefficientsS, sumofS;
                        System.out.print("Enter basic salary: ");
                        basicS = scanner.nextInt();
                        System.out.print("Enter coefficients salary: ");
                        coefficientsS = scanner.nextInt();
                        sumofS = basicS * coefficientsS;
                        System.out.printf("Sum of salary of %s is %d$ \n", staff.getId(), sumofS);
                        staff.setSalary(sumofS);
                        staff.setTypeOfStaff("Officer");
                    }
                }
            }
        }
    }
    public void changeInfo() {
        Scanner scanner = new Scanner(System.in);
    }
}
