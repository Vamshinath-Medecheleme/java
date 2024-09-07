import java.util.Scanner;

public class MaximumOfThree {

   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("First num: ");
            int a = scanner.nextInt();
            System.out.println("Second num: ");
            int b = scanner.nextInt();
            System.out.println("Third num: ");
            int c = scanner.nextInt();
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            if (a == max) {
                System.out.println("First num is greater");
            } else if (b == max) {
                System.out.println("Second num is greater");
            } else {
                System.out.println("Third num is greater");
            }
            scanner.close();
        }
    }
    
    
    
    

