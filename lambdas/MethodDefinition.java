import java.util.function.*;
import java.util.*; 

class MethodDefinition {
	public static void printUpperCaseString(String string) {
		System.out.println(string.toUpperCase()); 
	}

	public static void main(String []args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		strings.forEach(MethodDefinition::printUpperCaseString);
	}
}
