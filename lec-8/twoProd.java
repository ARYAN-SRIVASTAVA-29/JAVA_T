import java.util.*;
public class twoProd {
    
    public static int product(int a, int b){
        int cross = a * b;
        return cross;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter Num1: ");
        int num1 = sc.nextInt();
        System.out.print("ENter Num2: ");
        int num2 = sc.nextInt();

        int multiply = product(num1, num2);
        System.out.println("The Product of two number " + num1 + " & " + num2 + " is " + multiply);

        sc.close();
    }

}
