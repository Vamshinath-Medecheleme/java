public class Ter {
    public static void main(String args[]) {
        int a = 30;
        int b = 50;
        int c = 20;
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println(min);
    }
}

