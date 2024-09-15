import java.util.Scanner;

public class CheckForLeapYear {
    public static void main(String[] args) {
        
        /*A leap year is exactly divisible by 4 except for century years (years ending with 00).
         The century year is a leap year only if it is perfectly divisible by 400. */

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter year : ");
         int year = scanner.nextInt();

         if(year%4==0 && year*100%4!=0 || year*100%400==0){

            System.out.println("it is a leap year");
         }
         else{
            System.out.println("Not a leap yr");
         }


         scanner.close();


    }
    
}
