import java.util.Scanner;

public class if_else_basics {
    public static void main(String[] args) {
 //basic understanding of the if and else statement
        Scanner input = new Scanner(System.in);
        System.out.println("give any number: ");
        int num1 = input.nextInt();

        if (num1 == 10) {
            System.out.println("hello world");
        }
        else {
            System.out.println("hello ram ");

        }
    }
}
