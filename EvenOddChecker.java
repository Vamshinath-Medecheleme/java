import java.util.Scanner;
public class EvenOddChecker {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("type a num : ");
         int num=sc.nextInt();
         
         if(num%2==0){
             System.out.println("num is even");
             
         }
         else{
             System.out.println("num is odd");
         }
         
         sc.close();
    }
}
    
