package task;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FunctionalProgramming{

    public static void main(String[] args) {
        // list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. Pure function for squaring a number
        Function<Integer, Integer> square = num -> num * num;

        // 2. Use map to apply the function to each element
        List<Integer> squares = numbers.stream()
                .map(square)
                .collect(Collectors.toList()); // Collect into a List
        
        System.out.println("Original numbers: " + numbers);
        System.out.println("Squared numbers: " + squares);
      }
}
