import java.util.function.*;
import java.util.*; 

class MethodRef {
	public static void main(String []args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		Consumer<String> printString = System.out::println; 
		strings.forEach(printString);
	}
}
