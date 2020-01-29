import java.util.Scanner;

interface Taxable{
    float salesTax=7;
    float incomeTax=10.5f;

    float calcTax();
}

class Employee implements Taxable{
    String empId;
    String name;
    int salary;

    void display(){
        System.out.println("the Emp. Id is "+ empId);
        System.out.println("Employee name is "+ name);
        System.out.println("Employee's Annual Salary is "+ salary);
    }
    public float calcTax(){
        float i=(salary*incomeTax)/100;
        return i;
    }
}

class Product implements Taxable{
    String pid;
    int price;
    int quantity;
    void display(){
        System.out.println("the Product Id is "+ pid);
        System.out.println("Price of product is "+ price);
        System.out.println("Quantity of Product is "+ quantity);
    }
    public float calcTax(){
        return (price*salesTax)/100;
    }
}
public  class Tax{
    public static void main(String[] args) {
        Taxable tx;
        tx=null;
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        e1.empId=sc.next();
        e1.name=sc.next();
        e1.salary=sc.nextInt();
        e1.display();
        float T1=e1.calcTax();
        System.out.println("Tax on annual salary is "+ T1);

        System.out.println("------------------------------------------------------------------");

        Product p1=new Product();
        p1.pid=sc.next();
        p1.price=sc.nextInt();
        p1.quantity=sc.nextInt();
        p1.display();
        float P1=p1.calcTax();
        System.out.println("Tax on product is "+ P1);
    }
}
