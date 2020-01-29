class Employee{
    static int totalsalary=0;
    static int noOfEmp=0;
    int empid;
    int salary;   
    Employee(int empno,int salary)
    {
        empid=empno;
        this.salary=salary;
    }
    void emp()
    {
        noOfEmp++;
        System.out.println(noOfEmp);
    }
    void totalsalary(Employee arr[]){
        int length=arr.length;
        for(int i=0;i<length;i++)
        {
            totalsalary=totalsalary + arr[i].salary;
        }
    }
    public static void main(String[] args) {
        Employee a[]=new Employee[5];
        a[0]=new Employee(100, 1000);
        a[0].emp();
        a[1]=new Employee(200, 2000);
        a[1].emp();
        a[2]=new Employee(300, 3000);
        a[2].emp();
        a[3]=new Employee(400, 4000);
        a[3].emp();
        a[4]=new Employee(500, 5000);
        a[4].emp();
        
        a[4].totalsalary(a);
        System.out.println("The total salary is "+totalsalary);
    }

}