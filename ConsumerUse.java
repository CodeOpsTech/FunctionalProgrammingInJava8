import java.util.function.*;
import java.util.*; 

class ConsumerUse {
	public static void main(String []args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		Consumer<String> printString = string -> System.out.println(string); 
		strings.forEach(printString);
	}
}
