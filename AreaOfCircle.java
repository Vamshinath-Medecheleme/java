import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        
        //Area of circle = piR*2

        final float pi = 3.14f;

        Scanner scanner = new Scanner(System.in);

        System.out.print("radius : ");
         int radius = scanner.nextInt();

         float circleArea = pi*(radius*radius);

         System.out.println(circleArea);

         scanner.close();



    }
    
}
