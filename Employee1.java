import java.util.Scanner;

class Employee1{
    static int salary,empId,noOfEmployee=0,totalSalary=0;

    Employee1(int salary,int empId)
    {
        noOfEmployee++;
        totalSalary=totalSalary+salary;
    }
    void display()
    {
        System.out.println("No.of employees are "+noOfEmployee);
        System.out.println("Total salary is "+totalSalary);
    }
    public static void main(String[] args) {
        int salary;
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter");
        }
    }
}