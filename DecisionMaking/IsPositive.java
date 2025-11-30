import java.util.Scanner;


public class IsPositive {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a num to check whether it is positive negative or zero:");

        int num = input.nextInt();
        
        if(num>0){
            System.out.println("positive");
        }
        else if (num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
