// import bank;
// import bank.bank.Bank;

class Employee1 {
    private String name;
    private int age;
    // private int salary;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (n.length() > 8) {
            n = n.substring(0, 8);
        }
        name = n;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int a) {
        if (a >= 18) {
            age = a;
        } else {
            age = 0;
        }
    }

    public Employee1(){
        System.out.println("Constructer is called");
    }

}

public class Employee {
    public static void main(String args[]) {
        Employee1 e = new Employee1();
    
        e.setName("Akshajanardhan");
        System.out.println("Employee name is " + e.getName());
        e.setAge(17);
        System.out.println("Employee Age is " + e.getAge());
        Employee1 e1= new Employee1();
        // bank.Bank obj = new bank.Bank();
        // String s = obj.name[1];
        // System.out.print(s);
    }

}
