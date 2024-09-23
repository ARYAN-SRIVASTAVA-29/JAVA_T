import java.util.*;
public class twoNum {
    public static int sum(int a, int b){
        int total = a + b;
        return total;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print(sum(num1, num2));

        sc.close();
    }
}
