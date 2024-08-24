public class SwitchCase5 {
    public static void main(String[] args) {
        
        int roomNo=2;
        String roomName;

        switch(roomNo){

            case 1:
            roomName="csd";
            break;

            case 2:
            roomName="csm";
            break;

            case 3:
            roomName="csee";
            break;

            default:
            roomName="no room ";

            break;
        }
        System.out.println(roomName);
    }
    
}
