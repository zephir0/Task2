import java.util.*;

public class NumberAnalyzer {
    public static void main(String[] args) {
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        numberAnalyzer.execute();
    }

    public void execute() {
        List<Integer> numbersList = readInput();

        if (numbersList.isEmpty()) {
            System.out.println("No valid integers provided. Exiting.");
        } else {
            List<String> numberPairs = getPairsThatSumToTargetValue(numbersList, 13);
            printSortedPairs(numberPairs);
        }
    }

    private List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by spaces:");

        String[] inputStrings = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String input : inputStrings) {
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println(input + " is not a valid integer.");
            }
        }
        scanner.close();
        return numbers;
    }

    private List<String> getPairsThatSumToTargetValue(List<Integer> numbers,
                                                      int targetSum) {
        List<String> pairs = new ArrayList<>();
        Set<Integer> numbersSet = new HashSet<>();

        for (int num : numbers) {
            int requiredNumber = targetSum - num;
            if (numbersSet.contains(requiredNumber)) {
                int smallerNumber = Math.min(num, requiredNumber);
                int largerNumber = Math.max(num, requiredNumber);
                pairs.add(smallerNumber + " " + largerNumber);
            }
            numbersSet.add(num);
        }

        return pairs;
    }


    private void printSortedPairs(List<String> pairs) {
        pairs.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
