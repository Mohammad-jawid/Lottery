package lottery;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber;
        int firstGuess , secondGuess;
        
        firstNumber = (int) (Math.random() * 10);
        secondNumber = (int) (Math.random() * 10);
        
        System.out.println("The random number is "+firstNumber +""+ secondNumber);
        
        System.out.print("Enter first number: ");
        firstGuess = input.nextInt();
        System.out.print("Enter second number: ");
        secondGuess = input.nextInt();
        
       if(firstGuess == firstNumber && secondGuess == secondNumber)
            System.out.println("you have won 10000$ lottery");
       else if (firstGuess == firstNumber || secondGuess == secondNumber)
            System.out.println("you have won 3000$ lottery");
       else if (firstGuess == firstNumber ^ secondGuess != secondNumber)
            System.out.println("you have won 1500$ lottery");
       else 
            System.out.println("you have won nothing");

    }

}
