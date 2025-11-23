import java.util.Scanner;
public class UserDetails {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your details");

        System.out.print("Hobby:");
        String hobby = input.nextLine();

        System.out.print("Age:");
        int age = input.nextInt();

        System.out.println("Your hobby is " + hobby +".");
        System.out.println("You are " + age + " years old.");


    }
}
