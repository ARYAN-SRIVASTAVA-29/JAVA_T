import java.util.*;

// public class arrays{
//     public static void main(String[] args){
//         int arr[] = new int[3];
//         arr[0] = 95;
//         arr[1] = 92;
//         arr[2] = 98;

//         // System.out.println(arr[0]);
//         // System.out.println(arr[1]);
//         // System.out.println(arr[2]);

//         for(int i=0; i<=2; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


public class arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number of subjects: ");
        int size = sc.nextInt();
        int marks[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enetr the marks in subject " + (i+1) + " : ");
            marks[i] = sc.nextInt();
        }
        for(int j=0; j<size; j++){
            System.out.println("Marks of Subject " + (j+1) + " is : " + marks[j]);
        }
        sc.close();
    }
}
