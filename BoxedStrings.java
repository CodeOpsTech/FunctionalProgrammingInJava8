import java.util.stream.*; 
import java.util.*; 

class BoxedStrings {
	public static void main(String []args) {
		String boxedString = 
			Arrays
				.asList("eeny", "meeny", "miny", "mo")
				.parallelStream()
				.collect(Collectors.joining(",", "[", "]"));
			System.out.println(boxedString);
	}
}
