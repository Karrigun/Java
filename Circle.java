import java.util.Scanner;

class Circle {
    int radius;
    int area;

    public void init(int radius) {
        this.radius = radius;
    }

    public void area() {
        this.area = radius * radius * 22 / 7;
    }

    public void display() {
        System.out.println("The area of circle is " + area);
    }

    public static void main(String[] args) {
        int radius;
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = cc.nextInt();
        Circle sc = new Circle();
        sc.init(radius);
        sc.area();
        sc.display();
        cc.close();

    }
}