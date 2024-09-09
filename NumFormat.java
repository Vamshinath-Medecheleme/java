import java.text.NumberFormat;

public class NumFormat {

    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String c = currency.format(123.456);

        System.out.println(c);
        
    }
    
}
