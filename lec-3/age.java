import java.util.*;

public class age{
    public static void main(String[] args){
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("You are not Adult");
        }else{
            System.out.println("You are a adult");
        }

        sc.close();
    }
}
