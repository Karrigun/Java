import java.util.Scanner;
class Test{
    int p,v,t;
    Test(int p,int v,int t){
        this.p=p;
        this.v=v;
        this.t=t;
    }
    int sum(){
       return this.p + this.t + this.v ; 
    }
}
class P2{
    public static void main(String[] args) {
        int n,p,v,t;
        Scanner c=new Scanner(System.in);
        System.out.println("enter the no of questions");
        n=c.nextInt();
        Test a[]=new Test[3];
        System.out.println("Enter the values");
        for(int i=0;i<3;i++)
        {
             p=c.nextInt();
             v=c.nextInt();
             t=c.nextInt();
             a[i]=new Test(p, v, t);
        }
        int count=0;

        //printing the sum 
        for(int i = 0 ; i < a.length ; ++i){
            if(a[i].sum()>1)
            {
                 count++;
            }
        }
        System.out.println(count);
    }

}