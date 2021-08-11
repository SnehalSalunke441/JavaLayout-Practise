//Inherit.java
import java.util.* ;
class Abc
{
 int ans;
 public void add(int x, int y)
 {
   ans = x + y ;
   System.out.println("Addition of two numbers is " + ans);
 }
 public void sub(int x, int y)
 {
   ans = x - y;
   System.out.println("Subtraction of two numbers is " + ans);
 }
}

class Inherit extends Abc
{
 public static void main(String[] args)
 {
  int a, b;
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter 1st number: ");
  a = sc.nextInt();
  System.out.print("Enter 2nd number: ");
  b = sc.nextInt();
  Inherit obj1 = new Inherit();
  obj1.add(a,b);
  obj1.sub(a,b);
  obj1.mult(a,b);
 }
 public void mult(int x, int y)
 {
  int ans;
  ans = x * y;
  System.out.println("Multiplication of two numbers is " + ans);  
 }
}