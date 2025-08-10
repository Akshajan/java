class Shape1 {
    int length;
    int breadth;
    int height;
    int area;

    public void area() {
        System.out.println("Area is " + area);
    }
}

class Rectangle extends Shape1 {
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }
}

class Square extends Shape1 {
    Square(int length) {
        this.length = length;
        this.area = length * length;
    }
}

class Triangle extends Shape1 {
    Triangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
        this.area = (breadth * height) / 2;
    }
}

public class Test {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(4, 8);
        r.area(); // Output: Area is 32
        Square s = new Square(7);
        s.area();
        Triangle t = new Triangle(12, 6);
        t.area();

    }
}
