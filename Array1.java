
import java.util.Scanner;

class Array1{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int i,total=0;
        System.out.println("Enter the marks");
        Scanner cc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            arr[i]=cc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            total=arr[i]+total;
        }
        System.out.println("Total marks is "+ total);
        cc.close();
    }
}