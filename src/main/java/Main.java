import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        ListStaff ls = new ListStaff();
        int choice = 0;
        while(choice != 4) {
            System.out.println("-------------------");
            System.out.println("1. Enter list staff");
            System.out.println("2. Show staff");
            System.out.println("3. Salary calculation");
            System.out.println("4. Exit");
            System.out.println("-------------------");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    ls.inputs();
                }
                case 2 -> {
                    ls.outputs();
                }
                case 3 -> {
                    ls.salaryCalculation();
                }
            }
        }
    }
}
