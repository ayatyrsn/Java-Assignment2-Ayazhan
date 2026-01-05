package entities;
import interfaces.IStudiable;

public final class Student extends Human implements IStudiable {
    private String major;
    private float gpa;
    private final String id = "STU001";

    public Student(int age, String name, boolean isMarried, String major, float gpa) {
        super(age, name, isMarried);
        this.major = major;
        this.gpa = gpa;
    }

    // Финальный метод
    public final void showId() {
        System.out.println("My ID: " + id);
    }

    // Реализуем абстрактный метод из Human
    @Override
    public void showDetails() {
        System.out.println("Student: " + name + ", " + age + " years, GPA: " + gpa);
    }

    // Реализуем интерфейс IStudiable
    @Override
    public void study() {
        System.out.println(name + " is studying " + major);
    }

    @Override
    public void takeExam() {
        System.out.println(name + " is taking exam");
    }

    // Старые методы БЕЗ изменений
    public String getMajor() { return major; }
    public float getGpa() { return gpa; }
    public void setMajor(String major) { this.major = major; }
    public void setGpa(float gpa) { this.gpa = gpa; }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study " + major);
    }
}