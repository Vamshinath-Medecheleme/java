abstract class Animal{
    void sleeping(){
        System.out.println("animal is sleeping");
    }
    abstract void eating();

    abstract void barking();
}

class Dog extends Animal{
    void eating(){
        System.out.println("dog eats meat");
    }
    void barking(){
        System.out.println("dog says bow,bow");
    }
} 
public class AnimalAbstraction {
    public static void main(String[] args) {

        Dog one = new Dog();
        one.barking();
        one.sleeping();


        }
    
}
