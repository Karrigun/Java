import java.util.Scanner;

class MathOperation{
    int a;
    float b;
    void mul1()
    {
        int x,y;
        System.out.println("Enetr the Numbers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        a=x*y;
        System.out.println("The multiplication is "+ a);
        sc.close();
    }
    void mul2()
    {
        float x,y,z;
        System.out.println("Enetr the Numbers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextFloat();
    b=(float) x*y*z;
    System.out.println("The multiplication is "+ b);
    sc.close();
    }
    void mul3()
    {
        int arr[]=new int[3];
        int count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr 3 numbers in array");
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            count=arr[i]*count;
        }
        System.out.println("The multiplication of array elements is "+ count);
        sc.close();
    }
    public static void main(String[] args) {
        MathOperation cc=new MathOperation();
        cc.mul1();
        cc.mul2();
        cc.mul3();
    }
}