class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Traingle extends Shape {
    public void area(int l, int h) {
        System.out.print((1.0 / 2) * l * h);
    }
}

public class Inherit {
    public static void main(String args[]) {
        Traingle t = new Traingle();
        t.area();
        t.area(4, 7);
    }

}
