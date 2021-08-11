//Display.java

class Display
{
 public static void main(String[] args)
 {
  Person p1 = new Person();
  System.out.println("Calling getdata method of Person class from Display class ");
  p1.getdata();
  System.out.println("Calling printdata method of Person class from Display class");
  p1.printdata();
  System.out.println("I am back in Display class!");
 }
}