class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String course;
    public Student(String name, int age, String course) {
        super(name, age); 
        this.course = course;
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Course: " + course);
        System.out.println("\n-----------------\n");
    }
}

class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("\n-----------------\n");
    }
}

public class exp6 {
    public static void main(String[] args) {
         Student student = new Student("Varnit", 20, "Computer Science");
         System.out.println("Student Details:");
         student.displayInfo(); 
 
         Teacher teacher = new Teacher("XYZ", 40, "Mathematics");
         System.out.println("Teacher Details:");
         teacher.displayInfo(); 
    }
}
