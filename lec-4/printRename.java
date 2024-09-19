import java.util.*;

//For loop

// public class printRename{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the word:");
//         String word = sc.nextLine();
//         System.out.println("Enter how many times you want to print: ");
//         int repeat = sc.nextInt();

//         for(int i = 1; i<=repeat; i++){
//             System.out.println(word);
//         };

//         sc.close();
//     }
// }




// While Loop

// public class printRename{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the word:");
//         String word = sc.nextLine();
//         System.out.println("Enter how many times you want to print: ");
//         int repeat = sc.nextInt();

//        int i =1;
//        while(i<=repeat){ 
//         System.out.println(word);
//         i++;
//        }
//         sc.close();
//     }
// }


// Do while loop

public class printRename{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.nextLine();
        System.out.println("Enter how many times you want to print: ");
        int repeat = sc.nextInt();

       int i = 1;
       do{
        System.out.println(word);
        i++;
       }while(i<=repeat);
        sc.close();
    }
}
