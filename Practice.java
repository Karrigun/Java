import java.util.Scanner;

class Test{
    int price,quantity,pid;

    Test(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    
}
class Practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Test t[]=new Test[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter product id");
            int n=sc.nextInt();
            System.out.println("Enetr the price");
            int p=sc.nextInt();
            System.out.println("Enter the quantity");
            int q=sc.nextInt();
            t[i] = new Test(n,p,q);
        }
        
    }
}