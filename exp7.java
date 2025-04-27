
interface PersonInfo {
    void displayInfo();
}

class Student implements PersonInfo {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("\n-----------------\n");
    }
}

class Teacher implements PersonInfo {
    String name;
    int age;
    String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
    @Override
    public void displayInfo() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("\n-----------------\n");
    }
}


public class exp7 {
    public static void main(String[] args) {
        PersonInfo student = new Student("Varnit", 20, "Computer Science");
        student.displayInfo(); 
        PersonInfo teacher = new Teacher("XYZ", 40, "Mathematics");
        teacher.displayInfo();

    }
}
