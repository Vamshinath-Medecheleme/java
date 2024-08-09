class A{
    void show(){
        System.out.println("hello");
    }
}
class B extends A{
    void show(){
        System.out.println("hi");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.show();
        
    }
    
}
