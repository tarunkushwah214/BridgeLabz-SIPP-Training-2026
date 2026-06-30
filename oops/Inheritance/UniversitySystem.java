class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

class Student extends Person {
    private final String studentId;   // final attribute
    protected double gpa;

    // Constructor using super()
    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() +
                ", Student [ID=" + studentId +
                ", GPA=" + gpa + "]";
    }
}

// Derived class
class GradStudent extends Student {
    private String thesis;

    // Constructor using super()
    public GradStudent(String name, int age, String studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() +
                ", GradStudent [Thesis=" + thesis + "]";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Alice", 24, "GS101", 9.2, "Artificial Intelligence");

        // Display object
        System.out.println(gs);

        // Demonstrate IS-A relationship
        Person p = gs;      // GradStudent IS-A Person
        Student s = gs;     // GradStudent IS-A Student

        System.out.println("\nIS-A Relationship:");
        System.out.println("GradStudent as Person: " + p);
        System.out.println("GradStudent as Student: " + s);
    }
}