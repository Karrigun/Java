import java.util.Scanner;
class Test2{
    public static void main (String args[]) {
        int r;
        float a,b;
        System.out.println("Enter the radius");
        java.util.Scanner sc =new Scanner(System.in);
        r=sc.nextInt();
        a=r*r*22/7;
        b=2*22/7*r;
        sc.close();
        System.out.println("The area of circle is "+ a);
        System.out.println("The Circumference of circle is "+ b);
    }
}