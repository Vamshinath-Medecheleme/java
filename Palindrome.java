import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("str : ");
        String str = scanner.nextLine();

        String reversed =""; 

        for(int i=str.length()-1; i>=0; i--){

             reversed+=str.charAt(i);

            
        }
        if(str.equals(reversed)){
            System.out.println("it is palindrome");
        }

        scanner.close();
       

    }
    
}
