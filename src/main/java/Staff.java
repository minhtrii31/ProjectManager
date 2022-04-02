import java.util.Scanner;

public class Staff {
    private String id;
    private String name;
    private String email;
    private String sex;
    private String typeOfStaff;
    private int salary;

    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.print("Enter ID: ");
        setId(scanner.nextLine());
        System.out.print("Enter name: ");
        setName(scanner.nextLine());
        System.out.print("Enter email: ");
        setEmail(scanner.nextLine());
        System.out.print("Enter sex: ");
        setSex(scanner.nextLine());
    }

    public void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Sex: " + sex);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTypeOfStaff() {
        return typeOfStaff;
    }

    public void setTypeOfStaff(String typeOfStaff) {
        this.typeOfStaff = typeOfStaff;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
