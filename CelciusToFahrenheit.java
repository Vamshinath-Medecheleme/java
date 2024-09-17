import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args) {
        
        //CelciusToFahrenheit = °F = (°C × 9/5) + 32

        Scanner scanner = new Scanner(System.in);

        System.out.print("celcius : ");
        float celcius = scanner.nextFloat();

        float fahrenheit = (celcius*9/5)+32;

        System.out.println("fahrenheit : "+fahrenheit);

        scanner.close();

    }
    
}
