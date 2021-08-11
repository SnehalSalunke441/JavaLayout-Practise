import java.util.* ;
class Subroutine{
public static void main(String[] args){
System.out.print("Enter 1st number: ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(); 
System.out.print("Enter 2nd number: ");
int b = sc.nextInt(); 
int ans = addition(a,b);
System.out.println("Addition of two numbers is " + ans);
}
public static int addition(int a, int b){
 return a+b;
}
}