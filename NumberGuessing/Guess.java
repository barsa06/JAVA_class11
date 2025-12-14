import java.util.Scanner;

public class Guess{
      private int secretNum;

        public Guess(int secret ){
        secretNum = secret;
      }

     void guessNum(){
        if(secretNum<num){
            System.out.println("my num is smaller than " + num);
        }
        else if(secretNum>num){
            System.out.println("my num is greater than" + num);
        }
        else{
            Sytem.out.println("you have the correct guess");
        }
     }
   public static void main(String args[]){
       Scanner input= new Scanner(System.in);
       System.out.println("Enter the number you want to guess");
       int num = input.nextInt();
       
       

  }
}
