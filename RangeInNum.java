import java.util.Scanner;
class RangeInNum{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("type num : ");
       int num = sc.nextInt();
       
       if(num>=1&&num<=100){
           System.out.println("it is in range");
       }
       else{
           System.out.println("it is not in range");
       }
       sc.close();
    }
}
