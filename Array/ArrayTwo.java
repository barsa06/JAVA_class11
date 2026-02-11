import java.util.Scanner;

public class ArrayTwo{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[][] arrayName= new int[3][3];
    System.out.println("Enter the number");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          arrayName[i][j]=input.nextInt();
        }
        System.out.println();
    }
   System.out.println("The numbers stored in array are:");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          System.out.print(arrayName[i][j]);
        }
        System.out.println();
    }
}
}