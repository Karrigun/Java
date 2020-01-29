import java.util.Scanner;

class Swap{
    public static void main(String[] args) {
        int i,k;
        System.out.println("Enter 2 Numbers");
        Scanner cc=new Scanner(System.in);
        i=cc.nextInt();
        k=cc.nextInt();
        i=i^k;
        k=i^k;
        i=i^k;
        System.out.println("Numbers after swapping "+ i+""+k);
        cc.close();
        
    }
}