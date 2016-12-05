import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate; 

public class RemoveIfMethod {
    public static void main(String []args) {
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("world");

	greeting.removeIf((str -> str.startsWith("h")).negate());
        greeting.forEach(System.out::println);
    }
} 

