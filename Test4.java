import java.util.Scanner;

class Test4{
    public static void main(String[] args) {
            int P,C,M,B,E;
            float total;
            System.out.println("Enter the marks of Physics");
            Scanner sc=new Scanner(System.in);
            P=sc.nextInt();
            System.out.println("Enter the marks of Chemistry");
            C=sc.nextInt();
            System.out.println("Enter the marks of Maths");
            M=sc.nextInt();
            System.out.println("Enter the marks of Biology");
            B=sc.nextInt();
            System.out.println("Enter the marks of English");
            E=sc.nextInt();
            sc.close();
            total=(P+C+B+M+E)/5;
            System.out.println("The Average marks is "+total);
        
    }
}