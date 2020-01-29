 class OneBhk{
    int roomArea;
    int hallArea;
    int price;

    OneBhk(){
        System.out.println("this is 1 BHK");
    }
    OneBhk(int room1,int halla,int price1){
        roomArea=room1;
        hallArea=halla;
        price=price1;
    }
    void show(){
        System.out.println(roomArea+"--"+hallArea+"--"+price);
    }
}
class TwoBhk extends OneBhk{
    int room2Area;

    TwoBhk(){
        System.out.println("this is 2 BHK");
    }
    TwoBhk( int room1,int halla,int room2Area,int price1){
        super(room1,halla,price1);
        this.room2Area=room2Area;
    }
    void show(){
        System.out.println(roomArea+"--"+hallArea+"--"+room2Area+"--"+price);
    }
    void price(){

    }
}
public class Bhk{
    public static void main(String[] args) {
        TwoBhk t2=new TwoBhk(150,200,150,500000);
        OneBhk t1=new OneBhk(150,200,30000);
        t2.show();
        t1.show();
    }
}