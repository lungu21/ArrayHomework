import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Read input line containing numbers separated by commas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();

        String[] numbers = input.split( " \\s*");

        List<String> uniqueNumbers = new ArrayList<>();

        for (String num : numbers) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        System.out.println("Unique numbers:");
        for (String num : uniqueNumbers) {
            System.out.print(num + " ");
        }

    }
}
