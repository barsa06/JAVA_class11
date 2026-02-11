import java.util.Scanner;

public class StringArray{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String n[]=new String[10];
        System.out.println("Enter name to store it into java array");
        for(int i=0; i<n.length; i++){
            n[i]=input.nextLine();
        }
        System.out.print("The names in array are:");
        for(int i=0; i<n.length; i++){
            System.out.print(n[i] + ",");
        }

    }
}