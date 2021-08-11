//Student.java
import java.util.* ;
class Student
{
 String name,branch;
 int roll;
 public static void main(String[] args)
 {
  Student s1 = new Student();
  s1.getdata();
  s1.printdata();
 }
 public void getdata()
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter name: "); 
  name = sc.next();
  System.out.print("Enter Branch: ");
  branch = sc.next();
  System.out.print("Enter Roll number: ");
  roll = sc.nextInt();
 }
 public void printdata()
 {
  System.out.println("\n***** STUDENT DETAILS *****");
  System.out.println("NAME: " + name);
  System.out.println("BRANCH: " + branch);
  System.out.println("ROLL NO.: " + roll);
 }
}