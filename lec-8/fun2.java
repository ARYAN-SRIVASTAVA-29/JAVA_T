import java.util.*;
public class fun2 {
    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }else{
        int result = num * factorial(num-1);
        return result;
    }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("THe factorial is: " + fact);

        sc.close();
    }
}
