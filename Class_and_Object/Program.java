import java.util.Scanner;

public class Program{
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the length");
    double length =input.nextDouble();
    
    System.out.println("enter the breadth");
    double breadth = input.nextDouble();


    Rectangle r=new Rectangle(2,4);
    r.areaOfRectangle();
    r.perimeterOfRectangle();
}
}