import java.util.*;
public class pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
       
        for(int i=1; i<=rows; i++){
            for(int j=rows-i; j>=1; j--){
              System.out.print(" ");
        
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}