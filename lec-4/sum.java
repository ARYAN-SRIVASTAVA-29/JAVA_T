import java.util.*;

public class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        int result = 0;
        for(int i = 1; i<=n; i++){  
            result = result + i;
          
                // System.out.println(
                // (result-i) + "+" + i + "=" + result);
         
        }
        System.out.println(result);
        sc.close();
    }
}
