import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeJava8Ques {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(new Employee("Kartheek", 25, 70000),
                new Employee("Ajay", 31, 25000),
                new Employee("Barry", 27, 30000),
                new Employee("Dinesh", 35, 35000),
                new Employee("Elena", 45, 20000));

        //Sorted List based on Age

        List<Employee> sortedList = empList.stream()
                .sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());

        //sortedList.forEach(System.out::println);

        // ------------------------------------------------------------------------------------------//

        //Count the occurances of a char in a string

        String str = "Communication";
        Map<String, Long> result = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);

        // ------------------------------------------------------------------------------------------//

        //Count the occurrences of numbers in a list

        List<String> stringList = Arrays.asList("B", "A", "A", "C", "B", "A");

        Set<String> distinct = new HashSet<>(stringList);
        for (String s : distinct) {
            System.out.println(s + ": " + Collections.frequency(stringList, s));
        }

        // ------------------------------------------------------------------------------------------//

        //Count the occurrences of numbers in a list using Function.identity()

        List<String> list1 = Arrays.asList("B", "A", "A", "C", "B", "A");

        Map<String, Long> frequencyMap = list1.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        for (Map.Entry<String, Long> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // ------------------------------------------------------------------------------------------//

        //Finding the second highest element

        // Approach - 4 Using Java 8 Streams
        Integer arr[] = {12, 16, 45, 11, 18, 22, 19, 20, 45};
        Integer result1 = Arrays.stream(arr)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        // ------------------------------------------------------------------------------------------//

        //Multiplication of a number by itself
        Integer[] inputArray = {1, 2, 3, 4, 5}; // 120
        List<Integer> numberList = Arrays.asList(inputArray);
        Optional<Integer> output = numberList
                .stream().reduce((a, b) -> a * b);

        if (output.isPresent()) {
            System.out.println("Array Multiplication using java 8 :" + output.get());
        }

        // ------------------------------------------------------------------------------------------//

        // Sorting Employee based on multiple comparators

        // inline - sorting on multiple fields
        List<Employee> sortedCustomerList = empList
                .stream()
                .sorted(
                        Comparator.comparing(Employee::getName) // 1st compare Name
                                .thenComparing(Employee::getAge) // then 2nd compare City
                                .thenComparing(Employee::getSalary)) // then 3rd compare Age
                .collect(Collectors.toList()); // collect sorted customers to new list

        // print new list to console using forEach()
        sortedCustomerList.stream().forEach(System.out::println);

        // ------------------------------------------------------------------------------------------//

        //REsuisng a Stram using Supplier

        String[] inputArray1 = {"Amit", "ball", "call", "Amit", "egg"};

        Supplier<Stream<String>> inputStream = () -> Stream.of(inputArray1);
        inputStream.get().forEach(ex -> System.out.println(ex));
        long count =
                inputStream.get().filter(x -> "Amit".equals(x)).count();

        // ------------------------------------------------------------------------------------------//

        // Joining a String with Prefix , Delimeter and Suffix using Java 8 StringJoiner Class

        String msg = "Hello How are you";
        String[] msgArray = msg.split(" ");
        StringJoiner joiner = new StringJoiner("-", "[", "]");
        for (String inputArr : msgArray) {
            joiner.add(inputArr);
        }
        System.out.println(joiner.toString());

        // ------------------------------------------------------------------------------------------//

        // Joining list elements os String using stream

        List<String> inputList = Arrays.asList("Hello", "How", "are", "you");
        String outputList = inputList.stream()
                .collect(Collectors.joining("-"));
        System.out.println(outputList);

        // ------------------------------------------------------------------------------------------//

        // Count the Vowels with ina String

        String input1 = "hello hello";
        long countVowels = input1.chars().filter((x) -> {
            return (x == 'a' || x == 'e' || x == 'i'
                    || x == 'o' || x == 'u');
        }).count();

        // ------------------------------------------------------------------------------------------//

        // Finding Duplicates in a given input String

        Map<String, Long> out = input1.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Object::toString,
                        Collectors.counting()));
        out.forEach((key, value) -> System.out.println(key + value));

        // ------------------------------------------------------------------------------------------//

        // program to print Max/Min employee salary from the given collection
        Optional<Employee> highestSalariedEmp = empList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        Optional<Employee> lowestSalariedEmp = empList.stream()
                .collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));

        // ------------------------------------------------------------------------------------------//

        //program to print the max salary of an employee from each department
        Map<String, Optional<Employee>> deptSalaryGrp = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.
                                comparing(Employee::getSalary)))));


    }


}


