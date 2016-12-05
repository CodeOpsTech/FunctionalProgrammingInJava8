import java.util.stream.*; 

class Filter {
	public static void main(String []args) {
		IntStream.iterate(0, i -> i + 1).filter(i -> (i % 2) == 0).limit(5).forEach(System.out::println);
	}
}
