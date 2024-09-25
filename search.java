import java.util.*;

public class search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for(int j=0; j<size; j++){
            if(x == arr[j]){
                System.out.println("The index at which the X is: " + j);
            }
        }

        sc.close();
    }
}
