import java.util.*;
public class area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius of circle: ");
        float radius = sc.nextFloat();
        double area = 3.14*radius*radius;
        System.out.println("The area of circle with radius " + radius + " is " + area);

        sc.close();
    }

    
}