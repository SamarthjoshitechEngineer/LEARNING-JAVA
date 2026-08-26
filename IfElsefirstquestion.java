/*To Find Greatest among three numbers*/
import java.util.Scanner;
public class IfElsefirstquestion {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b =sc.nextInt();
System.out.println("Enter Third number");
int c=sc.nextInt();
if(a>b&&a>c)
    System.out.print("The greatest number is"+ a);
else if(b>a&&b>c)
    System.out.print("The greatest number is"+ b);
else
    System.out.println("The greatest number is"+ c);
}
}