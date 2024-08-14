public class Constructer {
    Constructer(){

        System.out.println("constructer is called");
    }
    public static void main(String[] args) {

        Constructer c = new Constructer();
        Constructer x = new Constructer();

        System.out.println(c);
        System.out.println(x);
       
    }
    
}
