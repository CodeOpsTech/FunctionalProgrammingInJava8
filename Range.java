import java.util.stream.*; 

class Range {
	public static void main(String []args) {
		IntStream.range(1, 10).map(x -> x + x).forEach(System.out::println);
	}
}
