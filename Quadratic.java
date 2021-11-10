import java.lang.*;
import java.util.*;

public class Quadratic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of Quadratic Equation: ");
        int a,b,c;
        double r1,r2;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        r2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println(r1);
        System.out.println(r2);
    }
}