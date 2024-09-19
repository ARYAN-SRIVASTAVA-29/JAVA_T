import java.util.*;

public class menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 or 0 : ");
        int input = sc.nextInt();
        if(input==1){
            int marks;
            do{
                System.out.println("Enter the MArks: ");
                marks = sc.nextInt();
              
                if(marks>=90){
                    System.out.println("Excellent");
                }
                else if(marks<=90 && marks>=60){
                    System.out.println("Average");
                }
                else if(marks>=0 && marks<60){
                    System.out.println("Below Average");
                }
                else{
                    System.out.println("Pls enter between 0 to 100");
                }
            }while( marks!=0);
        }
        else if(input==0){
            System.out.println("You have been stopped, Rerun the program and enter 1 to access menu functionalities");
        }
        else{
            System.out.println("Invalid");
        }
      
  sc.close();
    }

}