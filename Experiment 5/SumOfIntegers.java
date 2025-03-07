import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfIntegers {

    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + str + " is not a valid integer.");
            return null;
        }
    }

    public static int calculateSum(List<Integer> integers) {
        int sum = 0;
        for (Integer number : integers) {

            sum += number; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break; 
            }
            Integer number = parseStringToInteger(input);
            if (number != null) {
                integerList.add(number);
            }
        }

        int sum = calculateSum(integerList);
        System.out.println("The sum of the entered integers is: " + sum);

        scanner.close();
    }
}
