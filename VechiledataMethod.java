class Vechile{
    int speed;
    String name;
    String color;

    void details(){

        System.out.println(name);
        System.out.println(speed);
        System.out.println(color);
       

    }
}

public class VechiledataMethod {
    public static void main(String[] args) {

        Vechile car = new Vechile();

        car.name="benz";
        car.color="blue";
        car.speed=160;

        Vechile bike = new Vechile();

        bike.name="gt";
        bike.color="red";
        bike.speed=140;

        car.details();
        bike.details();




        
    }
    
}
