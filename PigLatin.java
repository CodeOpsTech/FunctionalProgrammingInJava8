import java.util.Arrays;
import java.util.List; 

class PigLatin {
	public static void main(String []args) {
		String suffix = "ay"; 
		List<String> strings = Arrays.asList("one", "two", "three", "four");
		strings.forEach(string -> System.out.println(string + suffix)); 
	}
}
