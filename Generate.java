import java.util.stream.*; 

class Generate {
	public static void main(String []args) {
		IntStream.iterate(0, i -> i + 2).forEach(System.out::println);

	}
}
