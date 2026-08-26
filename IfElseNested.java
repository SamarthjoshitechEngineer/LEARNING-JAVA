
  /*To Find Greatest among three numbers*/
import java.util.Scanner;
public class IfElseNested {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b =sc.nextInt();
System.out.println("Enter Third number");
int c=sc.nextInt();
if(a>b){
    if(a>c)
        System.out.println("The Greatest number is"+a);
    else
        System.out.println("The Greatest number is"+c);
}
else if(b>a){
    if(b>c)
        System.out.println("The Greatest number is"+b);
    else
        System.out.println("The Greatest number is"+c);

}
else
    System.out.println("The Greatest Number is"+c);
}
}  
    
