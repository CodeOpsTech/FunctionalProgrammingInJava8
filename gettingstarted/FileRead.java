import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileRead {
	public static void main(String []args) throws IOException {
		Files.lines(Paths.get("FileRead.java")).forEach(System.out::println);
	}
}
