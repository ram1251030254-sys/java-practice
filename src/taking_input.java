import java.util.Scanner;
public class taking_input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input integer
        System.out.print("please enter your roll no: ");
        int roll_no = input.nextInt();
        input.nextLine();// consume the leftover newline
        System.out.println("your roll no is " + roll_no);
        // input string
        System.out.println("please enter your name: ");
        String name = input.nextLine();
        System.out.println("your name is: " + name );
        // just printing what is defined at initial stage
        float marks = input.nextFloat();
        System.out.println(marks);
        //next is used for displaying only the first letter of the sentence given by user.
        //nextLine is used to display the whole line given by the user.
        //println is used to move on next line
        //print is used to stay on the same line.
        int a = 10;
        System.out.println(a);
     }
}