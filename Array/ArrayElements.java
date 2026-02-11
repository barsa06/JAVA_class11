import java.util.Scanner;

public class ArrayElements{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String n[]=new String[10];
        System.out.println("Enter name to store it into java array");
        for(int i=0; i<n.length; i++){
            System.out.println("Enter (Element" +i + ")");
            n[i]=input.nextLine();
        }
        for(int i=0; i<n.length; i++){
            System.out.println("The names in array (Element" +i + ")");
            System.out.println(n[i]);
        }

    }
}