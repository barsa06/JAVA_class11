import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" MENU ");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Mo:Mo");
        System.out.println("4. Sandwich");

        System.out.print("Enter which you want to order: ");
         int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have ordered Pizza.");
                break;
            case 2:
                System.out.println("You have ordered Burger.");
                break;
            case 3:
                System.out.println("You have ordered Mo:Mo.");
                break;
            case 4:
                System.out.println("You have ordered Sandwich.");
                break;
            default:
                System.out.println("Invalid choice! Please select according to the menu.");
        }

    }
}
