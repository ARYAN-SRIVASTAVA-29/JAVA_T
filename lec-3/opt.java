import java.util.*;

public class opt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("You opted A");
                break;
            case 2:
                System.out.println("You opted B");
                break;
            case 3:
                System.out.println("You opted C");
                break;
            case 4:
                System.out.println("You opted D");
                break;
        
            default:
                break;
        }

        sc.close();
    }
}
