import java.util.Scanner;

public class SumOfDigonal{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the no of rows:");
        int rows=input.nextInt();

        System.out.println("enter the no of columns:");
        int cols=input.nextInt();
        int sum=0;

        int [][] a=new int [rows][cols];
        for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
               System.out.print("a["+i+"]["+j+"]:");
               a[i][j]=input.nextInt();
            }
            
        }
        for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
            if(i==j){
                sum=sum+a[i][j];
            }
           }
    }
    System.out.println("the sum of digonal" + sum);
}
}