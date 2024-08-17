
public class Polymorphism {
    
        
            void show(int a){
                System.out.println("this is num "+a);
            }
        
        
            void show(char c){
                System.out.println("this is char "+c);
            }

        
        public static void main(String[] args) {

            Polymorphism p = new Polymorphism();
            p.show(12);
            p.show('g');
        
    }
    
}
