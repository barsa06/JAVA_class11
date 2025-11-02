import java.util.Scanner;
public class Profile {
    public static void main(String args[]){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter personal details");
         System.out.print("Name:");
         String name = input.nextLine();

         System.out.print("Address:");
         String address = input.nextLine();

         System.out.print("Grade:");
         int grade = input.nextInt();

         System.out.println("Name is " + name + ".");
         System.out.println("Your address " + address + ".");
         System.out.println("Grade:" + grade);
    }
}
