import java.util.Scanner;

class Test2{
    public static void main (String args[]) {
        int a,b;
        System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=a*a;
        System.out.print("The square of given number is "+ b);
        sc.close();
    }
}