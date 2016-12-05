import java.util.stream.*; 

class Limit {
	public static void main(String []args) {
		IntStream.iterate(0, i -> i + 2).limit(5).forEach(System.out::println); 

	}
}
