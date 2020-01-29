class BankAccount{
    String costumerName;
    int accNo;
    float balance;
    static float intrestRate=4.5f; //class variable

    BankAccount()
    {
        System.out.println("Default....");
    }
    static
    {
        System.out.println("Intrest Rate= "+ intrestRate);
    }
    void simpleIntrest()
    {
        float si=(balance*intrestRate*1)/100;
        System.out.println("Intrest= "+ si);
    }
    static void updateRateBy(float point)
    {
        intrestRate=intrestRate+point;
        //We can not do like-System.out.println(accNo);
    }
    public void display()
    {
        System.out.println(costumerName+"-"+ accNo+"-"+balance+"Rate-"+intrestRate);
    }
    //equivalent of Destructor
    public void finalize() throws Throwable
    {
        System.out.println("See you Soon.....");
    }
}
    public class StaticDemo{
        public static void main(String[] args) {
            BankAccount b1;
            b1=new BankAccount();
            b1.accNo=101;
            b1.balance=1000;
            b1.costumerName="Deepak";
            b1.display();

            BankAccount b2=new BankAccount();
            b2.accNo=102;
            b2.balance=4000;
            b2.costumerName="Bharat";
            b2.display();

            BankAccount.updateRateBy(0.3f);
            System.out.println("-------------");
            b1.display();
            b2.display();

            System.out.println("------------");
            //b1.intrestRate=4.9f;
            BankAccount.intrestRate=4.9f;
            b1.display();
            b2.display();
        }
    }
