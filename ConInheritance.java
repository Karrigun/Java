class P{
    int i;
    P(){
        System.out.println("P default");
    }
    P(int i){
        this.i=i;
        System.out.println("P Param");
    }
}
class Q extends P{
    int j;
    Q(){
        System.out.println("Q default");
    }
    Q(int i, int j){
        this.i=i;
        this.j=j;
        System.out.println("Q Param");
    }
}
class R extends Q{
    int k;
    R(){
        System.out.println("R default...");
    }
    R(int i,int j,int k){
        this.i=i;
        this.j=j;
       // super(i,j);
        this.k=k;
        System.out.println("R Param");
    }
}
public class ConInheritance{
    public static void main(String[] args) {
        P p2=new P();
        Q q2=new Q();
        R r2=new R();

        System.out.println("-------------------------");
        Q q1=new Q(2,5);

        System.out.println("--------------------------");
        R r1=new R(1,2,3);
        
    }
}