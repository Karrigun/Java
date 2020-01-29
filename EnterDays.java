import java.util.Scanner;

class EnterDays{
    public static void main(String[] args) {
        int d,y,m,s,g;
        System.out.println("Enter the Date");
        Scanner cc=new Scanner(System.in);
        d=cc.nextInt();
        y=d/365;
        m=d%365;
        s=m/30;
        g=m%30;
        System.out.println("The Year is "+ y);
        System.out.println("The Month is "+ s);
        System.out.println("The Day is "+ g);
        cc.close();


    }
}