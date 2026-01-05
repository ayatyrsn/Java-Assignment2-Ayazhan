package entities;

public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isMarried;

    public Human(int age, String name, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
    }

    public abstract void showDetails();


    public int getAge() { return age; }
    public String getName() { return name; }
    public boolean isMarried() { return isMarried; }

    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setMarried(boolean married) { isMarried = married; }

    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }

    public void showAge() {
        System.out.println(name + " is " + age + " years old");
    }
}