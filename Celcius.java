import java.util.Scanner;

class Celcius{
    public static void main(String[] args) {
        float F,C;
        System.out.println("Enter the Temp. in F.");
        Scanner cc=new Scanner(System.in);
        F=cc.nextFloat();
        C=5*(F-32)/9;
        System.out.println("The Temp in Celcius is "+ C);
        cc.close();        
    }
}