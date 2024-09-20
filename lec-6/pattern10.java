import java.util.*;
public class pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n/2; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n/2-i); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=n/2; i++){
            for(int j=n/2; j>=i; j--){
                System.out.print("* ");
            }
            for(int k=1; k<=2*(i+1-2); k++){
                System.out.print("  ");
            }
            for(int j=n/2; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
