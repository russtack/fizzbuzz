import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        if (input%5==0&&input%3==0){
            System.out.println("FizzBuzz");
        } else if (input%5==0) {
            System.out.println("Fizz");

        } else if (input%3==0) {
            System.out.println("Buzz");
        }
        else {
            System.out.print(input);

        }
    }
}