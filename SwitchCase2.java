public class SwitchCase2 {

    public static void main(String[] args) {
        
        int carno=3;
        String carname;

        switch(carno){

            case 1:

            carname="audi";
            break;

            case 2:

            carname="BMW";
            break;

            case 3:

            carname="morries garage";
            break;

            default:
            carname="no car";
        }
        System.out.println(carname);

    }
    
}
