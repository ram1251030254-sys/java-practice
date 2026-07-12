import java.util.Scanner;

public class temperature_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in degree celcius: ");
        float tempc = input.nextFloat();
        float tempf = (tempc*9/5) +32;
        System.out.println("temperature in fahrenhite is " + tempf);
    }
}
