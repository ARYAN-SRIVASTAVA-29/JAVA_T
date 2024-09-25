import java.util.*;

public class min{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Eneter element " + (i+1));
            arr[i] = sc.nextInt();
        }

       
      
        int max = arr[0];
        int min = arr[0];
        int minIndex = 0;
        int maxIndex = 0;

        for(int j=0; j<size; j++){
       
            if(arr[j]< min){
                min = arr[j];
                minIndex = j;
            }
            
            if(arr[j] > max){
               max=arr[j];
               maxIndex = j;
            }
        }
       System.out.println("The maximum value is: " + max + " index is " + maxIndex);
       System.out.println("The minimum value is: " + min + " index is " + minIndex);
        sc.close();
    }
}







