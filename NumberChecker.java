import java.util.Scanner;
class NumberChecker {
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter a variable number : ");
       int x =scanner.nextInt();
       
       if(x==5){
           System.out.println("Hello World");
       }
       else {
      System.out.println("You entered " + x);
       }

       scanner.close();


    }
}

