class pen {
    String color;
    String type;

    public void PrintColor() {
        System.out.println("This pen is " + this.color + " color");
    }

    public void PrintType() {
        System.out.println("This pen is of " + this.type + " type");
    }
}

class Student {
    String name;
    int age;
    int roll_no;

    public void printInfo() {
        System.out.println("Student Name is " + this.name);
        System.out.println("Student Roll Number is " + this.roll_no);
        System.out.println("Student Age is " + this.age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        this.roll_no = s2.roll_no;
    }

    Student() {

    }
}

public class Pen1 {
    public static void main(String args[]) {
        // pen p1 = new pen();
        // p1.color = "Blue";
        // p1.type = "Gel";
        // p1.PrintColor();
        // p1.PrintType();

        // pen p2 = new pen();
        // p2.color = "Blue";
        // p2.type = "Gel";
        // p2.PrintColor();
        // p2.PrintType();

        Student s1 = new Student();
        s1.name = "Abhay";
        s1.roll_no = 1;
        s1.age = 23;
        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
