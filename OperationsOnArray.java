public class OperationsOnArray {
    public static void main(String[] args) {
        
        int arr[]={3,2,1,5,7,8,9,6,8,1,4,1,2,1,4,6};

        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3==0){
                count = count+1;
            }
        }
        System.out.println(count);
        System.out.println(arr.length);



    }
    
}
