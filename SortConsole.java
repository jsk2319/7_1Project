import java.util.Scanner;

public class SortConsole {

    public static void main(String[] args) {
        final int SIZE=10;
        String [] numbers = new String[SIZE];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter " + SIZE + " numbers separated by a space.");
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = keyboard.next();
        }

        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
