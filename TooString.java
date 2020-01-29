

// Java program to illustrate 
// working of toString() method 
public class TooString { 
	String name; 
	int age; 
	String college; 
	String course; 
	String address; 
	TooString
	(String name, int age, String college, String course, String address) 
	{ 
		this.name = name; 
		this.age = age; 
		this.college = college; 
		this.course = course; 
		this.address = address; 
	} 
public String toString() 
	{ 
		return name + " " + age + " " + college + " " + course + " " + address; 
	} 
public static void main(String[] args) 
	{ 
		TooString b = 
		new TooString("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu"); 
		//System.out.println(b); 
		System.out.println(b.toString()); 
	} 
} 
