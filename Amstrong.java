import java.util.Scanner;
public class Amstrong {

    public static void main(String[] args) {

        //An Armstrong number is a non-negative integer that is equal to the sum of its own digits, each raised to the power of
        // the number of digits.

        Scanner scanner = new Scanner(System.in);

        System.out.print("number : ");
         int number=scanner.nextInt();

         int temp = number ;
         int digitCount = 0;

         while(temp!=0){
            temp/=10;
            digitCount++;
         }
         System.out.println(digitCount);


         int sum=0;

         while(temp!=0){
            temp%=10;
            temp*=digitCount;
            temp/=10;
         }
         








    }
    
}
