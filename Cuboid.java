import java.lang.*;
import java.util.*;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int length,breadth,height;
        int area,volume;
        System.out.println("Enter values of Cuboid: ");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();

        area = 2*((length*breadth)+(length*height)+(height*breadth));
        volume =(length * breadth * height);
        System.out.println("The volume of the cuboid is "+volume);
        System.out.println("The area of the cuboid is "+area);

    }
}