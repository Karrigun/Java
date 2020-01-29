import java.util.Scanner;

class Student{
    int rollno;
    float percent;

    Student(){

    }
    Student(int rollno,float percent){
        this.rollno=rollno;
        this.percent=percent;
    }
    void show(Student arr[]){
        int i;
        for(i=0;i<arr.length;i++){
        System.out.println("Roll No " +(i+1) +"=" +arr[i].rollno);
        System.out.println("percentage of student "+ (i+1) + "=" +arr[i].percent);
       
    }
    }
    

}
class CollegeStudent extends Student{
        int sem,i;
        Scanner sc=new Scanner(System.in);
        CollegeStudent(){

        }
        CollegeStudent(int rollno,float percent,int sem){
            super(rollno,percent);
            this.sem=sem;
        }
        void show(CollegeStudent arr[]){
            for(i=0;i<arr.length;i++){
                super.show(arr);
                System.out.println("Semester of the student "+ (i+1) + "=" +arr[i].sem);
                System.out.println("===============");
            }
        }
}
class SchoolStuent extends Student{
    int className,i;
    Scanner sc=new Scanner(System.in);
    SchoolStuent(){

    }
    SchoolStuent(int rollno,float percent,int className){
        super(rollno,percent);
        this.className=className;
    }
    void show(SchoolStuent arr[]){
        for(i=0;i<arr.length;i++){
            super.show(arr);
            System.out.println("Class of the student "+ (i+1) + "=" +arr[i].className);
            System.out.println("===============");
        }
    }
}
class Students{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        CollegeStudent cs[]=new CollegeStudent[2];
        System.out.println("Enter the details for college Student");
        for(i=0;i<2;i++){
            System.out.println("enter the roll no.");
            int r=sc.nextInt();
            System.out.println("enter the percentage");
            float p=sc.nextFloat();
            System.out.println("Enter the semester");
            int s=sc.nextInt();
            cs[i]=new CollegeStudent(r,p,s);
        }
        System.out.println("------------------------------------------------------------------------------------");
        SchoolStuent ss[]=new SchoolStuent[3];
        System.out.println("Enter the details for school Student");
        for(i=0;i<3;i++){
            System.out.println("Enter the roll no.");
            int r1=sc.nextInt();
            System.out.println("Enter the percentage");
            float p1=sc.nextFloat();
            System.out.println("Enter the Class");
            int c=sc.nextInt();
            ss[i]=new SchoolStuent(r1,p1,c);
        }
        cs[0].show(cs);
        System.out.println("-------------------------------------------------------------------------------------");
        ss[0].show(ss);
    }
}