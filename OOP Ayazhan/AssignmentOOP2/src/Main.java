import entities.Human;
import entities.Student;
import entities.Employee;
import interfaces.IWorkable;
import interfaces.IStudiable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ASSIGNMENT 2 DEMO ===\n");

        // 7) ПОЛИМОРФИЗМ: разные типы ссылок
        System.out.println("1. Student as Human reference:");
        Human studentAsHuman = new Student(20, "John", false, "CS", 3.8f);
        studentAsHuman.showDetails();

        System.out.println("\n2. Student as IStudiable reference:");
        IStudiable studentAsInterface = new Student(21, "Jane", false, "Math", 4.0f);
        studentAsInterface.study();

        System.out.println("\n3. Employee as Human reference:");
        Human empAsHuman = new Employee(30, "Alex", true, "Developer", 60000);
        empAsHuman.showDetails();

        System.out.println("\n4. Employee as IWorkable reference:");
        IWorkable empAsWorkable = new Employee(35, "Anna", true, "Manager", 80000);
        empAsWorkable.work();

        System.out.println("\n5. Employee as IStudiable reference:");
        IStudiable empAsStudiable = new Employee(28, "Mike", false, "Designer", 55000);
        empAsStudiable.study();

        // 8) Используем ВСЕ методы
        System.out.println("\n=== USING ALL METHODS ===");

        Student s = new Student(22, "Bob", false, "Physics", 3.5f);
        Employee e = new Employee(40, "Lisa", true, "Engineer", 70000);

        System.out.println("\n--- Student methods ---");
        s.introduce();
        s.showDetails();
        s.showId();
        s.study();
        s.takeExam();
        s.showAge();

        System.out.println("\n--- Employee methods ---");
        e.introduce();
        e.showDetails();
        e.work();
        e.takeBreak();
        e.study();
        e.takeExam();

        // Показываем protected поля
        System.out.println("\n--- Protected fields access ---");
        System.out.println("Student name: " + s.getName());
        System.out.println("Employee age: " + e.getAge());

        scanner.close();
    }
}