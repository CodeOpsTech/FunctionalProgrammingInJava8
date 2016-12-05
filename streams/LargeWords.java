import java.util.stream.*; 
import java.nio.file.*;
import java.util.*; 
import java.nio.charset.Charset;
import java.io.IOException; 

class LargeWords {
	public static void main(String []args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(args[0]), Charset.defaultCharset());
		Map<Integer, List<String>> wordGroups
	 		= lines.stream()
			     .map(line -> line.replaceAll("\\W", " ").split(" "))
			     .flatMap(Arrays::stream) 
			     .filter(str -> str.length() > 10) 
			     .distinct()
			     .sorted()
			     .collect(Collectors.groupingBy(String::length)); 

		wordGroups.forEach( (count, words) -> { 
		 		System.out.printf("word(s) of length %d %n", count);
                   		words.forEach(System.out::println); }); 
	}
}

