import java.util.Scanner;
public class SwitchCase3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("print a num");
        int num=sc.nextInt();

        switch(num)
    {
        case 1:
        System.out.println("hello");
        break;

        case 2:
        System.out.println("hi");
        break;
        default:
        System.out.println("bye");
        break;
    }
    sc.close();
    }
    
}
