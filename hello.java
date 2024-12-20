// hello.java
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
class HelloWorld {
    public static void main(String[] args) {
        // Print Hello, World! to the console
	try {
        System.out.println("Hello, World!");
	Path filepath = Path.of("/etc/lsb-release");
	String content = Files.readString(filepath);
    System.out.println(content);
        } catch (IOException e) {
            // Handle exceptions
            System.err.println("Error reading the file: " + e.getMessage());
        }
}
}
