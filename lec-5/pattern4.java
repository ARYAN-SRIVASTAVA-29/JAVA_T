// import java.util.*;
// public class pattern4{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no. of rows: ");
//         int rows = sc.nextInt();
       
//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=(rows+1)-i; j++){
//                System.out.print("*");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }

import java.util.*;
public class pattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
       
        for(int i=1; i<=rows; i++){
            for(int j=(rows+1)-i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}