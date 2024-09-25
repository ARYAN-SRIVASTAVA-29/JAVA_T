import java.util.*;
public class sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i=0; i<size; i++){
            System.out.println("ENter element: " +  (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.print("The array entered is : [ ");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " "); 
        }
        System.out.print(" ]");
        System.out.println();
        int temp = 0;
        for(int j=0; j<=arr.length; j++){
           
            for(int k=j+1; k<arr.length; k++){
                if(arr[j]>arr[k]){
                   temp = arr[j];
                   arr[j] = arr[k];
                   arr[k] = temp;
                }
               
            } 
        }
        System.out.print("Array in ascending order is: [ ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ]");
        sc.close();

    }
}


// import java.util.Scanner;

// public class sort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input the size of the array
//         System.out.print("Enter the size of array: ");
//         int size = sc.nextInt();

//         // Declare the array and input elements
//         int arr[] = new int[size];
//         for (int i = 0; i < size; i++) {
//             System.out.println("Enter element " + (i + 1) + ": ");
//             arr[i] = sc.nextInt();
//         }

//         // Display the array entered by the user
//         System.out.print("The array entered is: [ ");
//         for (int j = 0; j < arr.length; j++) {
//             System.out.print(arr[j] + " ");
//         }
//         System.out.print("]");
//         System.out.println();

//         // Bubble Sort to sort the array in ascending order
//         for (int j = 0; j < arr.length - 1; j++) {
//             for (int k = 0; k < arr.length - j - 1; k++) {
//                 if (arr[k] > arr[k + 1]) {
//                     // Swap the elements
//                     int temp = arr[k];
//                     arr[k] = arr[k + 1];
//                     arr[k + 1] = temp;
//                 }
//             }
//         }

//         // Display the sorted array in ascending order
//         System.out.print("Array in ascending order is: [ ");
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.print("]");

//         sc.close();
//     }
// }
