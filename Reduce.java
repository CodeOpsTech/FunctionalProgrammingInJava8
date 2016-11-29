import java.util.stream.*; 

class Reduce {
	public static void main(String []args) {
		System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
	}
}
