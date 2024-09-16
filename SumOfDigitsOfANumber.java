import java.util.Scanner;
public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = scanner.nextInt();

        int sum=0;
        int digit;

        while(number!=0){

            digit= number%10;

            sum = sum+digit;

            number =number/10;


        }
        System.out.println(sum);

        scanner.close();



    }
    
}
