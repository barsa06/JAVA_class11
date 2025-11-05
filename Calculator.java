import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number to do +, -, *, /");

        System.out.print("num1: ");
        int num1 = input.nextInt();

        System.out.print("num2: ");
        int num2 = input.nextInt();

        System.out.println("What operation do you want to do?");
        System.out.println("+, -, *, /");
        
        char operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                num=num1+num2;
                System.out.println("The sum is " + num);
                break;
            case '-':
                num=num1-num2;
                System.out.println("The subtraction is " + num);
                break;
            case '*':
                num=num1*num2;
                System.out.println("The multiply is " + num);
                break;
            case '/':
                num=num1/num2;
                System.out.println("The division is " + num);
                break;
        
            default:
                System.out.println("Invalid Operation");
                break;
        }
        
    }
}
