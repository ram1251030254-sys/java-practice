import java.util.Scanner;

public class type_casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // type casting
        int num = (int) (98.09876f);
        System.out.println(num);
        //automatic type promotion example
        // example 1
        int a = 257;
        byte b = (byte) (a);// range of byte is 256 , so 334 % 256 will be displayed after execution of the program
        System.out.println(b);
        // example 2
        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c * d / e;
        System.out.println(f);
        //some points to be noted
//        byte x = 50;
//        x = x * 2; this ran into an error because we cannot assign byte to an integer.
        // this need a type casting to run

        int num3 = 'b';
        System.out.println(num3);//ASCII value , automatic type conversion
        // java follows unicode principals

// one example that covers everything in one all the conversion that are automatic
        // refer from lec 1 intro to program if needed

    }
}