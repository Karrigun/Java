import java.util.Scanner;

class Faculty
{
    String facultyId;
     static int salary;
     Faculty(){

     }
    Faculty(String facultyId,String facultyid){
        this.facultyId=facultyId;
    }
    void show(){
        System.out.println("");
    }
}
class FullTimeFaculty extends Faculty
{
    int basic,allowance;
    FullTimeFaculty(int basic,int allowance){
        this.basic=basic;
        this.allowance=allowance;
    }
    void salary(FullTimeFaculty arr[]){
        for(int i=0;i<arr.length;i++){
            salary=arr[i].allowance+arr[i].basic;
            System.out.println("the total salary of full time faculty is "+salary);
        }   
    }
}
class PartTimeFaculty extends Faculty
{
    int hour;
    int rate;
    PartTimeFaculty(int hour,int rate){
        this.hour=hour;
        this.rate=rate;
    }
    void salary(PartTimeFaculty arr[]){
        for(int i=0;i<arr.length;i++){
            salary=arr[i].hour*arr[i].rate;
            System.out.println("the total salary of part time faculty is "+salary);

        }
    }
}
public class Sky{
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
       /* Faculty fc[]=new Faculty[2];
        System.out.println("Enter faculty ID");
        for(i=0;i<2;i++){
            System.out.println("Enter ID for faculty 1");
            String n=sc.next();
            System.out.println("Enter ID for faculty 2");
            String m=sc.next();
            fc[i]=new Faculty(n,m);
        }*/
        FullTimeFaculty ft[]=new FullTimeFaculty[2];
        System.out.println("Enter the Details for Full time faculty");
        for(i=0;i<2;i++){
            System.out.println("Enter the basic");
            int basic=sc.nextInt();
            System.out.println("Enter the allowance");
            int allowance=sc.nextInt();
            ft[i]=new FullTimeFaculty(basic,allowance);
        }
        PartTimeFaculty pt[]=new PartTimeFaculty[2];
        System.out.println("Enter the details for part time faculty");
        for(i=0;i<2;i++){
            System.out.println("Enter the hour");
            int hour=sc.nextInt();
            System.out.println("Enter the rate");
            int rate=sc.nextInt();
            pt[i]=new PartTimeFaculty(hour,rate);
        }
        ft[1].salary(ft);
        pt[1].salary(pt);
        sc.close();
    }
}