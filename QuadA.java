import java.util.Scanner;

class QuadA{
    public static void main(String[] args) {
        int x;
        float z;
        System.out.println("Enetr the value of x");
        Scanner cc=new Scanner(System.in);
        x=cc.nextInt();
        z=(x*x)+(3*x)-7;
        System.out.println("The value of expression is"+ z);
        cc.close();
    }
}