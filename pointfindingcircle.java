import java.util.Scanner;
public class pointfindingcircle {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x = 3, y = 2;
    int r=5;
System.out.println("The centre of circle is" +x +" ,"+y);
int x1=sc.nextInt();
int y1=sc.nextInt();
System.out.println("the point is"+ x1+" ,"+y1);
double OA=Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
if(OA==r){
    System.out.println("The Point is on the circle ");
}
   if(OA>r){
    System.out.println("The Point is outside circle ");
}
if(OA<r){
    System.out.println("The Point is inside the circle ");
} 
}
}
