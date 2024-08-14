import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("type num ");
        int num= sc.nextInt();
        
        switch(num){
            case 1:
            System.out.println("sunday");
            break;

            case 2:
            System.out.println("monday");
            break;

            case 3:
            System.out.println("tuesday");
            break;

            default:
            System.out.println("chandu");
            break;
        }
        sc.close();

    }
    
}
