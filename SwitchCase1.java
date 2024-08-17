import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("take a num");
       int num= sc.nextInt();
       
       switch(num){

        case 1:
        System.out.println( "vamshinath");
        break;

        case 2:
        System.out.println("chandu");
        break;

        case 3:
        System.out.println("akhilesh");
        break;

        default:
        System.out.println("raviteja");

       }
       sc.close();
       
       
       
       
    }
    
}
