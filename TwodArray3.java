import java.util.Scanner;
public class TwodArray3 {
    public static void main(String[] args) {

        int arr[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println("enter row "+(i+1)+" enter column "+(j+1));
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
}
