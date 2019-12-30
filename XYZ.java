import java.util.Scanner;

class Product{
    static int totalPrice=0;
    String productId;
    int price;
    int quantity;
    
    Product(String productId,int price,int quantity)
    {
        this.productId=productId;
        this.price=price;
        this.quantity=quantity;
    }
    void highestPrice(Product arr[])
    {
        int x=0;
        int highest=arr[0].price;
        for(int i=0;i<arr.length;i++)
        {
            if(highest<arr[i].price){
                highest=arr[i].price;
                x++;
            }
        }
        System.out.println("Highest Price of Item is= "+highest+" The pid is= "+arr[x].productId);
    }
    void totalPrice(Product arr[]){
        for(int i=0;i<arr.length;i++){
            totalPrice=totalPrice+arr[i].price;
            totalPrice=totalPrice*arr[i].quantity;
        }
        System.out.println("The Total Price is= "+totalPrice);
    }
}
class XYZ{
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        Product a[]=new Product[2];
        for(i=0;i<2;i++)
        {
            System.out.println("Enter the product id ");
            String n=sc.next();
            System.out.println("Enter the price");
            int p=sc.nextInt();
            System.out.println("Enter the quantity");
            int q=sc.nextInt();
            a[i] = new Product(n, p, q);
        }
        a[0].totalPrice(a);
        a[0].highestPrice(a);
        sc.close();
    }
}