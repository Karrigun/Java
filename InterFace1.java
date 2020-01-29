import java.util.Scanner;

interface Taxable {
    float GST1 = 18;
    float GST2 = 4;
    float GST3 = 28;
    float incomeTaxRate = 12.5f;
    float tollTaxRate1 = 50;
    float tollTaxRate2 = 100;

    float calculateTax();
}

class Person implements Taxable {
    String name;
    float income;

    void display() {
        System.out.println(name + "-" + income);
    }

    public float calculateTax() {
        float t = (income * incomeTaxRate) / 100;
        return t;
    }
}

class vechical implements Taxable {
    String type;
    String model;
    String regNo;

    void display() {
        System.out.println(regNo + "-" + type + "-" + model);
    }

    public float calculateTax() {
        if (type.contentEquals("TwoWheeler")) {
            return tollTaxRate1;
        } 
        else {
            return tollTaxRate2;
        }
    }
}

class Food implements Taxable {
    String foodName;
    float price;

    void display() {
        System.out.println(foodName + "-" + price);
    }

    public float calculateTax() {
        return (price * GST2) / 100;
    }
}

public class InterFace1 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "anubhav";
        p1.income = 2345678;
        p1.display();
        float tax1 = p1.calculateTax();
        System.out.println("tax  on anubhav-" + tax1);

        vechical v1 = new vechical();
        v1.model = "pulser";
        v1.regNo = "OD56789o";
        v1.type = "TwoWheeler";
        float tax2 = v1.calculateTax();
        System.out.println("tax on " + v1.model + "=" + tax2);

        Food f1 = new Food();
        f1.foodName = "dal-rice";
        f1.price = 450;
        f1.display();
        float tax3 = f1.calculateTax();
        System.out.println("tax on food" + f1.foodName + "-" + tax3);

        Taxable tx; // =new Taxable();
                    // tx=v1:
                    // tx=f1;
                    // tx=p1;
        /*ABC a=new ABC(); tx=a; v1=tx;*/
        // System.out.println(tx.calculateTax());
        tx = null;
        System.out.println("enter choice-");
        System.out.println("1.food,2.vechical,3.person");

        int ch = 0;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch (ch) {
        case 1:
            tx = f1;
            break;
        case 2:
            tx = v1;
            break;
        case 3:
            tx = p1;
            break;

        default:
            System.out.println("not valid choice.");
        }
        System.out.println(tx.calculateTax());
        sc.close();
    }
}
