import java.util.Scanner;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        
        // postive +, Negative -, zero 0.

        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("number is positive");
        }
        else if (number<0) {
            System.out.println("number is negative");
            
        }
        else{
            System.out.println("it is zero");
        }
        scanner.close();
    }
    
}
