import java.util.Scanner;
public class TwodArray {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][4];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){

                System.out.println("type a row "+(i+1)+" type a colomn "+(j+1));
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();

    }
    
}
