import java.util.*;
public class pattern14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n/2; i++){

            for(int j=n/2-i; j>=1; j--){
                System.out.print("  ");
            }
         
            for(int k=1; k<=i+i-1; k++){
                System.out.print("* ");
            }
          
            System.out.println();
        }
        for(int i=1; i<=n/2; i++){

            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
         
            for(int k=n-(i+i-1); k>=1; k--){
                System.out.print("* ");
            }
          
            System.out.println();
        }
        sc.close();
    }
}