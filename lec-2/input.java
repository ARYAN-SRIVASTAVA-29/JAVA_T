// import java.util.*;

// public class input{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         //nextInt()
//         //nextFloat()
//         System.out.println("The name entered is " + name);
//     }
// }


import java.util.*;

public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        int ans = a + b;
        System.out.println("The sum is " + ans);

        sc.close();
    }
}