//Person.java
import java.util.*;
public class Person
{
 public static void main(String[] args)
 {
  System.out.println("Have a nice day! " );
  Person abc = new Person();
  abc.getdata();
  abc.printdata();
 }

 String name, gender;
 int age;
 public void getdata() 
 {
  System.out.println("I am in Person class now");
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter name: ");
  name = sc.next();
  System.out.print("Enter gender: ");
  gender = sc.next();
  System.out.print("Enter age: ");
  age = sc.nextInt();
 }
 public void printdata() 
 {
  System.out.println("Again I am in Person class");
  System.out.println("NAME: " + name);
  System.out.println("GENDER: " + gender);
  System.out.println("AGE: " + age);
 }
}