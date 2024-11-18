
package task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter principal:");
       int principal = input.nextInt();
        System.out.println("Enter rate:");
       double rate = input.nextDouble();
        System.out.println("Enter time in year:");
       double time = input.nextDouble();
       
       double simpleInterest = (principal * rate * time)/100;
        System.out.println(simpleInterest);
       
       
       
       
    }
    
}
