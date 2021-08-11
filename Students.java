//Students.java   (To demonstrate interface)
import java.util.* ;
interface Course
{
 int sem = 5;
 String subject = "OOMD";
 String teacher = "Sumedh sir" ;
 public void display();
}
class Human
{
 String name, city;
 int age;
 void getdata()
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter name: ");
  name = sc.next();
  System.out.print("Enter Age: ");
  age = sc.nextInt();
  System.out.print("Enter Address: ");
  city = sc.next();
 }
 void printdata()
 {
  System.out.println("Name:  " + name);
  System.out.println("Age: " + age);
  System.out.println("Address: " + city);
 }
}
public class Students extends Human implements Course
{
 int roll;
 String branch;
 public static void main(String[] args)
 {
  Students s1 = new Students();
  s1.getdata();
  s1.printdata();
 }
 void getdata()
 {
  super.getdata();
  Scanner sc1 = new Scanner(System.in);
  System.out.print("Enter Branch: ");
  branch = sc1.next();
  System.out.print("Enter Roll Number: ");
  roll = sc1.nextInt();
 }
 void printdata()
 {
  System.out.println("\n*****Details*****");
  super.printdata();
  System.out.println("Branch: " + branch);
  System.out.println("Roll Number: " + roll);
  display();
 }
 public void display()
 {
  System.out.println("Semester: " + sem);
  System.out.println("Subject: " + subject);
  System.out.println("Teacher: " + teacher);
 }
}



