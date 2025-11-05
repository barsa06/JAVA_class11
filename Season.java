import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month of the year to find the Season:");
        String month = input.nextLine();
        switch (month) {
            case "january" :
                System.out.println("Winter");
                break;
            case "february" :
                System.out.println("Winter");
                break;
            case "March":
                System.out.println("Spring");
                break;
            case "April":
                System.out.println("Spring");
                break;
            case "may":
                System.out.println("Spring");
                break;
            case "June":
                System.out.println("Summer");
                break;
            case "July":
                System.out.println("Summer");
                break;
            case "August":
                System.out.println("Summer");
                break;
            case "September":
                System.out.println("Autumn");
                break;
            case  "October":
                System.out.println("Autumn");
                break;
            case "November":
                System.out.println("Autumn");
                break;
            case "December":
                System.out.println("Winter");
                break;
            
    
            default:
                System.out.println("invalid input");
                break;
        }
    }
    
}
