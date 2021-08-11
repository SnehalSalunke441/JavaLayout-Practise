//Pdetails.java
import java.util.*;
class Pdetails
{
 public static void main(String[] args)
 {
  System.out.println("Enter your Name: "); 
  Scanner scanner = new Scanner(System.in);
  String name = scanner.next();
  System.out.println("Enter your Age: ");
  int age = scanner.nextInt();
  System.out.println("Enter your branch: ");
  String branch = scanner.next();
  System.out.println("\nHello, my name is " + name + ".");
  System.out.println("I am " + age + " years old.");
  System.out.println("I am studying in " + branch + " branch.");
  System.out.println("Thank You !");
 }
}