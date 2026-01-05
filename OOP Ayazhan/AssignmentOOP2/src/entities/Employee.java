package entities;
import interfaces.IWorkable;
import interfaces.IStudiable;

public class Employee extends Human implements IWorkable, IStudiable {
    private String position;
    private float salary;
    public static String company = "IT Company";

    public Employee(int age, String name, boolean isMarried, String position, float salary) {
        super(age, name, isMarried);
        this.position = position;
        this.salary = salary;
    }


    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + ", " + position + ", Salary: $" + salary);
    }


    @Override
    public void work() {
        System.out.println(name + " is working as " + position);
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " is on break");
    }


    @Override
    public void study() {
        System.out.println(name + " is studying for work");
    }

    @Override
    public void takeExam() {
        System.out.println(name + " is taking work exam");
    }


    public String getPosition() { return position; }
    public float getSalary() { return salary; }
    public void setPosition(String position) { this.position = position; }
    public void setSalary(float salary) { this.salary = salary; }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I work as " + position);
    }
}