import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// somewhere in your code
String content = new String(Files.readAllBytes(Paths.get(fileName)));
