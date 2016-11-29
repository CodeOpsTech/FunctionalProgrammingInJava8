import java.util.*;

class InternalIteration {
	public static void main(String []args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		strings.forEach(string -> System.out.println(string));
	}
}
