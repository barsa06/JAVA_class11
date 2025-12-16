import java.util.Scanner;

public class Guess{
      private int secretNum;

        public Guess(int secret ){
        secretNum = secret;
      }

     void guessNum(){
      Scanner input= new Scanner(System.in);
       int num;
       int count=0;
       
      while(true){
        System.out.println("Enter the number you want to guess");
        num= input.nextInt();
        count ++;
        
        if(secretNum<num){
            System.out.println("The num is smaller than " + num);
        }
        else if(secretNum>num){
            System.out.println("The num is greater than " + num);
        }
        else{
            System.out.println("you have the correct guess.");
            break;
        }

      }
      System.out.println("you guessed it right in " + count + " attempt.");
     }
   public static void main(String args[]){
       Guess myGuess = new Guess(20);
       myGuess.guessNum();
  }
}
