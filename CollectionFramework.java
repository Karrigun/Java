import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Queue;
import java.util.TreeSet;


class Student{
    int rollNo;
    String name;
    public String toString()
    {
        String str=name+"--"+rollNo;
        return str;
    }
    public boolean equals(Student obj){
        if(this.rollNo==obj.rollNo)
        return true;
        else 
        return false;
    }
    Student(){

    }
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
}
    public class CollectionFramework{
    public static void main(String[] args) {
        
        List list1;
        Queue queue1;

        ArrayList list2=new ArrayList();

        list2.add(15);
        Integer int1=21;
        list2.add(int1);
        list2.add("Ankit");
        list2.add(52.9);
        list2.add(false);

        System.out.println(list2);
        System.out.println(list2.size());

        Student s1=new Student(101,"mohit");
        list2.add(s1);
        System.out.println(list2);

        //Remove Data;

        list2.remove(3);
        System.out.println(list2);
        //list2.clear();
        //System.out.println(list2);
        //getData using index
        //list2.get(index);
        
        Object obj1=list2.get(2);
        System.out.println(obj1);
        String str=(String)list2.get(2);
        System.out.println(str.length());

        Object obj2=list2.get(4);
        if(obj2 instanceof Student)
        {
            Student stu=(Student)obj2;
            System.out.println(stu.rollNo);

//--------------------------------------------------------------------------------------------------------------

        Set set1;

        TreeSet<String>
        }   
    }
}
