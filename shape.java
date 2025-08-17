class Shape1 {
    int length;
    int breadth;
    int height;

}

class Rectangle extends Shape1 {
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        int area = length * breadth;
        System.out.println("Area of REctangle is " + area);

    }
}

class Triangle extends Shape1 {
    Triangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    void area() {
        double area = 0.5 * breadth * height;
        System.out.println("Area of Triangle is " + area);

    }
}

class Square extends Shape1 {
    Square(int length) {
        this.length = length;
    }

    void area() {
        int area = length * length;
        System.out.println("Area of Square is " + area);

    }
}

public class Shape {
    public static void main(String args[]) {

        Rectangle r = new Rectangle(4, 8);
        r.area();
        Square s = new Square(6);
        s.area();
        Triangle t = new Triangle(4, 6);
        t.area();

    }
}
