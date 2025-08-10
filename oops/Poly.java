// compile-time polymorphism or Method overloading

class Polymorph {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("Name is " + name);
    }

    public void printInfo(int age) {
        System.out.println("Age is " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Name is " + name + " and Age is " + age);
    }
}

public class Poly {
    public static void main(String args[]) {
        Polymorph p = new Polymorph();
        p.name = "Arun Murthy";
        p.age = 34;
        p.printInfo(p.name); //calls string MEthod
        p.printInfo(p.age); //calls int method
        p.printInfo(p.name, p.age); //calls string,int method
    }
}
