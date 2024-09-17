import java.util.Scanner;
public class SumOfANumberMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = scanner.nextInt();
        
        int sum=0;
        int multiple;

        for(int i =1; i<=10; i++){
            multiple=number*i;
            sum=sum+multiple;

        }
        System.out.println(sum);

        scanner.close();
        

    }
    
}
