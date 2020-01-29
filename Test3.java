import java.util.Scanner;
class Test3{
    public static void main(String[] args) {
        int p,r,t;
        float s;
        System.out.println("Enter the Principle amount");
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        System.out.println("Enter the Rate");
        r=sc.nextInt();
        System.out.println("Enter the Time");
        t=sc.nextInt();
        s=p*r*t/100;
        System.out.println("The simple intrest is "+s);
        sc.close();

    }
}