class Demo1
{
    int rollno;
    String name;
    Address locAd,PerAd;
    ResultData result;

    class Address
    {
        String city,street,state;
        int pinCode;
    }
    static class ResultData
    {
        String course;
        int sem;
        float SPI;

        void display()
        {
            System.out.println(course+"="+sem+"-"+SPI);
        }
    }
    void display()
    {
        System.out.println(rollno+"-"+name);
        System.out.println(locAd.city+"-"+locAd.pinCode+"-"+locAd.state+"-"+locAd.street);
        System.out.println(PerAd.city+"-"+PerAd.pinCode+"-"+PerAd.state+"-"+PerAd.street);
        result.display();
    }
    void showGrade(){
        class GradeCalculator{            //lOCAL INNER CLASS   
            void findGrade(){
                if(result.SPI>8.0)
                System.out.println("A Grade");
                else if(result.SPI>6.0 && result.SPI<8.0)
                System.out.println("B Grade");
                else
                {
                System.out.println("C Grade");
                }
            }
        }       
        GradeCalculator g=new GradeCalculator();
        g.findGrade();    
    }
    void setAddress(){
        locAd=new Address();
        locAd.city="Bhubneaswar";
        locAd.pinCode=12345;
        locAd.street="mahura";

        PerAd=new Address();
        PerAd.city="Ranchi";
        PerAd.pinCode=34567;
        PerAd.street="Ring Road";
    }
}
public class InnerClass{
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        d1.rollno=1001;
        d1.setAddress();
        d1.result=new Demo1.ResultData();
        d1.result.course="B.Tech";
        d1.result.sem=3;
        d1.result.SPI=8.1f;

        d1.display();
        d1.showGrade();
    }
}