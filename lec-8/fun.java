import java.util.*;

public class fun {
    public static void printMyName(String name){
        System.out.println("HEllo " + name);
        return ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);

        sc.close();
    }
}
