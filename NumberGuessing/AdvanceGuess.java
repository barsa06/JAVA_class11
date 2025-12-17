import java.util.Scanner;
public class AdvanceGuess{
    public int secret;
    
    public AdvanceGuess(int secret){
        this.secret=secret;
    }
        void numberGuessing(){
            Scanner input = new Scanner(System.in);
            int num;
            int count=0;
            int difference;
            boolean trueCon = true;
            while(trueCon){
                System.out.println("Enter a number as your guessing in this guessing game.");
                num = input.nextInt();
                count++;
                difference =Math.abs(secret-num);
                if(secret>num){
                    System.out.println("The number you guessed is SMALLER than the SECRET NUMBER.");
    
                }
                else if(secret<num){
                    System.out.println("The number you guessed is GREATER than the SECRET NUMBER.");
                    
                }
                else{
                    System.out.println("Congratulation ! you have guessed the right number....");
                    trueCon = false;
                }
                if(num!=secret){
                    if(difference<=3){
                        System.out.println("Your guess is VERY VERY CLOSE.");
                    }
                    else if(difference<5){
                        System.out.println("You are VERY CLOSE...");
                    }
                    else if(difference<10){
                        System.out.println("Your guess is CLOSE...");
                    }
                    else if(difference<30){
                        System.out.println("Your guess is GETTING CLOSE...");
                    }    
                    else if(difference<50){
                        System.out.println("Your guess is TOO FAR...");
                        
                    }
                    
                    
                }
            }
            System.out.println("You have guessed in " + count + " attempt.");
        }
        public static void main(String[] args){
            AdvanceGuess myGuess = new AdvanceGuess(45);
            myGuess.numberGuessing();
        }
}