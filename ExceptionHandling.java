public class ExceptionHandling {
    public static void main(String[] args) {
        
        int i=10;
        int j=0;
        int k;

        try{
            k=i/j;

        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("this is arithmetic exception");
        }
        finally{
            System.out.println("finally definetly execute");
        }
    }
    
}
