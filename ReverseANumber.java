import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number : ");
        String number = scanner.nextLine();

        String num ="";

        for(int i=number.length(); i>0; i--){
            num=num+i;
        }
        System.out.println(num);


        scanner.close();

        
    }
    
}
