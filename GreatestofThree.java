import java.util.Scanner;

public class GreatestofThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Three\n");
        System.out.println("Enter your first number: ");
        int first = input.nextInt();
        System.out.println("Enter your second number: ");
        int second = input.nextInt();
        System.out.println("Enter your third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + "First number is greater ");
        }else if( second >= third){
                System.out.println(second + " is the greatest number");
            }else{
            System.out.println(third + " is the greatest number ");

        }

    }
}
