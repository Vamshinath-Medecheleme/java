import java.util.Scanner;
public class SumOfUniqueElementsInAnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int arr[] = new int[6];

        for(int i =0; i<6; i++){

            System.out.println("enter the elements : "+(i+1));
            arr[i]=scanner.nextInt();

        }
        for(int i =0; i<6; i++){

        System.out.println(arr[i]);

        
        }
    }
    
}
