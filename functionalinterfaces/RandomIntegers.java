import java.util.stream.Stream;
import java.util.Random;

class RandomInts { 
        public static void main(String []args) {
                Random random = new Random();
                long intsDivisibleBy823 = Stream.generate(random::nextInt)
                    .limit(Integer.MAX_VALUE)
                    .filter(i -> (i % 823) == 0)
                    .count();
                System.out.printf("Found %d integers divisible by 823 (out of %d ints generated)",
                    intsDivisibleBy823, Integer.MAX_VALUE);
        }
}
