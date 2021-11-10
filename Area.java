import java.lang.*;
import java.util.*;
public class Area{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height and Breadth of the triangle!");
        int a,b,c;
        double s,area;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s =(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the given triangle is "+area);
    }
}